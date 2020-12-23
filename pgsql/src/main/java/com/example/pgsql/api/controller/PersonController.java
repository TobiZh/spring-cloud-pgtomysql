package com.example.pgsql.api.controller;


import com.example.pgsql.ant.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("person")
@RestController
public class PersonController {


    @GetMapping("baidutop")
    public List<Person_baidutop> baidutop(){
        return new Person_baidutop().selectAll();
    }

    @GetMapping("buluo")
    public List<Person_buluo> buluo(){
        return new Person_buluo().selectAll();
    }

    @GetMapping("douban")
    public List<Person_douban> douban(){
        return new Person_douban().selectAll();
    }

    @GetMapping("huati")
    public List<Person_huati> huati(){
        return new Person_huati().selectAll();
    }

    @GetMapping("tieba")
    public List<Person_tieba> tieba(){
        return new Person_tieba().selectAll();
    }

    @GetMapping("weibo")
    public List<Person_weibo> weibo(){
        return new Person_weibo().selectAll();
    }
    
}
