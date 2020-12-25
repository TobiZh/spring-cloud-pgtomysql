package com.example.mysql.feign.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mysql.ant.entity.Teleplay_prdhouse;
import com.example.mysql.ant.entity.Teleplay_sotrend;
import com.example.mysql.ant.entity.Zy_prdhouse;
import com.example.mysql.entity.*;
import com.example.mysql.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "spring-cloud-pgsql")
public interface MetaServer {


    @GetMapping("/character")
    List<Meta_character> character();
    @GetMapping("/country")
    List<Country> country();
    @GetMapping("/credit")
    List<Meta_credit> credit();
    @GetMapping("/language")
    List<Language> language();
    @GetMapping("/lifecycle")
    List<Meta_lifecycle> lifecycle();
    @GetMapping("/huati")
    List<Huati> huati();
    @GetMapping("/prdhouse")
    List<Prdhouse> prdhouse();
    @GetMapping("/product")
    List<Product> product();
    @GetMapping("/site")
    List<Site> site();




    @GetMapping("/brand")
    List<Brand> brand();
    @GetMapping("/brand/person")
    List<Meta_brand_person> Meta_brand_person();
    @GetMapping("/brand/site")
    List<Meta_brand_site> Meta_brand_site();
    @GetMapping("/brand/person/site")
    List<Meta_brand_person_site> Meta_brand_person_site();


    //======================== person ================================
    @GetMapping("/person")
    List<Person> person();
    @GetMapping("/person/baidutop")
    List<Person_baidutop> baidutop();
    @GetMapping("/person/buluo")
    List<Person_buluo> buluo();
    @GetMapping("/person/douban")
    List<Person_douban> douban();
    @GetMapping("/person/huati")
    List<Person_huati> personhuati();
    @GetMapping("/person/tieba")
    List<Person_tieba> persontieba();
    @GetMapping("/person/weibo")
    List<Person_weibo> personweibo();
    //======================== person ================================


    //======================== teleplay ================================
    @GetMapping("teleplay")
    List<Teleplay> teleplay();
    @GetMapping("/teleplay/baidutop")
    List<Teleplay_baidutop> teleplaybaidutop();
    @GetMapping("/teleplay/buluo")
    List<Teleplay_buluo> teleplaybuluo();
    @GetMapping("/teleplay/douban")
    List<Teleplay_douban> teleplaydouban();
    @GetMapping("/teleplay/huati")
    List<Teleplay_huati> teleplayhuati();
    @GetMapping("/teleplay/tieba")
    List<Teleplay_tieba> teleplaytieba();
    @GetMapping("/teleplay/weibo")
    List<Teleplay_weibo> teleplayweibo();
    @GetMapping("/teleplay/subject")
    List<Teleplay_subject> teleplay_subject();
    @GetMapping("/teleplay/person")
    List<Teleplay_person> teleplayperson();
    @GetMapping("/teleplay/prdhouse")
    List<Meta_teleplay_prdhouse> teleplayprdhouse();
    @GetMapping("/teleplay/site")
    List<Teleplay_site> teleplaysite();
    @GetMapping("/teleplay/sotrend")
    List<Meta_teleplay_sotrend> teleplaysotrend();
    @GetMapping("teleplay/teleplaycategory")
    List<Teleplaycategory> teleplaycategory();
    @GetMapping("teleplay/teleplaysubject")
    List<Teleplaysubject> teleplaysubject();
    //======================== teleplay ================================

    //======================== zy ================================
    @GetMapping("zy")
    List<Zy> zy();
    @GetMapping("/zy/baidutop")
    List<Zy_baidutop> zybaidutop();
    @GetMapping("/zy/buluo")
    List<Zy_buluo> zybuluo();
    @GetMapping("/zy/douban")
    List<Zy_douban> zydouban();
    @GetMapping("/zy/huati")
    List<Zy_huati> zyhuati();
    @GetMapping("/zy/tieba")
    List<Zy_tieba> zytieba();
    @GetMapping("/zy/weibo")
    List<Zy_weibo> zyweibo();
    @GetMapping("/zy/person")
    List<Zy_person> zyperson();
    @GetMapping("/zy/prdhouse")
    List<Meta_zy_prdhouse> zyprdhouse();
    @GetMapping("/zy/site")
    List<Zy_site> zysite();
    @GetMapping("/zy/sotrend")
    List<Meta_zy_sotrend> zysotrend();
    @GetMapping("zy/zycategory")
    List<Zycategory> zycategory();
    @GetMapping("zy/zytype")
    List<Zytype> zytype();
    //======================== zy ================================

}
