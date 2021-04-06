package com.aquiver.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description 描述
 * @Date 2021/4/6 14:06
 * @Author 刁闯
 */

@RestController
@RequestMapping(value = "")
public class UserController {

		@NacosValue(value = "${user.birther:2021}",autoRefreshed = true)
		private Object user;

		@RequestMapping(value = "/get")
		public Object get() {
				return user;
		}
}
