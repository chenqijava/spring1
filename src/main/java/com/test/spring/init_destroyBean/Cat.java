package com.test.spring.init_destroyBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
// Bean初始化和销毁时方法调用的三种方法
// a.实现InitializingBean，DisposableBean接口
public class Cat implements InitializingBean,DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("=========afterPropertiesSet==========");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("=========destroy==========");
    }
}
