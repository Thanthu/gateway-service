package com.thanthu.gatewayservice.filters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.netty.handler.logging.LogLevel;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.logging.AdvancedByteBufFormat;

@Configuration
public class LoggingFilter {

	@Bean
	public HttpClient httpClient() {
		return HttpClient.create().wiretap("API-Gateway-Logging-Filter", LogLevel.INFO, AdvancedByteBufFormat.TEXTUAL);
	}

}
