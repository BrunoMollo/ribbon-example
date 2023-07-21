package com.example.givedataservice;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@AllArgsConstructor
@RestController @RequestMapping("api/data")
public class DataController {

    private final int random= new Random().nextInt();
    private final Environment environment;
    
    
    @GetMapping
    public String get_data(){
        String port = environment.getProperty("server.port");
        return "The random number is "+random+", thanks to the microservice that is inn the port "+port;
    }
}
