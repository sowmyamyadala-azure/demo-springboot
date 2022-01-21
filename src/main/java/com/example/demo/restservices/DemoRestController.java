package com.example.demo.restservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DemoRestController {

    @GetMapping()
    @RequestMapping("/message")
    public String helloWorld(){
        return "{\"data\":\"Hello MorganStanley\"}";
    }

}
