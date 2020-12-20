package com.example.mysql.api.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mysql.ant.entity.Person;
import com.example.mysql.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

//    @PostMapping("person")
//    public IPage<Person> test(int page, int size){
//        return apiService.test(page,size);
//    }
}
