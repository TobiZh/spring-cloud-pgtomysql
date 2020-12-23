package com.example.pgsql.api.controller;

import com.example.pgsql.ant.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("teleplay")
@RestController
public class TeleplayController {

    @GetMapping("")
    public List<Teleplay> teleplay(){
        return new Teleplay().selectAll();
    }

    @GetMapping("baidutop")
    public List<Teleplay_baidutop> baidutop(){
        return new Teleplay_baidutop().selectAll();
    }

    @GetMapping("buluo")
    public List<Teleplay_buluo> buluo(){
        return new Teleplay_buluo().selectAll();
    }

    @GetMapping("douban")
    public List<Teleplay_douban> douban(){
        return new Teleplay_douban().selectAll();
    }

    @GetMapping("huati")
    public List<Teleplay_huati> huati(){
        return new Teleplay_huati().selectAll();
    }

    @GetMapping("person")
    public List<Teleplay_person> person(){
        return new Teleplay_person().selectAll();
    }

    @GetMapping("prdhouse")
    public List<Meta_teleplay_prdhouse> prdhouse(){
        return new Meta_teleplay_prdhouse().selectAll();
    }

    @GetMapping("site")
    public List<Teleplay_site> site(){
        return new Teleplay_site().selectAll();
    }

    @GetMapping("sotrend")
    public List<Meta_teleplay_sotrend> sotrend(){
        return new Meta_teleplay_sotrend().selectAll();
    }

    @GetMapping("subject")
    public List<Teleplay_subject> subject(){
        return new Teleplay_subject().selectAll();
    }

    @GetMapping("tieba")
    public List<Teleplay_tieba> tieba(){
        return new Teleplay_tieba().selectAll();
    }

    @GetMapping("weibo")
    public List<Teleplay_weibo> weibo(){
        return new Teleplay_weibo().selectAll();
    }

    @GetMapping("teleplaycategory")
    public List<Teleplaycategory> teleplaycategory(){
        return new Teleplaycategory().selectAll();
    }

    @GetMapping("teleplaysubject")
    public List<Teleplaysubject> teleplaysubject(){
        return new Teleplaysubject().selectAll();
    }
}
