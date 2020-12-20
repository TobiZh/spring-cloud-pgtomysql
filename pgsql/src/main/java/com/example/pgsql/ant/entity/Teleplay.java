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
public class Teleplay extends Model<Teleplay> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String alias;

    private String sartfTitle;

    private Date tvFirstPlayDate;

    private Boolean tvFirstPlayDateWait;

    private Date netFirstPlayDate;

    private Integer episodeNums;

    private Integer runtime;

    private String description;

    private Integer orderby;

    private Boolean isEnabled;

    private Boolean isDig;

    private Boolean isPublished;

    private Boolean isComplete;

    private Boolean hasCover;

    private Integer categoryId;

    private Integer countryId;

    private Integer languageId;

    private Integer lifecycleId;

    private String searchKeyword;

    private Date netLastPlayDate;

    private Date tvLastPlayDate;

    private String memo;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
