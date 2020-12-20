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
public class DjangoMigrations extends Model<DjangoMigrations> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String app;

    private String name;

    private Date applied;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
