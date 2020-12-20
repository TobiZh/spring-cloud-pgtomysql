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
public class MetaPersongroupPerson extends Model<MetaPersongroupPerson> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Date startTime;

    private Date finishTime;

    private Integer weight;

    private Integer personId;

    private Integer persongroupId;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
