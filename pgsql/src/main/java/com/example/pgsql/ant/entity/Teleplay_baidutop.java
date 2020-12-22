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
public class Teleplay_baidutop extends Model<Teleplay_baidutop> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String keyword;

    private Boolean isEnabled;

    private String trend;

    private Integer searchNum;

    private Date created;

    private Date updated;

    private Integer spiderId;

    private Integer teleplayId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
