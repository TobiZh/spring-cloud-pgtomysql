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
public class Person extends Model<Person> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String zhName;

    private Integer sex;

    private String description;

    private String pinyinName;

    private String enName;

    private String alias;

    private Date birthday;

    private Integer height;

    private Integer weight;

    private Integer orderby;

    private Boolean isEnabled;

    private Boolean isComplete;

    private Boolean isWriter;

    private Boolean isDirector;

    private Boolean isPerformer;

    private Boolean isProducer;

    private Boolean isExeproducer;

    private Boolean isStation;

    private Integer panelSum;

    private Integer status;

    private Boolean hasAvatar;

    private String character;

    private String avatar;

    private Integer countryId;

    private String memo;

    private String avatarCustom;

    private Boolean isXunyeeCheck;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
