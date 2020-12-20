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
public class MovieHuati extends Model<MovieHuati> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer weight;

    private Boolean isEnabled;

    private Boolean isExclusive;

    private Integer huatiId;

    private Integer movieId;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
