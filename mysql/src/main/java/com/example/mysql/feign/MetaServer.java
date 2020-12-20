package com.example.mysql.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mysql.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "spring-cloud-pgsql")
public interface MetaServer {

    @GetMapping("/person/{page}/{size}")
    public Result<Page<Person>> getPersonPage(@PathVariable("page") int page, @PathVariable("size") int size);
}
