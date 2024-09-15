package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.WishlistDTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class WishlistForm extends BaseForm {

    @NotNull(message = "Please enter product")
    @Size(max = 50, message = "Product name should not exceed 50 characters")
    private String product;

    @NotNull(message = "Please enter username")
    @Size(max = 50, message = "Username should not exceed 50 characters")
    private String username;

    @NotNull(message = "Please enter date")
    private Date date;
    @NotNull(message = "Please enter remark")
    @Size(max = 255, message = "Remark should not exceed 255 characters")
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
    public BaseDTO getDto() {
        WishlistDTO dto = initDTO(new WishlistDTO());
        dto.setProduct(product);
        dto.setUsername(username);
        dto.setDate(date);
        dto.setRemark(remark);

        return dto;
    }
}
