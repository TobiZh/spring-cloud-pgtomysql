package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Characters;
import com.example.mysql.ant.mapper.CharactersMapper;
import com.example.mysql.ant.service.ICharactersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 电视剧电影中的角色表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Service
public class CharactersServiceImpl extends ServiceImpl<CharactersMapper, Characters> implements ICharactersService {

}
