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
public class Zy extends Model<Zy> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private String description;

    private Date first_play_date;

    private Date play_time;

    private Integer orderby;

    private String is_enabled;

    private String is_complete;

    private Integer frequency_id;

    private Integer media_id;

    private String is_search;

    private String top100;

    private String list_img;

    private Integer category_id;

    private Integer country_id;

    private Integer lifecycle_id;

    private Integer type_id;

    private String search_keyword;

    private String memo;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
