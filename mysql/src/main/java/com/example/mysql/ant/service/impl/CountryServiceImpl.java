package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Country;
import com.example.mysql.ant.mapper.CountryMapper;
import com.example.mysql.ant.service.ICountryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 国家地区表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-22
 */
@Service
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements ICountryService {

}
