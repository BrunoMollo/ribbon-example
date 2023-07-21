package com.example.consumerservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@RestController @RequestMapping("api/consume")
public class ConsumerController {

    private final RestTemplate restTemplate;
    @GetMapping
    public String consume_some_data_from_other_microservice(){
        String response = restTemplate.getForObject("http://random-number-service/api/data", String.class);
        return "<h1>Load balanced</h1>"
                +"I got this --> "+response;
    }



}
