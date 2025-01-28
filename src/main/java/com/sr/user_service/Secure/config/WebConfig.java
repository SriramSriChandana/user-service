package com.sr.user_service.Secure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")  // Your React app
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Methods allowed
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true);  // Allow credentials
    }
}
