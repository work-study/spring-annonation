package com.netease.kaola.spring.annotation.ioc.config;

import com.netease.kaola.spring.annotation.ioc.bean.Person;
import com.netease.kaola.spring.annotation.ioc.condition.LinuxCondition;
import com.netease.kaola.spring.annotation.ioc.condition.WindowCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
public class MainConfig02 {

   /**
    * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
    * @see ConfigurableBeanFactory#SCOPE_SINGLETON
    *
    * prototype:多实例
    * singleton：单例（默认）
   * */
    @Bean
    @Lazy
    public Person person() {
        System.out.println("pppp......");
        return new Person(2,"zwzw");
    }

    @Bean("bill")
    @Conditional( {WindowCondition.class})
    public Person person01() {
        return new Person(3,"bill");
    }

    @Bean("linux")
    @Conditional({LinuxCondition.class})
    public Person person02() {
        return new Person(4,"linux");
    }
}
