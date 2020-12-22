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
public class Person_buluo extends Model<Person_buluo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "person_id", type = IdType.AUTO)
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
