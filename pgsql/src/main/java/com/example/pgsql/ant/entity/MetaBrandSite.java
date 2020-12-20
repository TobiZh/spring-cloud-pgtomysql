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
public class MetaBrandSite extends Model<MetaBrandSite> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String title;

    private String url;

    private Boolean isEnabled;

    private String uid;

    private Integer brandId;

    private Integer siteId;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
