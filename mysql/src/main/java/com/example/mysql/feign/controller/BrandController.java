package com.example.mysql.feign.controller;

import com.example.mysql.ant.entity.Brand;
import com.example.mysql.ant.service.impl.BrandServiceImpl;
import com.example.mysql.feign.service.MetaServer;
import com.example.mysql.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("brand")
@RestController
public class BrandController {
    @Resource
    private BrandServiceImpl brandService;
    @Autowired
    private MetaServer metaServer;
    @GetMapping("")
    public Result insert(){
        List<com.example.mysql.entity.Brand> result= metaServer.brand();
        for (com.example.mysql.entity.Brand i:result){
            Brand b=new Brand();
            b.setId(i.getId());
            b.setCreated(i.getCreated());
            b.setUpdated(i.getUpdated());
            b.setDescription(i.getDescription());
            b.setLogo(i.getLogo());
            b.setIsDeleted(i.getIs_enabled());
            b.setName(i.getName());
        }


    }
}
