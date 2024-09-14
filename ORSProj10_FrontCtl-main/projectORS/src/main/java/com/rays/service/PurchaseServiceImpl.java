package com.rays.service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PurchaseDAOInt; // Updated import
import com.rays.dto.PurchaseDTO; // Updated import
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PurchaseServiceImpl extends BaseServiceImpl<PurchaseDTO, PurchaseDAOInt> implements PurchaseServiceInt { // Updated class name and type
}
