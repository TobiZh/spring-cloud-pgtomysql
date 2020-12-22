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
public class Person extends Model<Person> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String zh_name;

    private Integer sex;

    private String description;

    private String pinyin_name;

    private String en_name;

    private String alias;

    private Date birthday;

    private Integer height;

    private Integer weight;

    private Integer orderby;

    private String is_enabled;

    private String is_complete;

    private String is_writer;

    private String is_director;

    private String is_performer;

    private String is_producer;

    private String is_exeproducer;

    private String is_station;

    private Integer panel_sum;

    private Integer status;

    private String has_avatar;

    private String character;

    private String avatar;

    private Integer country_id;

    private String memo;

    private String avatar_custom;

    private String is_xunyee_check;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
