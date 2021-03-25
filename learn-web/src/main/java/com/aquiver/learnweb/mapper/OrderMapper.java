package com.aquiver.learnweb.mapper;

import com.aquiver.learnweb.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Classname OrderMapper
 * @Description 描述
 * @Date 2021/3/24 18:27
 * @Author 刁闯
 */
@Mapper
public interface OrderMapper {

    @Insert("insert into order(name,create_time) values (#{name},#{createTime})")
    Long add(Order order);

    @Select("select * from order where id = #{id}")
    Order getById(Long id);
}
