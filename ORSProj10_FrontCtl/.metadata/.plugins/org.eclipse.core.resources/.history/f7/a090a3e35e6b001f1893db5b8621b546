package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ProductManagementDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class ProductManagementForm extends BaseForm {

    @NotNull(message = "Please enter name")
    private String name;

    @NotNull(message = "Please enter description")
    private String description;

    @NotNull(message = "Please enter price")
    private Double price;

    @NotNull(message = "Please enter date of purchase")
    private Date dateOfPurchase;

    @NotNull(message = "Please enter category")
    private String category;

    // Getters and Setters

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

    // Overridden method to convert form data to DTO

    @Override
    public BaseDTO getDto() {
        ProductManagementDTO dto = initDTO(new ProductManagementDTO());
        dto.setName(name);
        dto.setDescription(description);
        dto.setPrice(price);
        dto.setDateOfPurchase(dateOfPurchase);
        dto.setCategory(category);

        return dto;
    }
}
