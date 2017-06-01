package com.lovetocode.springAPI.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by macbook on 5/26/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.lovetocode.springAPI")
public class AppConfig {
}
