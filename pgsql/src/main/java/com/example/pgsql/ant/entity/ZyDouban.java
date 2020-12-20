package com.example.pgsql.ant.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author tobi
 * @since 2020-12-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ZyDouban extends Model<ZyDouban> {

    private static final long serialVersionUID = 1L;

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
