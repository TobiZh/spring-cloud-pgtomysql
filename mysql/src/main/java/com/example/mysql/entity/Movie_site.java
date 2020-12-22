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

    private String showUrl;

    private String numUrl;

    private Boolean isFullepi;

    private Boolean isEnabled;

    private Date created;

    private Date updated;

    private String crawledInfo;

    private Integer movieId;

    private Integer siteId;

    private Integer spiderId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
