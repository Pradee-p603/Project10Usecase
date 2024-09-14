package com.rays.ctl;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PurchaseDTO; // Updated import
import com.rays.form.PurchaseForm; // Updated import
import com.rays.service.PurchaseServiceInt; // Updated import
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/Purchase") // Updated request mapping
public class PurchaseCtl extends BaseCtl<PurchaseForm, PurchaseDTO, PurchaseServiceInt> { // Updated class name and types

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);
        
        // Sample data for product list
        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Phone");
        productMap.put(2, "Laptop");
        productMap.put(3, "Desktop");
        productMap.put(4, "Mobile");
        productMap.put(5, "Shoes");

        res.addResult("productList", productMap);
        
        return res;
    }
}
