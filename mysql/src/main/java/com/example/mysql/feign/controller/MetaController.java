package com.example.mysql.feign.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mysql.ant.service.impl.PersonServiceImpl;
import com.example.mysql.entity.Person;
import com.example.mysql.feign.MetaServer;
import com.example.mysql.feign.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MetaController {

    @Resource
    private PersonServiceImpl personServiceImpl;
    @Autowired
    private MetaServer metaServer;

    @GetMapping("person/{page}/{size}")
    public Result person(@PathVariable("page") int page, @PathVariable("size") int size){
        Result<Page<Person>> pageResult= metaServer.getPersonPage(page,size);
        List<Person> personList=pageResult.getData().getRecords();
        List<com.example.mysql.ant.entity.Person> list=new ArrayList<>();
        for (Person p:personList){
            com.example.mysql.ant.entity.Person person=new com.example.mysql.ant.entity.Person() ;
            person.setId(p.getId());
            person.setAlias(p.getAlias());
            person.setAvatar(p.getAvatar());
            person.setBirthday(date2LocalDate(p.getBirthday()));
            person.setCreated(asLocalDateTime(p.getCreated()));
            person.setCountryId(p.getCountryId());
            person.setDescription(p.getDescription());
            person.setEnName(p.getEnName());
            person.setHeight(p.getHeight());
            person.setIsEnabled(p.getIsEnabled()?1:0);
            person.setUpdated(asLocalDateTime(p.getUpdated()));
            person.setIsExeproducer(p.getIsExeproducer()?1:0);
            person.setZhName(p.getZhName());
            person.setIsDirector(p.getIsDirector()?1:0);
            person.setSex(p.getSex());
            person.setIsPerformer(p.getIsPerformer()?1:0);
            person.setWeight(p.getWeight());
            person.setPinyinName(p.getPinyinName());
            person.setWebAvatar(p.getAvatarCustom());
            person.setIsXunyeeCheck(p.getIsXunyeeCheck()?1:0);
            person.setIsProducer(p.getIsProducer()?1:0);
            list.add(person);
        }
        boolean isInsert=personServiceImpl.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    public LocalDate date2LocalDate(Date date) {
        if(null == date) {
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public LocalDateTime asLocalDateTime(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
