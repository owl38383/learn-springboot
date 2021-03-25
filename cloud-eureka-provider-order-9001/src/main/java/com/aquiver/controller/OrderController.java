package com.aquiver.controller;

import com.aquiver.entity.Order;
import com.aquiver.mapper.UserMapper;
import com.aquiver.service.OrderService;
import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

/**
 * @Classname OrderController
 * @Description 描述
 * @Date 2021/3/25 15:41
 * @Author 刁闯
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    private OrderService<Order> orderService;



    @RequestMapping("add")
    public Object add(@RequestBody Order order) {
        int i = new Random().nextInt(2 << 4);
        order.setAge(i);
        order.setCreateTime(new Date());
        return orderService.insert(order);
    }

    @RequestMapping("get/{id}")
    @DS("slave_1")
    public Object getById(@PathVariable("id") Long id) {
        return orderService.selectById(id);
    }

    @RequestMapping("queryList")
    @DS("slave_1")
    public Object queryList() {
        return orderService.selectList(null);
    }

    @Resource
    UserMapper userMapper;

    @RequestMapping("queryUser")
    @DS("oracle")
    public Object queryUser() {
        return userMapper.selectList(null);
    }
}
