package com.spring.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.test.HelloWorldMessageProvider;
import com.spring.test.MessageProvider;
import com.spring.test.MessageRenderer;
import com.spring.test.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {
	// equivalent to <bean id="provider" class=".."/>
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	// equivalent to <bean id="renderer" class=".."/>
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}