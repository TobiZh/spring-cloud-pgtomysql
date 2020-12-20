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
public class MetaTeleplaySotrend extends Model<MetaTeleplaySotrend> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String keyword;

    private Boolean isEnabled;

    private Date updated;

    private Integer spiderId;

    private Integer teleplayId;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
