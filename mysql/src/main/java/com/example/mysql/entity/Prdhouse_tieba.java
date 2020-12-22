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
public class Prdhouse_tieba extends Model<Prdhouse_tieba> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "prdhouse_id", type = IdType.AUTO)
    private Integer prdhouse_id;

    private String title;

    private String url;

    private String uid;

    private String is_enabled;

    private Integer sum;

    private Integer post_sum;

    private Integer subject_sum;

    private Integer member_sum;

    private Integer check_sum;

    private Date spider_date;

    private Integer grab_time;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.prdhouse_id;
    }

}
