package com.rays.dao;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.WishlistDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class WishlistDAOImpl extends BaseDAOImpl<WishlistDTO> implements WishlistDAOInt {

    @Override
    protected List<Predicate> getWhereClause(WishlistDTO dto, CriteriaBuilder builder, Root<WishlistDTO> qRoot) {
        List<Predicate> whereCondition = new ArrayList<>();
        
        if (!isZeroNumber(dto.getId()) && dto.getId() != null) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }
        if (isNotNull(dto.getProduct())) {
            whereCondition.add(builder.like(qRoot.get("product"), dto.getProduct() + "%"));
        }
        if (isNotNull(dto.getUsername())) {
            whereCondition.add(builder.like(qRoot.get("username"), dto.getUsername() + "%"));
        }
        if (isNotNull(dto.getDate())) {
            whereCondition.add(builder.equal(qRoot.get("date"), dto.getDate()));
        }
        if (isNotNull(dto.getRemark())) {
            whereCondition.add(builder.like(qRoot.get("remark"), dto.getRemark() + "%"));
        }

        return whereCondition;
    }

    @Override
    public Class<WishlistDTO> getDTOClass() {
        return WishlistDTO.class;
    }

    @Override
    protected void populate(WishlistDTO dto, UserContext userContext) {
        // Implement this method as needed
    }
}
