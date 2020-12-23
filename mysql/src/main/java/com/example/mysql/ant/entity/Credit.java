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
 * 演职员表
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Credit extends Model<Credit> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否在电影关联艺人中启用
     */
    private Boolean isEnabledMovie;

    /**
     * 是否在电视剧关联艺人中启用
     */
    private Boolean isEnabledTeleplay;

    /**
     * 是否在综艺关联艺人中启用
     */
    private Boolean isEnabledZy;

    /**
     * 是否在品牌关联艺人中启用
     */
    private Boolean isEnabledBrand;

    /**
     * 是否在组织机构关联艺人中启用
     */
    private Boolean isEnabledPersonPrdhouse;

    /**
     * 是否在品牌关联组织机构中启用
     */
    private Boolean isEnabledPrdhouseBrand;

    /**
     * 是否在电影关联组织机构中启用
     */
    private Boolean isEnabledPrdhouseMovie;

    /**
     * 是否在电视剧关联组织机构中启用
     */
    private Boolean isEnabledPrdhouseTeleplay;

    /**
     * 是否在综艺关联组织机构中启用
     */
    private Boolean isEnabledPrdhouseZy;

    /**
     * 是否在音乐关联艺人中启用
     */
    private Boolean isEnabledMusic;

    /**
     * 是否在音乐专辑关联艺人中启用
     */
    private Boolean isEnabledMusicalbum;

    /**
     * 是否在组织机构关联艺人组合中启用
     */
    private Boolean isEnabledPersongroupPrdhouse;

    /**
     * 是否在音乐关联组织机构中启用
     */
    private Boolean isEnabledPrdhouseMusic;

    /**
     * 是否在音乐专辑关联组织机构中启用
     */
    private Boolean isEnabledPrdhouseMusicalbum;

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
