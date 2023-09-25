package com.spring.cloud.sample.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "STOREAGE")
public interface NameClient {

    @GetMapping("/name")
    String getName(@RequestParam(value = "name") String name);
}
