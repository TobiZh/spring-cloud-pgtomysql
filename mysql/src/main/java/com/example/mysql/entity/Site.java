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
public class Site extends Model<Site> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String zhName;

    private String enName;

    private String url;

    private Integer orderby;

    private Boolean isEnabledVideo;

    private Boolean isEnabledCommerce;

    private Boolean isEnabledSocial;

    private Integer male;

    private Integer female;

    private Integer uniqueView;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
