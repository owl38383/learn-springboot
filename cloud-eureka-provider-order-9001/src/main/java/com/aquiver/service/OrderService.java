package com.aquiver.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.util.List;

public interface OrderService<Order> {

    public int deleteById(Long id);

    int insert(Order record);

    Order selectById(Long id);

    int update(Order record);

    int updateById(Order record);

    List<Order> selectList(Wrapper wrapper);
}

