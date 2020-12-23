package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Brand;
import com.example.mysql.ant.mapper.BrandMapper;
import com.example.mysql.ant.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
