package com.aquiver.learnweb.service.impl;

import com.aquiver.learnweb.entity.Order;
import com.aquiver.learnweb.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname OrderServiceImpl
 * @Description 描述
 * @Date 2021/3/24 18:26
 * @Author 刁闯
 */
@Service
public class OrderServiceImpl {

    @Resource
    OrderMapper orderMapper;

    public Long add(Order order){
        return orderMapper.add(order);
    }

    public Object getById(Long id) {
        return orderMapper.getById(id);
    }
}
