package com.example.mysql.feign.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mysql.ant.entity.*;
import com.example.mysql.ant.service.impl.*;
import com.example.mysql.feign.service.MetaServer;
import com.example.mysql.result.Result;
import com.example.mysql.utils.DateUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MetaController {


    @Resource
    private CharactersServiceImpl charactersService;
    @Resource
    private CountryServiceImpl countryService;
    @Resource
    private CreditServiceImpl creditService;
    @Resource
    private LanguageServiceImpl languageService;
    @Resource
    private LifecycleServiceImpl lifecycleService;
    @Resource
    private HuatiServiceImpl huatiService;

    @Resource
    private PrdhouseServiceImpl prdhouseService;
    @Resource
    private ProductServiceImpl productService;
    @Resource
    private SiteServiceImpl siteService;

    @Autowired
    private MetaServer metaServer;

    @GetMapping("character")
    public Result character(){
        List<com.example.mysql.entity.Meta_character> result= metaServer.character();

        List<Characters> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_character i:result){
            Characters b=new Characters();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=charactersService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("country")
    public Result country(){
        List<com.example.mysql.entity.Country> result= metaServer.country();

        List<Country> list=new ArrayList<>();
        for (com.example.mysql.entity.Country i:result){
            Country b=new Country();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=countryService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("credit")
    public Result credit(){
        List<com.example.mysql.entity.Meta_credit> result= metaServer.credit();

        List<Credit> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_credit i:result){
            Credit b=new Credit();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=creditService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("lifecycle")
    public Result lifecycle(){
        List<com.example.mysql.entity.Meta_lifecycle> result= metaServer.lifecycle();

        List<Lifecycle> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_lifecycle i:result){
            Lifecycle b=new Lifecycle();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=lifecycleService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("language")
    public Result language(){
        List<com.example.mysql.entity.Language> result= metaServer.language();

        List<Language> list=new ArrayList<>();
        for (com.example.mysql.entity.Language i:result){
            Language b=new Language();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=languageService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("huati")
    public Result huati(){
        List<com.example.mysql.entity.Huati> result= metaServer.huati();

        List<Huati> list=new ArrayList<>();
        for (com.example.mysql.entity.Huati i:result){
            Huati b=new Huati();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=huatiService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }


    @GetMapping("prdhouse")
    public Result prdhouse(){
        List<com.example.mysql.entity.Prdhouse> result= metaServer.prdhouse();

        List<Prdhouse> list=new ArrayList<>();
        for (com.example.mysql.entity.Prdhouse i:result){
            Prdhouse b=new Prdhouse();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=prdhouseService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("product")
    public Result product(){
        List<com.example.mysql.entity.Product> result= metaServer.product();

        List<Product> list=new ArrayList<>();
        for (com.example.mysql.entity.Product i:result){
            Product b=new Product();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=productService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

    @GetMapping("site")
    public Result site(){
        List<com.example.mysql.entity.Site> result= metaServer.site();

        List<Site> list=new ArrayList<>();
        for (com.example.mysql.entity.Site i:result){
            Site b=new Site();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }

        boolean isInsert=siteService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }
}
