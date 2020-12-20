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
public class PersonBuluo extends Model<PersonBuluo> {

    private static final long serialVersionUID = 1L;

    private Integer personId;

    private String title;

    private String url;

    private String uid;

    private Boolean isEnabled;

    private Integer fansNum;

    private Integer subjectNum;

    private Date spiderDate;

    private Boolean grabStatus;

    private Date updated;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.personId;
    }

}
