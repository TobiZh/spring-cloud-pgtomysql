package com.example.mysql.feign.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mysql.entity.Brand;
import com.example.mysql.entity.Person;
import com.example.mysql.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(name = "spring-cloud-pgsql")
public interface MetaServer {

    @GetMapping("/ant/brand")
    List<Brand> brand();


    @GetMapping("/person/{page}/{size}")
    Result<Page<Person>> getPersonPage(@PathVariable("page") int page, @PathVariable("size") int size);
}
