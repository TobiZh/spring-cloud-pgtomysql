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
public class MetaLifecycle extends Model<MetaLifecycle> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer orderby;

    private Boolean isEnabledMovie;

    private Boolean isEnabledTeleplay;

    private Boolean isEnabledZy;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
