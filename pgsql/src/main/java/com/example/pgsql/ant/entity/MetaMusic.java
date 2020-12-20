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
public class MetaMusic extends Model<MetaMusic> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String memo;

    private Date releaseTime;

    private Integer length;

    private Boolean isEnabled;

    private Boolean isComplete;

    private Integer orderby;

    private Integer languageId;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
