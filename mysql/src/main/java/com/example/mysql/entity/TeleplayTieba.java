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
public class TeleplayTieba extends Model<TeleplayTieba> {

    private static final long serialVersionUID = 1L;

    private Integer teleplayId;

    private String title;

    private String url;

    private String uid;

    private Boolean isEnabled;

    private Integer sum;

    private Integer postSum;

    private Integer subjectSum;

    private Integer memberSum;

    private Integer checkSum;

    private Date spiderDate;

    private Integer grabTime;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.teleplayId;
    }

}