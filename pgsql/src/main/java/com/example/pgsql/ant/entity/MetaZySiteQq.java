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
