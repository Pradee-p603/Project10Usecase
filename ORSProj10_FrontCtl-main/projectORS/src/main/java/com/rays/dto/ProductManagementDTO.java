package com.rays.dto;

import com.rays.common.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.LinkedHashMap;

@Entity
@Table(name = "ST_PRODUCT_MANAGEMENT")
public class ProductManagementDTO extends BaseDTO {

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "DESCRIPTION", length = 255)
    private String description;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "DATE_OF_PURCHASE")
    private Date dateOfPurchase;

    @Column(name = "CATEGORY", length = 50)
    private String category;


    @Column(name = "ORG_NAME", length = 50)
    private String orgName;

    // Getters and Setters

    public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Overridden methods

    @Override
    public String getValue() {
        return category;
    }

    @Override
    public String getUniqueKey() {
        return "orgName";
    }

    @Override
    public String getUniqueValue() {
        return orgName;
    }

    @Override
    public String getLabel() {
        return "orgName";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("name", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("modifiedBy", modifiedBy);
        return map;
    }
}
