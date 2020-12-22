package com.example.mysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

    private String is_enabled_movie;

    private String is_enabled_teleplay;

    private String is_enabled_zy;

    private String is_enabled_brand;

    private String is_enabled_person_prdhouse;

    private String is_enabled_prdhouse_brand;

    private String is_enabled_prdhouse_movie;

    private String is_enabled_prdhouse_teleplay;

    private String is_enabled_prdhouse_zy;

    private String is_enabled_music;

    private String is_enabled_musicalbum;

    private String is_enabled_persongroup_prdhouse;

    private String is_enabled_prdhouse_music;

    private String is_enabled_prdhouse_musicalbum;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
