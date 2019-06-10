package com.elibrary.app.elibrary.config;


import com.elibrary.app.elibrary.DemoApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("Servelet initializer +++");
		return application.sources(DemoApplication.class);
	}

}