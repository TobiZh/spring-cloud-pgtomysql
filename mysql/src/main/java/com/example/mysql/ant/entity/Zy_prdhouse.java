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
 * 综艺组织机构关联表
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Zy_prdhouse extends Model<Zy_prdhouse> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 综艺id
     */
    private Integer zyId;

    /**
     * 组织机构id
     */
    private Integer prdhouseId;

    /**
     * 演职员id
     */
    private Integer creditId;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 是否删除 0 正常 ；1已删除
     */
    private Boolean isDeleted;

    private LocalDateTime updated;

    /**
     * 创建时间
     */
    private LocalDateTime created;

    private Integer uTimestamp;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
