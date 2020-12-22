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
public class Zy_buluo extends Model<Zy_buluo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "zy_id", type = IdType.AUTO)
    private Integer zy_id;

    private String title;

    private String url;

    private String uid;

    private String is_enabled;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.zy_id;
    }

}
