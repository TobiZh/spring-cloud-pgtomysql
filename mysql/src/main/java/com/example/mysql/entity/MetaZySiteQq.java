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
public class MetaZySiteQq extends Model<MetaZySiteQq> {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String title;

    private Integer episodeNo;

    private Date episodeTime;

    private String uid;

    private String showUrl;

    private String numUrl;

    private Boolean isEnabled;

    private Date updated;

    private Integer spiderId;

    private Long zySiteId;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
