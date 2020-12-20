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
