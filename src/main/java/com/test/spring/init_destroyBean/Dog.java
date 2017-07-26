package com.test.spring.init_destroyBean;

//b. 在bean装配时，声明初始化函数和销毁函数 @Bean(initMethod = "initial", destroyMethod = "destory")
public class Dog {
    public void initial()
    {
        System.out.println("*****initial****");
    }

    public void destory()
    {
        System.out.println("*****destory****");
    }
}
