package com.example.demo;
 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class TestController {

	@GetMapping(value="/test")
    public Mono<Boolean> findAllUsers(){
        return Mono.just(Boolean.TRUE);
    }

}
