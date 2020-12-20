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
public class TeleplayPerson extends Model<TeleplayPerson> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer weight;

    private Integer creditId;

    private Integer personId;

    private Integer teleplayId;

    private Integer characterId;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}