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
public class Teleplay extends Model<Teleplay> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private String alias;

    private String sartf_title;

    private Date tv_first_play_date;

    private String tv_first_play_date_wait;

    private Date net_first_play_date;

    private Integer episode_nums;

    private Integer runtime;

    private String description;

    private Integer orderby;

    private String is_enabled;

    private String is_dig;

    private String is_published;

    private String is_complete;

    private String has_cover;

    private Integer category_id;

    private Integer country_id;

    private Integer language_id;

    private Integer lifecycle_id;

    private String search_keyword;

    private Date net_last_play_date;

    private Date tv_last_play_date;

    private String memo;

    private Date created;

    private Date updated;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
