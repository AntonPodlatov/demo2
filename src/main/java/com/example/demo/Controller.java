package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class Controller {

    @GetMapping
    public Map<String, Object> index() {
        return Map.of("lol", "kek", "kek", "lol");
    }
}
