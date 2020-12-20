package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Site;
import com.example.mysql.ant.mapper.SiteMapper;
import com.example.mysql.ant.service.ISiteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 网站 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-20
 */
@Service
public class SiteServiceImpl extends ServiceImpl<SiteMapper, Site> implements ISiteService {

}
