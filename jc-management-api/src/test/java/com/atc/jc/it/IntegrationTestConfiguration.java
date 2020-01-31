package com.atc.jc.it;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.mock;

@Configuration
@Profile("it")
public class IntegrationTestConfiguration {
    @Bean
    public RestTemplate restTemplate() {
        return mock(RestTemplate.class);
    }
}