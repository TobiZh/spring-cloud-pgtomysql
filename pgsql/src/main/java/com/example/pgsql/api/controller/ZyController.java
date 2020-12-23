package com.example.pgsql.api.controller;


import com.example.pgsql.ant.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("zy")
@RestController
public class ZyController {

    @GetMapping("")
    public List<Zy> zy(){
        return new Zy().selectAll();
    }

    @GetMapping("baidutop")
    public List<Zy_baidutop> baidutop(){
        return new Zy_baidutop().selectAll();
    }

    @GetMapping("buluo")
    public List<Zy_buluo> buluo(){
        return new Zy_buluo().selectAll();
    }

    @GetMapping("douban")
    public List<Zy_douban> douban(){
        return new Zy_douban().selectAll();
    }

    @GetMapping("huati")
    public List<Zy_huati> huati(){
        return new Zy_huati().selectAll();
    }

    @GetMapping("person")
    public List<Zy_person> person(){
        return new Zy_person().selectAll();
    }

    @GetMapping("prdhouse")
    public List<Meta_zy_prdhouse> prdhouse(){
        return new Meta_zy_prdhouse().selectAll();
    }

    @GetMapping("site")
    public List<Zy_site> site(){
        return new Zy_site().selectAll();
    }

    @GetMapping("sotrend")
    public List<Meta_zy_sotrend> sotrend(){
        return new Meta_zy_sotrend().selectAll();
    }

    @GetMapping("tieba")
    public List<Zy_tieba> tieba(){
        return new Zy_tieba().selectAll();
    }

    @GetMapping("weibo")
    public List<Zy_weibo> weibo(){
        return new Zy_weibo().selectAll();
    }

    @GetMapping("zycategory")
    public List<Zycategory> zycategory(){
        return new Zycategory().selectAll();
    }

    @GetMapping("zytype")
    public List<Zytype> zytype(){
        return new Zytype().selectAll();
    }
}
