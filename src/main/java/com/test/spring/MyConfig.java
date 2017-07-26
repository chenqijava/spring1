package com.test.spring;

import com.test.spring.init_destroyBean.Cat;
import com.test.spring.init_destroyBean.Dog;
import com.test.spring.init_destroyBean.Pig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    // bean的三种装配方式
    // a. 直接new 对象创建
    @Bean
    @Scope("prototype")
    public MyBean createMyBean()
    {
        return  new MyBean();
    }
    // b. 通过实现FactoryBean<?>
    @Bean
    public RunnableFactoryBean createRunnable()
    {
        return new RunnableFactoryBean();
    }

    @Bean
    public JeepFactoryBean createJeep()
    {
        return  new JeepFactoryBean();
    }

    @Bean
    public CarFactory createCarFactory()
    {
        return  new CarFactory();
    }
    // c. 如果需要参数的话他会自动在当前对象池中找
    // 在装配过程中，factory会在当前对象池中查找
    @Bean
    public Car createCar(CarFactory factory)
    {
       return factory.create();
    }

    @Bean
    public Cat createCat()
    {
        return new Cat();
    }

    @Bean(initMethod = "initial", destroyMethod = "destory")
    public Dog createDog()
    {
        return new Dog();
    }

    @Bean
    public Pig createPig()
    {
        return new Pig();
    }

    @Bean
    @Primary //只能在类内部可见，不能被外部注入、访问
    public UserDao createUserDao()
    {
        return new UserDao();
    }
}
