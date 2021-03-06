package com.example.mysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

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
public class Meta_musicalbum_genre extends Model<Meta_musicalbum_genre> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer musicalbumId;

    private Integer musicgenreId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
