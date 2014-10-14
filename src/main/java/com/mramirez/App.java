package com.mramirez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.mangofactory.swagger.plugin.EnableSwagger;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableSwagger
// EnableWebMvc
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
