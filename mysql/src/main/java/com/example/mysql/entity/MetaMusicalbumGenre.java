package com.example.mysql.entity;

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
 * @since 2020-12-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MetaMusicalbumGenre extends Model<MetaMusicalbumGenre> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer musicalbumId;

    private Integer musicgenreId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
