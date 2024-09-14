package com.rays.dao;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.ShoppingCartDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ShoppingCartDAOImpl extends BaseDAOImpl<ShoppingCartDTO> implements ShoppingCartDAOInt {

    @Override
    protected List<Predicate> getWhereClause(ShoppingCartDTO dto, CriteriaBuilder builder, Root<ShoppingCartDTO> qRoot) {
        List<Predicate> whereCondition = new ArrayList<>();
        if (!isZeroNumber(dto.getId()) && dto.getId() != null) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }
        if (isNotNull(dto.getName())) {
            whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%" ));
        }
        if (isNotNull(dto.getProduct())) {
            whereCondition.add(builder.like(qRoot.get("product"), dto.getProduct()+ "%"));
        }
        if (isNotNull(dto.getDate())) {
            whereCondition.add(builder.equal(qRoot.get("date"), dto.getDate()));
        }
        if (dto.getQuantity() != null) {
            whereCondition.add(builder.equal(qRoot.get("quantity"), dto.getQuantity()));
        }

        return whereCondition;
    }

    @Override
    public Class<ShoppingCartDTO> getDTOClass() {
        return ShoppingCartDTO.class;
    }

    @Override
    protected void populate(ShoppingCartDTO dto, UserContext userContext) {
        // Implement this method as needed
    }
}
