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
public class Movie_site extends Model<Movie_site> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;

    private String uid;

    private String show_url;

    private String num_url;

    private String is_fullepi;

    private String is_enabled;

    private Date created;

    private Date updated;

    private String crawled_info;

    private Integer movie_id;

    private Integer site_id;

    private Integer spider_id;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}