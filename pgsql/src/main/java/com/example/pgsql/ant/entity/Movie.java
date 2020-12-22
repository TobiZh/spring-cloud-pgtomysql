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
public class Movie extends Model<Movie> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private String alias;

    private String sartfTitle;

    private Date releasedDate;

    private Boolean releasedDateWait;

    private Integer boxOffice;

    private Integer runtime;

    private String description;

    private Integer orderby;

    private Boolean isEnabled;

    private Boolean isDig;

    private Boolean isPublished;

    private Boolean isComplete;

    private String dataFrom;

    private Integer countryId;

    private Integer languageId;

    private Integer lifecycleId;

    private String memo;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
