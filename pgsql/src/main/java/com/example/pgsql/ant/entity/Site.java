package com.example.pgsql.ant.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author tobi
 * @since 2020-12-20
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
