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
public class Movie_douban extends Model<Movie_douban> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "movie_id", type = IdType.AUTO)
    private Integer movie_id;

    private String title;

    private String url;

    private String uid;

    private String is_enabled;

    private String score;

    private Integer short_comment;

    private Integer film_comment;

    private Integer comment_nums;

    private String imdb;

    private Date spider_date;

    private Integer grab_time;

    private Date updated;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.movie_id;
    }

}
