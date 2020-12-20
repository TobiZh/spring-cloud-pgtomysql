package com.example.pgsql.feign;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.pgsql.ant.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "spring-cloud-pgsql")
public interface MetaServer {

    @GetMapping("/person/{current}/{size}")
    public IPage<Person> getPersonPage(@PathVariable("current") int current,@PathVariable("size") int size);
}
