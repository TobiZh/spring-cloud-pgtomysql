package com.example.mysql.api.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mysql.ant.entity.Person;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public IPage<Person> test(int current, int size) {
        Page page=new Page(current,size);

        IPage<Person> iPage=new Person().selectPage(page,null);
        return iPage;
    }
}
