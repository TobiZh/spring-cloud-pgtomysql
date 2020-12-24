package com.example.mysql.feign.controller;

import com.example.mysql.ant.entity.*;
import com.example.mysql.ant.service.impl.*;
import com.example.mysql.ant.entity.Person;
import com.example.mysql.feign.service.MetaServer;
import com.example.mysql.result.Result;
import com.example.mysql.utils.DateUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Api("艺人")
@RequestMapping("person")
@RestController
public class PersonController {

    @Autowired
    private MetaServer metaServer;
    @Resource
    private PersonServiceImpl personServiceImpl;
    @Resource
    private Person_baidutopServiceImpl baidutopService;
    @Resource
    private Person_buluoServiceImpl buluoService;
    @Resource
    private Person_doubanServiceImpl doubanService;
    @Resource
    private Person_huatiServiceImpl huatiService;
    @Resource
    private Person_tiebaServiceImpl tiebaService;
    @Resource
    private Person_weiboServiceImpl weiboService;

    @GetMapping("")
    public Result person(){
        List<com.example.mysql.entity.Person> result= metaServer.person();
        List<Person> list=new ArrayList<>();
        for (com.example.mysql.entity.Person i:result){
            Person b=new Person() ;
            BeanUtils.copyProperties(i,b);
            b.setBirthday(DateUtil.date2LocalDate(i.getBirthday()));
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=personServiceImpl.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }


    @GetMapping("baidutop")
    public Result baidutop(){
        List<com.example.mysql.entity.Person_baidutop> result= metaServer.baidutop();
        List<Person_baidutop> list=new ArrayList<>();
        for (com.example.mysql.entity.Person_baidutop i:result){
            Person_baidutop b=new Person_baidutop();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=baidutopService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("buluo")
    public Result buluo(){
        List<com.example.mysql.entity.Person_buluo> result= metaServer.buluo();
        List<Person_buluo> list=new ArrayList<>();
        for (com.example.mysql.entity.Person_buluo i:result){
            Person_buluo b=new Person_buluo();
            BeanUtils.copyProperties(i,b);
            if(i.getUpdated()!=null){
                b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            }
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=buluoService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("douban")
    public Result douban(){
        List<com.example.mysql.entity.Person_douban> result= metaServer.douban();
        List<Person_douban> list=new ArrayList<>();
        for (com.example.mysql.entity.Person_douban i:result){
            Person_douban b=new Person_douban();
            BeanUtils.copyProperties(i,b);
            b.setSpiderDate(DateUtil.date2LocalDate(i.getSpiderDate()));
            if(i.getUpdated()!=null){
                b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            }
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=doubanService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("huati")
    public Result huati(){
        List<com.example.mysql.entity.Person_huati> result= metaServer.personhuati();
        List<Person_huati> list=new ArrayList<>();
        for (com.example.mysql.entity.Person_huati i:result){
            Person_huati b=new Person_huati();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=huatiService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("tieba")
    public Result tieba(){
        List<com.example.mysql.entity.Person_tieba> result= metaServer.persontieba();
        List<Person_tieba> list=new ArrayList<>();
        for (com.example.mysql.entity.Person_tieba i:result){
            Person_tieba b=new Person_tieba();
            BeanUtils.copyProperties(i,b);
            b.setSpiderDate(DateUtil.date2LocalDate(i.getSpiderDate()));
            if(i.getUpdated()!=null){
                b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            }
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=tiebaService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("weibo")
    public Result weibo(){
        List<com.example.mysql.entity.Person_weibo> result= metaServer.personweibo();
        List<Person_weibo> list=new ArrayList<>();
        for (com.example.mysql.entity.Person_weibo i:result){
            Person_weibo b=new Person_weibo();
            BeanUtils.copyProperties(i,b);
            if(i.getUpdated()!=null){
                b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            }
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=weiboService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }
}
