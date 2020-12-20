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
public class MovieSite extends Model<MovieSite> {

    private static final long serialVersionUID = 1L;

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
