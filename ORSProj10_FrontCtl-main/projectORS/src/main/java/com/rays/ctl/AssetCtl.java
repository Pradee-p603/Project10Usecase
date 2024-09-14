package com.rays.ctl;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.AssetDTO;
import com.rays.form.AssetForm;
import com.rays.service.AssetServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/Asset")
public class AssetCtl extends BaseCtl<AssetForm, AssetDTO, AssetServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);
        
        // Sample data for product list
        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Red");
        productMap.put(2, "Blue");
        productMap.put(3, "Black");
        productMap.put(4, "White");

        res.addResult("colorList", productMap);
        
       
        
        return res;
    }
}
