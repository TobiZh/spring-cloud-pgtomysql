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
public class Zy_person extends Model<Zy_person> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer weight;

    private Date startTime;

    private Date finishTime;

    private Integer creditId;

    private Integer personId;

    private Integer zyId;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
