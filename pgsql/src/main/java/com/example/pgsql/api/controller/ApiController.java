package com.example.pgsql.api.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.pgsql.ant.entity.*;
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

    @GetMapping("country")
    public List<Country> country(){
        return new Country().selectAll();
    }

    @GetMapping("credit")
    public List<Meta_credit> credit(){
        return new Meta_credit().selectAll();
    }

    @GetMapping("huati")
    public List<Huati> Huati(){
        return new Huati().selectAll();
    }

    @GetMapping("language")
    public List<Language> language(){
        return new Language().selectAll();
    }

    @GetMapping("lifecycle")
    public List<Meta_lifecycle> lifecycle(){
        return new Meta_lifecycle().selectAll();
    }

}
