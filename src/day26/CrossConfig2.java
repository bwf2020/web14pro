package day26;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;



public class CrossConfig2 {


	public CorsFilter getCorsFilter() {
		
		 CorsConfiguration config = new CorsConfiguration();
		 
		 config.addAllowedOrigin("*");
		 config.addAllowedMethod("*");
		 config.addAllowedHeader("*");
		 config.setAllowCredentials(true);
		
		 UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
		
		 configSource.registerCorsConfiguration("/**", config);
		 
		 return new CorsFilter(configSource);
	}
	
}
