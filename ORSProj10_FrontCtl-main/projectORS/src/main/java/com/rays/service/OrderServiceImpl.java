package com.rays.service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OrderDAOInt; // Updated import
import com.rays.dto.OrderDTO; // Updated import
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<OrderDTO, OrderDAOInt> implements OrderServiceInt {
}
