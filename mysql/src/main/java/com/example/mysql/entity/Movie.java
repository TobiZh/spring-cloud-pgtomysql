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
public class Movie extends Model<Movie> {

    private static final long serialVersionUID = 1L;

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
