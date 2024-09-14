package com.rays.ctl;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ProductManagementDTO;
import com.rays.form.ProductManagementForm;
import com.rays.service.ProductManagementServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/ProductManagement")
public class ProductManagementCtl extends BaseCtl<ProductManagementForm, ProductManagementDTO, ProductManagementServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);

        // Sample data for category list
        HashMap<Integer, String> categoryMap = new HashMap<>();
        categoryMap.put(1, "Electronics");
        categoryMap.put(2, "Furniture");
        categoryMap.put(3, "Clothing");

        res.addResult("categoryList", categoryMap);

        return res;
    }
}
