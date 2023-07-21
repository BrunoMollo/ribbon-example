package com.example.consumerservice.ribbon;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RibbonClient(name="random-number-service" , configuration = RandomNumberRibbonConfig.class)
public class RandomNumberRibbon {

    @LoadBalanced @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
