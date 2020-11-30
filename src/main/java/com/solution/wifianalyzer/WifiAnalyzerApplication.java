package com.solution.wifianalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.solution")
public class WifiAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WifiAnalyzerApplication.class, args);
	}

}
