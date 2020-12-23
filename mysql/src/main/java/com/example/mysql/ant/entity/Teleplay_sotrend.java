package com.example.mysql.ant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Teleplay_sotrend extends Model<Teleplay_sotrend> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String keyword;

    private Integer teleplayId;

    private Boolean isEnabled;

    private Integer isDeleted;

    private LocalDate created;

    private LocalDateTime updated;

    private Integer uTimestamp;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
