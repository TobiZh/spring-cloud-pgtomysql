package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Person;
import com.example.mysql.ant.mapper.PersonMapper;
import com.example.mysql.ant.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 艺人 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
