package com.example.mysql.feign.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    @GetMapping("/person/{page}/{size}")
    Result<Page<Person>> getPersonPage(@PathVariable("page") int page, @PathVariable("size") int size);

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
}
