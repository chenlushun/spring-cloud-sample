package com.spring.cloud.sample.storeage.reduce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReduceController {
    @GetMapping("/name")
    public Object say(@RequestParam(value = "name") String hi) {
        return "hello," + hi;
    }
}
