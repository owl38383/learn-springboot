package com.aquiver.learnweb.controller;

import com.aquiver.learnweb.entity.Order;
import com.aquiver.learnweb.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname OrderController
 * @Description 描述
 * @Date 2021/3/24 18:25
 * @Author 刁闯
 */

@RequestMapping("order")
@RestController
public class OrderController {

    @Resource
    OrderServiceImpl orderService;

    @RequestMapping("/add/{name}")
    public Object add(@PathVariable("name") String name){
        Order order = new Order();
        order.setName(name);
        order.setCreateTime(System.currentTimeMillis());
        return orderService.add(order);
    }

    @RequestMapping("/get/{id}")
    public Object add(@PathVariable("id") Long id){
        return orderService.getById(id);
    }
}
