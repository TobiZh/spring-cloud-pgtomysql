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
public class Teleplay_weibo extends Model<Teleplay_weibo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "teleplay_id", type = IdType.AUTO)
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
