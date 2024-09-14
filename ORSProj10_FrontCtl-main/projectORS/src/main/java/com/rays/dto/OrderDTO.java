package com.rays.dto;

import com.rays.common.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.LinkedHashMap;

@Entity
@Table(name = "ST_ORDER")
public class OrderDTO extends BaseDTO {

    @Column(name = "PRODUCT_NAME", length = 50)
    private String productName;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "DATE_OF_BIRTH")
    private Date dob;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "QUANTITY")
    private Long quantity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getValue() {
        return productName;
    }
	/*
	 * @Override public String getValue() { return dob+""; }
	 */

    @Override
    public String getUniqueKey() {
        return "productName";
    }

    @Override
    public String getUniqueValue() {
        return productName;
    }

    @Override
    public String getLabel() {
        return "ProductName";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("productName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("productName", productName);
        return map;
    }
}
