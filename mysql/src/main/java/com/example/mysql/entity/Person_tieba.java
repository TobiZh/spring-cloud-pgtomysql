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
public class Person_tieba extends Model<Person_tieba> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "person_id", type = IdType.AUTO)
    private Integer personId;

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

    private Boolean goodCrawled;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.personId;
    }

}
