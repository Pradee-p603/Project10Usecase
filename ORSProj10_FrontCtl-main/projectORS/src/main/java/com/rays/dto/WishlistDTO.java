package com.rays.dto;

import com.rays.common.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.LinkedHashMap;

@Entity
@Table(name = "ST_WISHLIST")
public class WishlistDTO extends BaseDTO {

    @Column(name = "PRODUCT", length = 50)
    private String product;

    @Column(name = "USERNAME", length = 50)
    private String username;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "REMARK", length = 255)
    private String remark;

    // Getters and Setters

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getValue() {
        return product;
    }

    @Override
    public String getUniqueKey() {
        return "username"; // Assuming uniqueness is based on username
    }

    @Override
    public String getUniqueValue() {
        return username;
    }

    @Override
    public String getLabel() {
        return "Product";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("date", "desc"); // Ordering by date in descending order
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("username", username);
        return map;
    }
}
