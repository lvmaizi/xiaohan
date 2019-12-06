package com.xiaohan.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@RestController
public class webTest {
    @RequestMapping("test")
    public String test(){
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("xiaohan");
        list.add("456");
        return "test";
    }
}
