package com.spring.cloud.sample.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private NameClient client;

    @GetMapping("/name")
    public Object sayHi() {
        return client.getName("hi");
    }
}
