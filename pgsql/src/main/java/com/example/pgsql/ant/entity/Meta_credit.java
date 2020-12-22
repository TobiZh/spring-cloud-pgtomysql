package com.example.pgsql.ant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author tobi
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Meta_credit extends Model<Meta_credit> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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
