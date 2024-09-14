package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ShoppingCartDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ShoppingCartForm extends BaseForm {

    @NotNull(message = "Please enter name")
    private String name;

    @NotNull(message = "Please enter product")
    private String product;

    @NotNull(message = "Please enter date")
    private Date date;

    @NotNull(message = "Please enter quantity")
    private Long quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public BaseDTO getDto() {
        ShoppingCartDTO dto = initDTO(new ShoppingCartDTO());
        dto.setName(name);
        dto.setProduct(product);
        dto.setDate(date);
        dto.setQuantity(quantity);

        return dto;
    }
}
