package com.cxf.rest.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
/**
 * 
 * @author Anil Kumar
 *
 */
@Configuration
@ComponentScan(basePackages="com.cxf.rest.example")
@ImportResource({"classpath:cxf.xml"})
public class HindustaniAirwaysConfig {

	@Bean
	PropertySourcesPlaceholderConfigurer propertyConfig() {
		
		return new PropertySourcesPlaceholderConfigurer();
	}
}
