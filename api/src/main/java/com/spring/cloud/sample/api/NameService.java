package com.spring.cloud.sample.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "STOREAGE-API")
public interface NameService {

    @GetMapping("/name")
    String getName(@RequestParam(value = "name") String name);
}
