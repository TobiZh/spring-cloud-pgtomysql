package com.example.mysql.feign.controller;

import com.example.mysql.ant.entity.Brand;
import com.example.mysql.ant.entity.Brand_person;
import com.example.mysql.ant.entity.Brand_person_site;
import com.example.mysql.ant.entity.Brand_site;
import com.example.mysql.ant.service.impl.BrandServiceImpl;
import com.example.mysql.ant.service.impl.Brand_personServiceImpl;
import com.example.mysql.ant.service.impl.Brand_person_siteServiceImpl;
import com.example.mysql.ant.service.impl.Brand_siteServiceImpl;
import com.example.mysql.feign.service.MetaServer;
import com.example.mysql.result.Result;
import com.example.mysql.utils.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("brand")
@RestController
public class BrandController {
    @Resource
    private BrandServiceImpl brandService;
    @Resource
    private Brand_personServiceImpl brandPersonService;

    @Resource
    private Brand_siteServiceImpl brandSiteService;

    @Resource
    private Brand_person_siteServiceImpl brandPersonSiteService;

    @Autowired
    private MetaServer metaServer;
    @GetMapping("")
    public Result insert(){
        List<com.example.mysql.entity.Brand> result= metaServer.brand();

        List<Brand> list=new ArrayList<>();
        for (com.example.mysql.entity.Brand i:result){
            Brand b=new Brand();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=brandService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("person")
    public Result person(){
        List<com.example.mysql.entity.Meta_brand_person> result= metaServer.Meta_brand_person();

        List<Brand_person> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_brand_person i:result){
            Brand_person b=new Brand_person();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=brandPersonService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("site")
    public Result site(){
        List<com.example.mysql.entity.Meta_brand_site> result= metaServer.Meta_brand_site();

        List<Brand_site> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_brand_site i:result){
            Brand_site b=new Brand_site();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=brandSiteService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("person/site")
    public Result personsite(){
        List<com.example.mysql.entity.Meta_brand_person_site> result= metaServer.Meta_brand_person_site();

        List<Brand_person_site> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_brand_person_site i:result){
            Brand_person_site b=new Brand_person_site();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=brandPersonSiteService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

}
