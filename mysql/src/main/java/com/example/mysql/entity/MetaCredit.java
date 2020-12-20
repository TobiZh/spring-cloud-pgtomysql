package com.example.mysql.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author tobi
 * @since 2020-12-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MetaCredit extends Model<MetaCredit> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer orderby;

    private Boolean isEnabledMovie;

    private Boolean isEnabledTeleplay;

    private Boolean isEnabledZy;

    private Boolean isEnabledBrand;

    private Boolean isEnabledPersonPrdhouse;

    private Boolean isEnabledPrdhouseBrand;

    private Boolean isEnabledPrdhouseMovie;

    private Boolean isEnabledPrdhouseTeleplay;

    private Boolean isEnabledPrdhouseZy;

    private Boolean isEnabledMusic;

    private Boolean isEnabledMusicalbum;

    private Boolean isEnabledPersongroupPrdhouse;

    private Boolean isEnabledPrdhouseMusic;

    private Boolean isEnabledPrdhouseMusicalbum;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
