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
public class Zy_site extends Model<Zy_site> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;

    private String uid;

    private String showUrl;

    private String numUrl;

    private Boolean isEnabled;

    private Date created;

    private Date updated;

    private String httpStatus;

    private Boolean meiju;

    private Integer siteId;

    private Integer spiderId;

    private Integer zyId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
