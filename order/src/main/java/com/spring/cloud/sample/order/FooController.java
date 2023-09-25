package com.spring.cloud.sample.order;

import com.spring.cloud.sample.api.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Import(FeignClientsConfiguration.class)
@RestController
public class FooController {

//    @Autowired
//    private NameService nameService;

//    @GetMapping("/name")
//    public Object re() {
//        System.out.println("jin");
//        return nameService.getName("hi");
//    }
}
