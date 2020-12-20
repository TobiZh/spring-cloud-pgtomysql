package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.BrandPerson;
import com.example.mysql.ant.mapper.BrandPersonMapper;
import com.example.mysql.ant.service.IBrandPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌艺人关联表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-20
 */
@Service
public class BrandPersonServiceImpl extends ServiceImpl<BrandPersonMapper, BrandPerson> implements IBrandPersonService {

}
