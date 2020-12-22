package com.example.pgsql.api.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.pgsql.ant.entity.Meta_character;
import com.example.pgsql.ant.entity.Person;
import com.example.pgsql.api.service.ApiService;
import com.example.pgsql.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("person/{page}/{size}")
    public Result<IPage<Person>> test(@PathVariable("page") int page, @PathVariable("size") int size){
        return apiService.test(page,size);
    }


    @GetMapping("character")
    public List<Meta_character> character(){
        return new Meta_character().selectAll();
    }
}
