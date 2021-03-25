package com.aquiver.common.entity;

/**
 * @Classname Order
 * @Description 描述
 * @Date 2021/3/24 18:34
 * @Author 刁闯
 */

public class Order {

    private Long id;
    private String name;
    private Long createTime;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
