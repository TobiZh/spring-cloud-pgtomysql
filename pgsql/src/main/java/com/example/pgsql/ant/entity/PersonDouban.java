package com.example.pgsql.ant.entity;

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
public class PersonDouban extends Model<PersonDouban> {

    private static final long serialVersionUID = 1L;

    private Integer personId;

    private String title;

    private String url;

    private String uid;

    private Boolean isEnabled;

    private String imdb;

    private Integer sum;

    private Date spiderDate;

    private Integer grabTime;

    private Boolean crawled;

    private Date updated;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.personId;
    }

}
