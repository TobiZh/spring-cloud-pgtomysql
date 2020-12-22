package com.example.pgsql.ant.entity;

import java.math.BigDecimal;
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
public class Zy_douban extends Model<Zy_douban> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "zy_id", type = IdType.AUTO)
    private Integer zyId;

    private String title;

    private String url;

    private String uid;

    private Boolean isEnabled;

    private BigDecimal score;

    private Integer shortComment;

    private Integer filmComment;

    private Integer commentNums;

    private String imdb;

    private Date spiderDate;

    private Integer grabTime;

    private Date updated;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.zyId;
    }

}
