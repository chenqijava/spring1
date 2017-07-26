package com.test.spring;

import com.test.spring.init_destroyBean.Cat;
import com.test.spring.init_destroyBean.Dog;
import com.test.spring.init_destroyBean.Pig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class, User.class, UserDao.class, UserService.class, UserController.class);
        // a.使用扫描包
        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.test.spring");
        // b.使用配置对象
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("createMyBean"));
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getBean("createRunnable"));
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("createJeep"));

        System.out.println(context.getBean("&createJeep"));
        System.out.println(context.getBean(JeepFactoryBean.class));

        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean("createCar"));

        // bean装配时初始化和销毁方法调用
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Pig.class));

        // 新的装配方式 使用@Component  没有明确角色
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBeansOfType(User.class));
        System.out.println(context.getBean("myUser"));

        // 装配方式 @Repository   一般用在数据层上
        //System.out.println(context.getBean(UserDao.class));
        // @Service   一般用在业务层
        System.out.println(context.getBean(UserService.class));
        // @Controller  一般用在展现层上
        System.out.println(context.getBean(UserController.class));

        context.getBean(User.class).show();
        context.close();
    }
}
