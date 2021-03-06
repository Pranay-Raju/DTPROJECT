/*package com.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
@EnableWebMvc
@ComponentScan("com.spring")
public class WebConfig extends WebMvcConfigurerAdapter{
	
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
	InternalResourceViewResolver internalResourceViewResolver= new InternalResourceViewResolver();
	internalResourceViewResolver.setPrefix("/WEB-INF/views/");
	internalResourceViewResolver.setSuffix(".jsp");
	return internalResourceViewResolver;
	}
	

	public void addResourceHandlers(ResourceHandlerRegistry registry){
	registry.addResourceHandler("/resources/**")
	.addResourceLocations("/resources/");
	}
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver getCommonsMultipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(20971520); // 20MB
		multipartResolver.setMaxInMemorySize(1048576);	// 1MB
		return multipartResolver;
	}

}*/