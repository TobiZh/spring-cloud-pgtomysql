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
public class MetaPersongroup extends Model<MetaPersongroup> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String memo;

    private String description;

    private Integer orderby;

    private Boolean isEnabled;

    private Boolean isComplete;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
