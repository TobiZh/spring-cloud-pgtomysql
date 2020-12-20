package com.example.pgsql.api.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pgsql.ant.entity.Person;
import com.example.pgsql.feign.Result;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public Result<IPage<Person>> test(int current, int size) {
        QueryWrapper qw=new QueryWrapper();
        qw.orderByAsc("id");
        Page page=new Page(current,size);
        IPage<Person> iPage=new Person().selectPage(page,qw);
        return Result.SUCCESS(iPage);
    }
}
