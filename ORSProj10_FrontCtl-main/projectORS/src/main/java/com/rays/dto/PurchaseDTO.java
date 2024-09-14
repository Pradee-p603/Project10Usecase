package com.rays.dto;

import com.rays.common.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.LinkedHashMap;

@Entity
@Table(name = "ST_PURCHASE")
public class PurchaseDTO extends BaseDTO {

    @Column(name = "UNITS_ORDERED", length = 50)
    private String unitsOrdered;

    @Column(name = "ITEM", length = 50)
    private String item;

    @Column(name = "ORDER_DATE")
    private Date orderDate;

    @Column(name = "TOTAL_COST")
    private Long totalCost;
    
	@Column(name = "ORG_NAME", length = 50)
	private String orgName;


    public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getUnitsOrdered() {
        return unitsOrdered;
    }

    public void setUnitsOrdered(String unitsOrdered) {
        this.unitsOrdered = unitsOrdered;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String getValue() {
        return item;
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
        map.put("unitsOrdered", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("modifiedBy", modifiedBy);
        return map;
    }
}
