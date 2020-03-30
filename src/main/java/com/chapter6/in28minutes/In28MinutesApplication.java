package com.chapter6.in28minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class In28MinutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(In28MinutesApplication.class, args);
	}



}
