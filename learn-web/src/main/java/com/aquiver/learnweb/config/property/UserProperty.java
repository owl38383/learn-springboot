package com.aquiver.learnweb.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * @Classname User
 * @Description 描述
 * @Date 2021/3/4 16:00
 * @Author 刁闯
 */
// 注入组件
@Component
// 加载指定配置文件
@PropertySource(value = {"classpath:config/application.yml"})
// 指定配置前缀
@ConfigurationProperties(prefix = "user")
// 增加验证
@Validated
public class UserProperty implements Serializable {
    private String nickname;
    private String password;
    private int age;
    private String email;
    private Date birther;

    public Date getBirther() {
        return birther;
    }

    public void setBirther(Date birther) {
        this.birther = birther;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", birther=" + birther +
                '}';
    }
}
