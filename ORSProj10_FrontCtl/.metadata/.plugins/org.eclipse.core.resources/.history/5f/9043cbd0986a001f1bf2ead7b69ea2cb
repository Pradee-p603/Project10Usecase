package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PurchaseDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class PurchaseForm extends BaseForm {

    @NotNull(message = "Please enter units ordered")
    private String unitsOrdered;

    @NotNull(message = "Please enter item")
    private String item;

    @NotNull(message = "Please enter order date")
    private Date orderDate;

    @NotNull(message = "Please enter total cost")
    private Long totalCost;

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
    public BaseDTO getDto() {
        PurchaseDTO dto = initDTO(new PurchaseDTO());
        dto.setUnitsOrdered(unitsOrdered);
        dto.setItem(item);
        dto.setOrderDate(orderDate);
        dto.setTotalCost(totalCost);

        return dto;
    }
}
