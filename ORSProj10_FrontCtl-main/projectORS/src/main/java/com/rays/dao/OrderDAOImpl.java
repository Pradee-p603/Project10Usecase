package com.rays.dao;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.OrderDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDAOImpl extends BaseDAOImpl<OrderDTO> implements OrderDAOInt {

    @Override
    protected List<Predicate> getWhereClause(OrderDTO dto, CriteriaBuilder builder, Root<OrderDTO> qRoot) {
        List<Predicate> whereCondition = new ArrayList<>();
        if (!isZeroNumber(dto.getId()) && dto.getId() != null) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }
        if (isNotNull(dto.getProductName())) {
            whereCondition.add(builder.like(qRoot.get("productName"), dto.getProductName() + "%" ));
        }
        if (isNotNull(dto.getProductId())) {
            whereCondition.add(builder.like(qRoot.get("productId"), dto.getProductId() + "%"));
        }
        if (isNotNull(dto.getDob())) {
            whereCondition.add(builder.equal(qRoot.get("dob"), dto.getDob()));
        }
        if (dto.getQuantity() != null) {
            whereCondition.add(builder.equal(qRoot.get("quantity"), dto.getQuantity()));
        }
        if (dto.getAmount() != null) {
            whereCondition.add(builder.equal(qRoot.get("amount"), dto.getAmount()));
        }

        return whereCondition;
    }

    @Override
    public Class<OrderDTO> getDTOClass() {
        return OrderDTO.class;
    }

    @Override
    protected void populate(OrderDTO dto, UserContext userContext) {
        // Implement this method as needed
    }
}
