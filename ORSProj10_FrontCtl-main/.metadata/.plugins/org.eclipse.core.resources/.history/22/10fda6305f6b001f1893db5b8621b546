package com.rays.dao;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.ProductManagementDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductManagementDAOImpl extends BaseDAOImpl<ProductManagementDTO> implements ProductManagementDAOInt {

    @Override
    protected List<Predicate> getWhereClause(ProductManagementDTO dto, CriteriaBuilder builder, Root<ProductManagementDTO> qRoot) {
        List<Predicate> whereCondition = new ArrayList<>();
        if (!isZeroNumber(dto.getId()) && dto.getId() != null) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }
        if (isNotNull(dto.getName())) {
            whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%" ));
        }
        if (isNotNull(dto.getDescription())) {
            whereCondition.add(builder.like(qRoot.get("description"), dto.getDescription() + "%"));
        }
        if (dto.getPrice() != null) {
            whereCondition.add(builder.equal(qRoot.get("price"), dto.getPrice()));
        }
        if (isNotNull(dto.getDateOfPurchase())) {
            whereCondition.add(builder.equal(qRoot.get("dateOfPurchase"), dto.getDateOfPurchase()));
        }
        if (isNotNull(dto.getCategory())) {
            whereCondition.add(builder.like(qRoot.get("category"), dto.getCategory() + "%"));
        }

        return whereCondition;
    }

    @Override
    public Class<ProductManagementDTO> getDTOClass() {
        return ProductManagementDTO.class;
    }

    @Override
    protected void populate(ProductManagementDTO dto, UserContext userContext) {
        // Implement this method as needed
    }
}
