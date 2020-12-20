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
public class MetaBrandPerson extends Model<MetaBrandPerson> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer weight;

    private Boolean isComplete;

    private Date startTime;

    private Date finishTime;

    private Integer brandId;

    private Integer creditId;

    private Integer personId;

    private Integer productId;

    private Date created;

    private Date updated;

    private Boolean isEnabled;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
