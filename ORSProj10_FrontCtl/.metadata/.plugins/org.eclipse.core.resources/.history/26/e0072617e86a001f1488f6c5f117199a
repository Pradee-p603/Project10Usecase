package com.rays.dao;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.PathDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PathDAOImpl extends BaseDAOImpl<PathDTO> implements PathDAOInt {

    @Override
    protected List<Predicate> getWhereClause(PathDTO dto, CriteriaBuilder builder, Root<PathDTO> qRoot) {
        List<Predicate> whereCondition = new ArrayList<>();
        if (!isZeroNumber(dto.getId()) && dto.getId() != null) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }
        if (isNotNull(dto.getRouteName())) {
            whereCondition.add(builder.like(qRoot.get("routeName"), dto.getRouteName() + "%"));
        }
        if (isNotNull(dto.getInitializationDate())) {
            whereCondition.add(builder.equal(qRoot.get("initializationDate"), dto.getInitializationDate()));
        }
        if (dto.getPermittedSpeed() != null) {
            whereCondition.add(builder.equal(qRoot.get("permittedSpeed"), dto.getPermittedSpeed()));
        }
        if (isNotNull(dto.getAssetId())) {
            whereCondition.add(builder.like(qRoot.get("assetId"), dto.getAssetId() + "%"));
        }

        return whereCondition;
    }

    @Override
    public Class<PathDTO> getDTOClass() {
        return PathDTO.class;
    }

    @Override
    protected void populate(PathDTO dto, UserContext userContext) {
        // Implement this method as needed
    }
}
