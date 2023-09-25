package com.spring.cloud.sample.storeage.reduce;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReduceController {
    @GetMapping("/name")
    public Object say(@RequestParam(required = false) String hi) {
        return "hello," + hi;
    }
}
