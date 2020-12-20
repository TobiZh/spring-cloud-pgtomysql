package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Credit;
import com.example.mysql.ant.mapper.CreditMapper;
import com.example.mysql.ant.service.ICreditService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 演职员表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-20
 */
@Service
public class CreditServiceImpl extends ServiceImpl<CreditMapper, Credit> implements ICreditService {

}
