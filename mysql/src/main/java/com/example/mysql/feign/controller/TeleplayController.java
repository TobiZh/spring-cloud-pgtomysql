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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Api("电视剧")
@RequestMapping("teleplay")
@RestController
public class TeleplayController {

    @Autowired
    private MetaServer metaServer;
    @Resource
    private TeleplayServiceImpl teleplayService;
    @Resource
    private Teleplay_baidutopServiceImpl baidutopService;
    @Resource
    private Teleplay_buluoServiceImpl buluoService;
    @Resource
    private Teleplay_doubanServiceImpl doubanService;
    @Resource
    private Teleplay_huatiServiceImpl huatiService;
    @Resource
    private Teleplay_tiebaServiceImpl tiebaService;
    @Resource
    private Teleplay_weiboServiceImpl weiboService;
    @Resource
    private  Teleplay_personServiceImpl personService;
    @Resource
    private  Teleplay_prdhouseServiceImpl prdhouseService;
    @Resource
    private  Teleplay_sotrendServiceImpl sotrendService;
    @Resource
    private  TeleplaysubjectServiceImpl teleplaysubjectService;
    @Resource
    private  Teleplay_subjectServiceImpl subjectService;
    @Resource
    private TeleplaycategoryServiceImpl teleplaycategoryService;

    @Resource
    private Teleplay_siteServiceImpl siteService;


    @GetMapping("")
    public Result teleplay(){
        List<com.example.mysql.entity.Teleplay> result= metaServer.teleplay();
        List<Teleplay> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay i:result){
            Teleplay b=new Teleplay() ;
            BeanUtils.copyProperties(i,b);

            if (i.getTvFirstPlayDate()!=null){
                b.setTvFirstPlayDate(DateUtil.date2LocalDate(i.getTvFirstPlayDate()));
            }
            if (i.getTvLastPlayDate()!=null){
                b.setTvLastPlayDate(DateUtil.date2LocalDate(i.getTvLastPlayDate()));
            }

            if (i.getNetLastPlayDate()!=null){
                b.setNetLastPlayDate(DateUtil.date2LocalDate(i.getNetLastPlayDate()));
            }
            if (i.getNetFirstPlayDate()!=null){
                b.setNetFirstPlayDate(DateUtil.date2LocalDate(i.getNetFirstPlayDate()));
            }
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=teleplayService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }


    @GetMapping("baidutop")
    public Result baidutop(){
        List<com.example.mysql.entity.Teleplay_baidutop> result= metaServer.teleplaybaidutop();
        List<Teleplay_baidutop> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_baidutop i:result){
            Teleplay_baidutop b=new Teleplay_baidutop();
            BeanUtils.copyProperties(i,b);
            if (i.getUpdated()!=null){
                b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            }
            if (i.getCreated()!=null){
                b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            }
            list.add(b);
        }
        boolean isInsert=baidutopService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("buluo")
    public Result buluo(){
        List<com.example.mysql.entity.Teleplay_buluo> result= metaServer.teleplaybuluo();
        List<Teleplay_buluo> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_buluo i:result){
            Teleplay_buluo b=new Teleplay_buluo();
            BeanUtils.copyProperties(i,b);
            if (i.getUpdated()!=null){
                b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            }
            if (i.getCreated()!=null){
                b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            }
            list.add(b);
        }
        boolean isInsert=buluoService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("douban")
    public Result douban(){
        List<com.example.mysql.entity.Teleplay_douban> result= metaServer.teleplaydouban();
        List<Teleplay_douban> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_douban i:result){
            Teleplay_douban b=new Teleplay_douban();
            BeanUtils.copyProperties(i,b);
            if (i.getUpdated()!=null){
                b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            }
            if (i.getCreated()!=null){
                b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            }
            list.add(b);
        }
        boolean isInsert=doubanService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("huati")
    public Result huati(){
        List<com.example.mysql.entity.Teleplay_huati> result= metaServer.teleplayhuati();
        List<Teleplay_huati> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_huati i:result){
            Teleplay_huati b=new Teleplay_huati();
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
        List<com.example.mysql.entity.Teleplay_tieba> result= metaServer.teleplaytieba();
        List<Teleplay_tieba> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_tieba i:result){
            Teleplay_tieba b=new Teleplay_tieba();
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
        List<com.example.mysql.entity.Teleplay_weibo> result= metaServer.teleplayweibo();
        List<Teleplay_weibo> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_weibo i:result){
            Teleplay_weibo b=new Teleplay_weibo();
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

    @GetMapping("person")
    public Result person(){
        List<com.example.mysql.entity.Teleplay_person> result= metaServer.teleplayperson();
        List<Teleplay_person> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_person i:result){
            Teleplay_person b=new Teleplay_person();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=personService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("site")
    public Result site(){
        List<com.example.mysql.entity.Teleplay_site> result= metaServer.teleplaysite();
        List<Teleplay_site> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_site i:result){
            Teleplay_site b=new Teleplay_site();
            b.setId(Math.toIntExact(i.getId()));
            BeanUtils.copyProperties(i,b);
            if(i.getUpdated()!=null){
                b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
            Date date = null;
            try {
                date = simpleDateFormat.parse("1970-01-012");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if(i.getCreated()!=null&&i.getCreated().after(date)){
                b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            }

            list.add(b);
        }
        boolean isInsert=siteService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }


    @GetMapping("prdhouse")
    public Result prdhouse(){
        List<com.example.mysql.entity.Meta_teleplay_prdhouse> result= metaServer.teleplayprdhouse();
        List<Teleplay_prdhouse> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_teleplay_prdhouse i:result){
            Teleplay_prdhouse b=new Teleplay_prdhouse();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=prdhouseService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("teleplaysubject")
    public Result teleplaysubject(){
        List<com.example.mysql.entity.Teleplaysubject> result= metaServer.teleplaysubject();
        List<Teleplaysubject> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplaysubject i:result){
            Teleplaysubject b=new Teleplaysubject();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=teleplaysubjectService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("subject")
    public Result subject(){
        List<com.example.mysql.entity.Teleplay_subject> result= metaServer.teleplay_subject();
        List<Teleplay_subject> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplay_subject i:result){
            Teleplay_subject b=new Teleplay_subject();
            BeanUtils.copyProperties(i,b);
            list.add(b);
        }
        boolean isInsert=subjectService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("sotrend")
    public Result sotrend(){
        List<com.example.mysql.entity.Meta_teleplay_sotrend> result= metaServer.teleplaysotrend();
        List<Teleplay_sotrend> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_teleplay_sotrend i:result){
            Teleplay_sotrend b=new Teleplay_sotrend();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=sotrendService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("teleplaycategory")
    public Result teleplaycategory(){
        List<com.example.mysql.entity.Teleplaycategory> result= metaServer.teleplaycategory();
        List<Teleplaycategory> list=new ArrayList<>();
        for (com.example.mysql.entity.Teleplaycategory i:result){
            Teleplaycategory b=new Teleplaycategory();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=teleplaycategoryService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }
}
