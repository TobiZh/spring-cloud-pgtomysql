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


    @GetMapping("/brand")
    List<Brand> brand();

    @GetMapping("/brand/person")
    List<Meta_brand_person> Meta_brand_person();

    @GetMapping("/brand/site")
    List<Meta_brand_site> Meta_brand_site();

    @GetMapping("/brand/person/site")
    List<Meta_brand_person_site> Meta_brand_person_site();

    @GetMapping("/person/{page}/{size}")
    Result<Page<Person>> getPersonPage(@PathVariable("page") int page, @PathVariable("size") int size);
}
