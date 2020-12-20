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
public class MetaMovieMaoyan extends Model<MetaMovieMaoyan> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    private String url;

    private Boolean isEnabled;

    private String uid;

    private Date updated;

    private Integer movieId;

    private Integer spiderId;

    private Date created;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
