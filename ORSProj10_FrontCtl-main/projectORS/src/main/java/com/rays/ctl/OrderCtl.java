package com.rays.ctl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.OrderDTO; // Update to OrderDTO
import com.rays.form.OrderForm; // Update to OrderForm
import com.rays.service.OrderServiceInt; // Update to OrderServiceInt

@RestController
@RequestMapping("/Order") // Update request mapping
public class OrderCtl extends BaseCtl<OrderForm, OrderDTO, OrderServiceInt> { // Update generics

    @Autowired
    private OrderServiceInt orderService; // Inject the appropriate service

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);
        
        // Sample data for order status list
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "laptop");
        map.put(2, "mobile");
        map.put(3, "desktop");
        map.put(4, "book");
        map.put(5, "pen");
        map.put(6, "shoes");

        res.addResult("productList", map);
        return res;
        
        // Sample data for customer list
        // Assuming you have a method to fetch customers
        // List<CustomerDTO> customerList = customerService.search(new CustomerDTO(), userContext);
        // Map<Integer, String> customerMap = new HashMap<>();
        // for (CustomerDTO customer : customerList) {
        //     customerMap.put(customer.getId(), customer.getName());
        // }
        // res.addResult("customerList", customerMap);
        
        
        
       
    	
    	
	/*
	 * @GetMapping("/preload") public ORSResponse preload() {
	 * System.out.println("inside preload"); ORSResponse res = new
	 * ORSResponse(true); OrderDTO dto = new OrderDTO();
	 * 
	 * List<DropdownList> list = orderService.search(dto, userContext);
	 * res.addResult("productList", list); return res; }
	 */
    }
}

