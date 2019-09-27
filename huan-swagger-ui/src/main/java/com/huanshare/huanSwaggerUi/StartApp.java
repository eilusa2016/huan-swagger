package com.huanshare.huanSwaggerUi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.huanshare.huanSwaggerCore.core.EnableHuanSwagger;

@EnableHuanSwagger
@SpringBootApplication
public class StartApp {
	public static void main(String[] args) {
		 SpringApplication.run(StartApp.class, args);
	}
}
