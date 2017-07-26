package com.test.spring;

import com.test.spring.init_destroyBean.Dog;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

//@ComponentScan("com.test.spring")
// 扫描那些包，排除哪些类
@ComponentScan(basePackages = "com.test.spring", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {UserService.class})) // 过滤
@Configuration
public class AnnotationScan {
}
