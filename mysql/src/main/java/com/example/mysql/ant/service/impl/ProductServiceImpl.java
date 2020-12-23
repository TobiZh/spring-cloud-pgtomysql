package com.example.mysql.ant.service.impl;

import com.example.mysql.ant.entity.Product;
import com.example.mysql.ant.mapper.ProductMapper;
import com.example.mysql.ant.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品 服务实现类
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
