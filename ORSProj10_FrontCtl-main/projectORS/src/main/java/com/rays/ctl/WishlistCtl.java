package com.rays.ctl;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.WishlistDTO;
import com.rays.form.WishlistForm;
import com.rays.service.WishlistServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/Wishlist")
public class WishlistCtl extends BaseCtl<WishlistForm, WishlistDTO, WishlistServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);
        
        // Sample data for product list
        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Phone");
        productMap.put(2, "Laptop");
        productMap.put(3, "Desktop");

        res.addResult("productList", productMap);
        
        // Add more preload data if necessary
        // For example, add user-specific data or other relevant information

        return res;
    }
}
