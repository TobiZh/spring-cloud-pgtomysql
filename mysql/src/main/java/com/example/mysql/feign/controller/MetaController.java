package com.example.mysql.feign.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mysql.ant.entity.Characters;
import com.example.mysql.ant.service.impl.CharacterServiceImpl;
import com.example.mysql.ant.service.impl.PersonServiceImpl;
import com.example.mysql.entity.Person;
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
    private PersonServiceImpl personServiceImpl;
    @Resource
    private CharacterServiceImpl characterService;

    @Autowired
    private MetaServer metaServer;

    @GetMapping("person/{page}/{size}")
    public Result person(@PathVariable("page") int page, @PathVariable("size") int size){
        Result<Page<Person>> pageResult= metaServer.getPersonPage(page,size);
        List<Person> personList=pageResult.getData().getRecords();
        List<com.example.mysql.ant.entity.Person> list=new ArrayList<>();
        for (Person p:personList){
            com.example.mysql.ant.entity.Person person=new com.example.mysql.ant.entity.Person() ;
//            person.setId(p.getId());
//            person.setAlias(p.getAlias());
//            person.setAvatar(p.getAvatar());
//            person.setBirthday(DateUtil.date2LocalDate(p.getBirthday()));
//            person.setCreated(DateUtil.asLocalDateTime(p.getCreated()));
//            person.setCountryId(p.getCountryId());
//            person.setDescription(p.getDescription());
//            person.setEnName(p.getEnName());
//            person.setHeight(p.getHeight());
//            person.setIs_enabled(p.getIs_enabled());
//            person.setUpdated(DateUtil.asLocalDateTime(p.getUpdated()));
//            person.setIs_exeproducer(p.getIs_exeproducer());
//            person.setZh_name(p.getZh_name());
//            person.setIs_director(p.getIs_director());
//            person.setSex(p.getSex());
//            person.setIs_performer(p.getIs_performer());
//            person.setWeight(p.getWeight());
//            person.setPinyin_name(p.getPinyin_name());
//            person.setWeb_avatar(p.getAvatar_custom());
//            person.setIs_xunyee_check(p.getIs_xunyee_check());
//            person.setIs_producer(p.getIs_producer());
            list.add(person);
        }
        boolean isInsert=personServiceImpl.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

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

        boolean isInsert=characterService.saveBatch(list);
        return Result.SUCCESS(isInsert);

    }

}
