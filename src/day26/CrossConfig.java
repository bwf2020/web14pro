package day26;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class CrossConfig implements WebMvcConfigurer {

	
	public CrossConfig() {
		
		System.out.println("跨域配置类...............");
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET","POST").maxAge(3600);

	}

}
