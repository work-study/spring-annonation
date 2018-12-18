package com.netease.kaola.spring.annotation.ioc.config;

import com.netease.kaola.spring.annotation.ioc.bean.Color;
import com.netease.kaola.spring.annotation.ioc.bean.ColorFactoryBean;
import com.netease.kaola.spring.annotation.ioc.bean.Person;
import com.netease.kaola.spring.annotation.ioc.bean.Red;
import com.netease.kaola.spring.annotation.ioc.condition.MyBeanDefinationRegister;
import com.netease.kaola.spring.annotation.ioc.condition.MySelectImport;
import org.springframework.context.annotation.*;

@Configuration
/*@ComponentScan(value = "com.netease",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
})*/
@ComponentScan(value = "com.netease",includeFilters = {
        /*@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.REGEX,pattern = "PersonService")*/
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
},useDefaultFilters = false)
@Import({Color.class, Red.class, MySelectImport.class,MyBeanDefinationRegister.class})

public class MainConfig {

    //id默认是方法名,里面的也可以指定id的值
    @Bean("person")
    public Person person01() {
        return new Person(1,"zw");
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
