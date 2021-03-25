package com.aquiver.service.impl;

import com.aquiver.entity.Order;
import com.aquiver.mapper.OrderMapper;
import com.aquiver.service.OrderService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService<Order> {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public int deleteById(Long id) {
        return orderMapper.deleteById(id);
    }

    @Override
    public int insert(Order record) {
        return orderMapper.insert(record);
    }


    @Override
    public Order selectById(Long id) {
        return orderMapper.selectById(id);
    }

    @Override
    public int update(Order record) {
        return orderMapper.update(record, null);
    }

    @Override
    public int updateById(Order record) {
        return orderMapper.updateById(record);
    }

    @Override
    public List<Order> selectList(Wrapper wrapper) {
        return orderMapper.selectList(wrapper);
    }

}

