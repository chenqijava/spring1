package com.test.spring;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Runnable>{
    public Runnable getObject() throws Exception {
        return () -> {};
    }

    public Class<?> getObjectType() {
        return Runnable.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
