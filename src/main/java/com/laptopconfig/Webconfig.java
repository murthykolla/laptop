package com.laptopconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
public class Webconfig {
	
	
	
	@Configuration
	@EnableWebMvc
	@ComponentScan(basePackages = { "com.lap" })
	public class WebConfig implements WebMvcConfigurer{

	}

}
