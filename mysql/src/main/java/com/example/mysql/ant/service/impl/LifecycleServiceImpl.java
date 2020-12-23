package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Lifecycle;
import com.example.mysql.ant.mapper.LifecycleMapper;
import com.example.mysql.ant.service.ILifecycleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 周期表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Service
public class LifecycleServiceImpl extends ServiceImpl<LifecycleMapper, Lifecycle> implements ILifecycleService {

}
