package com.test.spring;

import com.test.spring.init_destroyBean.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

@Component("myUser")
public class User {
    // 依赖注入
//    @Autowired
//    private UserDao userDao;

    // 当出现多个UserDao时如何分辨注入哪一个
    // spring 自带的
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    //JSR 250的注解
    @Resource
    private Car car;

    // JSR-330注解
    @Inject
    private Cat cat;
    public void show() {
        System.out.println("----show---");
        System.out.println(userDao);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
