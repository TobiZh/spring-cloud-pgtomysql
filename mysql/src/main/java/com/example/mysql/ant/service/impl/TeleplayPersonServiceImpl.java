package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.TeleplayPerson;
import com.example.mysql.ant.mapper.TeleplayPersonMapper;
import com.example.mysql.ant.service.ITeleplayPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 电视剧艺人关联表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-20
 */
@Service
public class TeleplayPersonServiceImpl extends ServiceImpl<TeleplayPersonMapper, TeleplayPerson> implements ITeleplayPersonService {

}
