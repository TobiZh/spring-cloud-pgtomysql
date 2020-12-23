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
 * 周期表
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Lifecycle extends Model<Lifecycle> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 生命周期阶段名称
     */
    private String name;

    /**
     * 是否适用电影
     */
    private Boolean isEnabledMovie;

    /**
     * 是否适用电视剧
     */
    private Boolean isEnabledTeleplay;

    /**
     * 是否适用综艺
     */
    private Boolean isEnabledZy;

    /**
     * 是否删除 0 正常 ；1已删除
     */
    private Boolean isDeleted;

    /**
     * 记录修改时间戳
     */
    private LocalDateTime updated;

    /**
     * 记录创建日期
     */
    private LocalDateTime created;

    /**
     * 记录更新unix时间戳
     */
    private Integer uTimestamp;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
