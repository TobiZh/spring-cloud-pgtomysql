package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Character;
import com.example.mysql.ant.mapper.CharacterMapper;
import com.example.mysql.ant.service.ICharacterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 电视剧电影中的角色表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-20
 */
@Service
public class CharacterServiceImpl extends ServiceImpl<CharacterMapper, Character> implements ICharacterService {

}
