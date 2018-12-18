package com.netease.kaola.spring.annotation.ioc.config;

import com.netease.kaola.spring.annotation.ioc.bean.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@PropertySource(value = {"classpath:/yellow.properties"})
@Configuration
public class MainConfigOfPropertyValues {
	
	@Bean
	public Yellow yellow(){
		return new Yellow();
	}

}
