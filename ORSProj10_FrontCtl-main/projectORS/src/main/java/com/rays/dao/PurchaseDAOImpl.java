package com.rays.dao;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.PurchaseDTO; // Updated import
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PurchaseDAOImpl extends BaseDAOImpl<PurchaseDTO> implements PurchaseDAOInt { // Updated class name and type

    @Override
    protected List<Predicate> getWhereClause(PurchaseDTO dto, CriteriaBuilder builder, Root<PurchaseDTO> qRoot) { // Updated type
        List<Predicate> whereCondition = new ArrayList<>();
        if (!isZeroNumber(dto.getId()) && dto.getId() != null) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }
        if (isNotNull(dto.getUnitsOrdered())) {
            whereCondition.add(builder.equal(qRoot.get("unitsOrdered"), dto.getUnitsOrdered()));
        }
        if (isNotNull(dto.getItem())) {
            whereCondition.add(builder.like(qRoot.get("item"), dto.getItem() + "%"));
        }
        if (isNotNull(dto.getOrderDate())) {
            whereCondition.add(builder.equal(qRoot.get("orderDate"), dto.getOrderDate()));
        }
        if (dto.getTotalCost() != null) {
            whereCondition.add(builder.equal(qRoot.get("totalCost"), dto.getTotalCost()));
        }

        return whereCondition;
    }

    @Override
    public Class<PurchaseDTO> getDTOClass() { // Updated return type
        return PurchaseDTO.class;
    }

    @Override
    protected void populate(PurchaseDTO dto, UserContext userContext) {
        // Implement this method as needed
    }
}