package com.rays.form;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PathDTO;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class PathForm extends BaseForm {

    @NotNull(message = "Please enter route name")
    private String routeName;

    @NotNull(message = "Please enter initialization date")
    private Date initializationDate;

    @NotNull(message = "Please enter permitted speed")
    private Integer permittedSpeed;

    @NotNull(message = "Please enter asset ID")
    private String assetId;

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public Date getInitializationDate() {
        return initializationDate;
    }

    public void setInitializationDate(Date initializationDate) {
        this.initializationDate = initializationDate;
    }

    public Integer getPermittedSpeed() {
        return permittedSpeed;
    }

    public void setPermittedSpeed(Integer permittedSpeed) {
        this.permittedSpeed = permittedSpeed;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    @Override
    public BaseDTO getDto() {
        PathDTO dto = initDTO(new PathDTO());
        dto.setRouteName(routeName);
        dto.setInitializationDate(initializationDate);
        dto.setPermittedSpeed(permittedSpeed);
        dto.setAssetId(assetId);

        return dto;
    }
}
