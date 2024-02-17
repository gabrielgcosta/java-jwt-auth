package com.gabrielcosta.movie_ranker.modules.exampleJWT.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("example")
public class ExampleController {

    @GetMapping("/jwt")
    public ResponseEntity exampleJwt(){
        return ResponseEntity.ok("This is an authenticated route");
    }
    
}
