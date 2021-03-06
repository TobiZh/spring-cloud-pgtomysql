package com.example.mysql.ant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 品牌艺人关联表
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Brand_person extends Model<Brand_person> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 品牌id
     */
    private Integer brandId;

    /**
     * 艺人id
     */
    private Integer personId;

    /**
     * 演职员（credit表）id
     */
    private Integer creditId;

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 是否启用
     */
    private Boolean isEnabled;

    /**
     * 是否删除 0 正常 ；1已删除
     */
    private Boolean isDeleted;

    /**
     * 修改时间执行update自动填充
     */
    private LocalDateTime updated;

    /**
     * 创建时间 自动获取当前时间
     */
    private LocalDateTime created;

    private Integer uTimestamp;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
