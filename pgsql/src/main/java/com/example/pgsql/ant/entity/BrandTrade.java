package com.example.pgsql.ant.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class BrandTrade extends Model<BrandTrade> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer brandId;

    private Integer tradeId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
