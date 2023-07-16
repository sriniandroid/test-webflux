package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class WebTestController {

	@GetMapping("/test")
    public ResponseEntity<Boolean> findAllUsers(){
        return ResponseEntity.ok(Boolean.TRUE);
    }

}
