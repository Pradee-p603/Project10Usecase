package com.rays.ctl;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ShoppingCartDTO;
import com.rays.form.ShoppingCartForm;
import com.rays.service.ShoppingCartServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/ShoppingCart")
public class ShoppingCartCtl extends BaseCtl<ShoppingCartForm, ShoppingCartDTO, ShoppingCartServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);
        
        // Sample data for product list
        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Phone");
        productMap.put(2, "Laptop");
        productMap.put(3, "Desktop");

        res.addResult("productList", productMap);
        
       
        
        return res;
    }
}
