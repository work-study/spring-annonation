package com.netease.kaola.spring.annotation.ioc.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;

/**
 * profile:根据当前环境动态的激活和切换一系列组件的功能
 *
* */
@PropertySource("classpath:/jdbc.properties")
@Configuration
public class MainConfigOfProfile implements EmbeddedValueResolverAware {

    @Value("${jdbc.user}")
    private String user;

    private StringValueResolver stringValueResolver;

    private String driverClass;
    @Bean
    @Profile("test")
    public DataSource dataSourceTest(@Value("${jdbc.password}") String password) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }
    @Bean
    @Profile("dev")
    public DataSource dataSourceDev() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/shoppingmall");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }
    @Bean
    @Profile("pro")
    public DataSource dataSourcePro() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/world");
        dataSource.setDriverClass(driverClass);
        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.stringValueResolver=resolver;
        this.driverClass= stringValueResolver.resolveStringValue("${jdbc.driver}");

    }
}
