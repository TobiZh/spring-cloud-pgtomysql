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
public class Zy extends Model<Zy> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private String description;

    private Date firstPlayDate;

    private Date playTime;

    private Integer orderby;

    private Boolean isEnabled;

    private Boolean isComplete;

    private Integer frequencyId;

    private Integer mediaId;

    private Boolean isSearch;

    private String top100;

    private String listImg;

    private Integer categoryId;

    private Integer countryId;

    private Integer lifecycleId;

    private Integer typeId;

    private String searchKeyword;

    private String memo;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
