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
public class Movie_buluo extends Model<Movie_buluo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "movie_id", type = IdType.AUTO)
    private Integer movieId;

    private String title;

    private String url;

    private String uid;

    private Boolean isEnabled;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.movieId;
    }

}
