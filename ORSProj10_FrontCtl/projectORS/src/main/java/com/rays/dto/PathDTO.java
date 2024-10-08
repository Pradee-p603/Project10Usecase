package com.rays.dto;

import com.rays.common.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.LinkedHashMap;

@Entity
@Table(name = "ST_PATH")
public class PathDTO extends BaseDTO {

    @Column(name = "ROUTE_NAME", length = 50)
    private String routeName;

    @Column(name = "INITIALIZATION_DATE")
    private Date initializationDate;

    @Column(name = "PERMITTED_SPEED")
    private Integer permittedSpeed;

    @Column(name = "ASSET_ID", length = 50)
    private String assetId;
    
    
    @Column(name = "ORG_NAME", length = 50)
    private String orgName;

    public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

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
    public String getValue() {
        return assetId;
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
        map.put("routeName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("modifiedBy", modifiedBy);
        return map;
    }
}
