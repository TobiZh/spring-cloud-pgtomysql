package com.example.mysql.feign.controller;

import com.example.mysql.ant.entity.*;
import com.example.mysql.ant.service.impl.*;
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

@Api("综艺")
@RequestMapping("zy")
@RestController
public class ZyController {

    @Autowired
    private MetaServer metaServer;
    @Resource
    private ZyServiceImpl zyService;
    @Resource
    private Zy_baidutopServiceImpl baidutopService;
    @Resource
    private Zy_buluoServiceImpl buluoService;
    @Resource
    private Zy_doubanServiceImpl doubanService;
    @Resource
    private Zy_huatiServiceImpl huatiService;
    @Resource
    private Zy_tiebaServiceImpl tiebaService;
    @Resource
    private Zy_weiboServiceImpl weiboService;
    @Resource
    private  Zy_personServiceImpl personService;
    @Resource
    private  Zy_prdhouseServiceImpl prdhouseService;
    @Resource
    private  Zy_sotrendServiceImpl sotrendService;
    @Resource
    private  ZytypeServiceImpl zytypeService;

    @Resource
    private ZycategoryServiceImpl zycategoryService;

    @Resource
    private Zy_siteServiceImpl siteService;


    @GetMapping("")
    public Result zy(){
        List<com.example.mysql.entity.Zy> result= metaServer.zy();
        List<Zy> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy i:result){
            Zy b=new Zy() ;
            BeanUtils.copyProperties(i,b);

            if (i.getFirstPlayDate()!=null){
                b.setFirstPlayDate(DateUtil.date2LocalDate(i.getFirstPlayDate()));
            }

            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=zyService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }


    @GetMapping("baidutop")
    public Result baidutop(){
        List<com.example.mysql.entity.Zy_baidutop> result= metaServer.zybaidutop();
        List<Zy_baidutop> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy_baidutop i:result){
            Zy_baidutop b=new Zy_baidutop();
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
        List<com.example.mysql.entity.Zy_buluo> result= metaServer.zybuluo();
        List<Zy_buluo> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy_buluo i:result){
            Zy_buluo b=new Zy_buluo();
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
        List<com.example.mysql.entity.Zy_douban> result= metaServer.zydouban();
        List<Zy_douban> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy_douban i:result){
            Zy_douban b=new Zy_douban();
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
        List<com.example.mysql.entity.Zy_huati> result= metaServer.zyhuati();
        List<Zy_huati> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy_huati i:result){
            Zy_huati b=new Zy_huati();
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
        List<com.example.mysql.entity.Zy_tieba> result= metaServer.zytieba();
        List<Zy_tieba> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy_tieba i:result){
            Zy_tieba b=new Zy_tieba();
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
        List<com.example.mysql.entity.Zy_weibo> result= metaServer.zyweibo();
        List<Zy_weibo> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy_weibo i:result){
            Zy_weibo b=new Zy_weibo();
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
        List<com.example.mysql.entity.Zy_person> result= metaServer.zyperson();
        List<Zy_person> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy_person i:result){
            Zy_person b=new Zy_person();
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
        List<com.example.mysql.entity.Zy_site> result= metaServer.zysite();
        List<Zy_site> list=new ArrayList<>();
        for (com.example.mysql.entity.Zy_site i:result){
            Zy_site b=new Zy_site();
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
        List<com.example.mysql.entity.Meta_zy_prdhouse> result= metaServer.zyprdhouse();
        List<Zy_prdhouse> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_zy_prdhouse i:result){
            Zy_prdhouse b=new Zy_prdhouse();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=prdhouseService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("sotrend")
    public Result sotrend(){
        List<com.example.mysql.entity.Meta_zy_sotrend> result= metaServer.zysotrend();
        List<Zy_sotrend> list=new ArrayList<>();
        for (com.example.mysql.entity.Meta_zy_sotrend i:result){
            Zy_sotrend b=new Zy_sotrend();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=sotrendService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("zycategory")
    public Result teleplaycategory(){
        List<com.example.mysql.entity.Zycategory> result= metaServer.zycategory();
        List<Zycategory> list=new ArrayList<>();
        for (com.example.mysql.entity.Zycategory i:result){
            Zycategory b=new Zycategory();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=zycategoryService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }

    @GetMapping("zytype")
    public Result zytype(){
        List<com.example.mysql.entity.Zytype> result= metaServer.zytype();
        List<Zytype> list=new ArrayList<>();
        for (com.example.mysql.entity.Zytype i:result){
            Zytype b=new Zytype();
            BeanUtils.copyProperties(i,b);
            b.setUpdated(DateUtil.asLocalDateTime(i.getUpdated()));
            b.setCreated(DateUtil.asLocalDateTime(i.getCreated()));
            list.add(b);
        }
        boolean isInsert=zytypeService.saveBatch(list);
        return Result.SUCCESS(isInsert);
    }
}
