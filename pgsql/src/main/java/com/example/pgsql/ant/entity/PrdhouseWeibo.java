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
public class PrdhouseWeibo extends Model<PrdhouseWeibo> {

    private static final long serialVersionUID = 1L;

    private Integer prdhouseId;

    private String title;

    private String url;

    private String uid;

    private Boolean isEnabled;

    private Boolean isLogin;

    private Integer sum;

    private Integer postSum;

    private Date spiderDate;

    private Integer grabTime;

    private Date updated;

    private String type;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.prdhouseId;
    }

}