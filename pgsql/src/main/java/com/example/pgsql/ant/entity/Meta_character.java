package com.example.pgsql.ant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author tobi
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Meta_character extends Model<Meta_character> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer sex;

    private String description;

    private Integer orderby;

    private Boolean isEnabled;

    private Boolean isComplete;

    private String memo;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
