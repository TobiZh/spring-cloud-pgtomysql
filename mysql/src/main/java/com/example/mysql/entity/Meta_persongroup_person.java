package com.example.mysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Meta_persongroup_person extends Model<Meta_persongroup_person> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
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
