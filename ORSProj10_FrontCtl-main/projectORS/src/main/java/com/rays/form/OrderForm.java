package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class OrderForm extends BaseForm {

    @NotNull(message = "Please enter product name")
    private String productName;

    @NotNull(message = "Please enter product ID")
    private Long productId;

    @NotNull(message = "Please enter date of birth")
    private Date dob;

    @NotNull(message = "Please enter amount")
    private Double amount;

    @NotNull(message = "Please enter quantity")
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
    public BaseDTO getDto() {
        OrderDTO dto = initDTO(new OrderDTO());
        dto.setProductName(productName);
        dto.setProductId(productId);
        dto.setDob(dob);
        dto.setAmount(amount);
        dto.setQuantity(quantity);

        return dto;
    }
}
