package com.rays.ctl;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PathDTO;
import com.rays.form.PathForm;
import com.rays.service.PathServiceInt; // Ensure this is the correct service interface for PathDTO
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/Path")
public class PathCtl extends BaseCtl<PathForm, PathDTO, PathServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);
        
        // Sample data for some kind of path-related list
        HashMap<Integer, String> pathMap = new HashMap<>();
        pathMap.put(1, "0921");
        pathMap.put(2, "0981");
        pathMap.put(3, "1234");

        res.addResult("pathList", pathMap);
        
        return res;
    }
}
