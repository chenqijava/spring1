package com.test.spring.init_destroyBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//c. 使用注解声明 @PostConstruct @PreDestroy
public class Pig {
    @PostConstruct
    public void initial()
    {
        System.out.println("*****initial****");
    }
    @PreDestroy
    public void destory()
    {
        System.out.println("*****destory****");
    }
}
