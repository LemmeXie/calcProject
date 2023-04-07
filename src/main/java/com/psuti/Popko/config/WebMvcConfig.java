package com.psuti.Popko.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebMvcConfig {
    public void addCorsMapping (CorsRegistry reg)
    {
        reg.addMapping("/**")
                .allowedOrigins()
                .allowedMethods()
                .allowCredentials(true);
    }
}
