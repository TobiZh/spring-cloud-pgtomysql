package com.example.pgsql.api.controller;

import com.example.pgsql.ant.entity.Brand;
import com.example.pgsql.ant.entity.Meta_brand_person;
import com.example.pgsql.ant.entity.Meta_brand_person_site;
import com.example.pgsql.ant.entity.Meta_brand_site;
import com.example.pgsql.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("brand")
@RestController
public class BrandController {

    @GetMapping("")
    public List<Brand> getBrand(){
        return new Brand().selectAll();
    }

    @GetMapping("person")
    public List<Meta_brand_person> person(){
        return new Meta_brand_person().selectAll();
    }

    @GetMapping("site")
    public List<Meta_brand_site> site(){
        return new Meta_brand_site().selectAll();
    }

    @GetMapping("person/site")
    public List<Meta_brand_person_site> personsite(){
        return new Meta_brand_person_site().selectAll();
    }
}
