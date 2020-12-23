package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Teleplay;
import com.example.mysql.ant.mapper.TeleplayMapper;
import com.example.mysql.ant.service.ITeleplayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 电视剧表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Service
public class TeleplayServiceImpl extends ServiceImpl<TeleplayMapper, Teleplay> implements ITeleplayService {

}
