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
public class MetaMusicalbum extends Model<MetaMusicalbum> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String memo;

    private Date releaseTime;

    private Boolean isEnabled;

    private Boolean isComplete;

    private Integer orderby;

    private Integer languageId;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
