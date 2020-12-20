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
public class PersonBaidutop extends Model<PersonBaidutop> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String keyword;

    private Boolean isEnabled;

    private String trend;

    private Integer searchNum;

    private Date created;

    private Date updated;

    private Integer personId;

    private Integer spiderId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
