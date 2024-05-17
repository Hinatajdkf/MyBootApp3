package com.example.mybootapp3;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
    @RequestMapping("/taro")
    public String index() {
        return "Taro desu!";
    }
}
