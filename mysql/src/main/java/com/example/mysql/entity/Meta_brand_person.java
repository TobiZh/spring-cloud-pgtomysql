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
public class Meta_brand_person extends Model<Meta_brand_person> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer weight;

    private String is_complete;

    private Date start_time;

    private Date finish_time;

    private Integer brand_id;

    private Integer credit_id;

    private Integer person_id;

    private Integer product_id;

    private Date created;

    private Date updated;

    private String is_enabled;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
