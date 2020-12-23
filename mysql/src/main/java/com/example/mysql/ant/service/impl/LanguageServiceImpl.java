package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Language;
import com.example.mysql.ant.mapper.LanguageMapper;
import com.example.mysql.ant.service.ILanguageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 语言表 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Service
public class LanguageServiceImpl extends ServiceImpl<LanguageMapper, Language> implements ILanguageService {

}
