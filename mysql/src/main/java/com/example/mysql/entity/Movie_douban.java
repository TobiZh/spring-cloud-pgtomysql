package com.example.mysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
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
    private Integer movieId;

    private String title;

    private String url;

    private String uid;

    private Boolean isEnabled;

    private BigDecimal score;

    private Integer shortComment;

    private Integer filmComment;

    private Integer commentNums;

    private String imdb;

    private Date spiderDate;

    private Integer grabTime;

    private Date updated;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.movieId;
    }

}
