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
public class Teleplay_site extends Model<Teleplay_site> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private String uid;

    private String showUrl;

    private String numUrl;

    private Boolean isFullepi;

    private Boolean isEnabled;

    private Date created;

    private Date updated;

    private String crawledInfo;

    private Boolean isMinId;

    private Boolean spiderStatus;

    private Integer siteId;

    private Integer spiderId;

    private Integer teleplayId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
