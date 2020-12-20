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
public class MetaBrandPersonSite extends Model<MetaBrandPersonSite> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String title;

    private String url;

    private String urlGen;

    private Boolean isEnabled;

    private Date finishTimeNew;

    private Date finishTimeExclusive;

    private Long brandPersonId;

    private Integer siteId;

    private Long promotionId;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
