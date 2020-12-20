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
public class TeleplayWeibo extends Model<TeleplayWeibo> {

    private static final long serialVersionUID = 1L;

    private Integer teleplayId;

    private String title;

    private String url;

    private String uid;

    private Boolean isEnabled;

    private Boolean isLogin;

    private Integer sum;

    private Integer postSum;

    private Date spiderDate;

    private Integer grabTime;

    private Date updated;

    private String type;

    private Boolean isCrawled;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.teleplayId;
    }

}
