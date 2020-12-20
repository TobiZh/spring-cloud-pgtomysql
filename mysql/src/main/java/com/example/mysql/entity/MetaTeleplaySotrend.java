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
