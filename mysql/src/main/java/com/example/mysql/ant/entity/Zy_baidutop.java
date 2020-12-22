package com.example.mysql.ant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 综艺百度风云榜表
 * </p>
 *
 * @author tobi
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Zy_baidutop extends Model<Zy_baidutop> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 综艺id
     */
    private Integer zyId;

    /**
     * 关键字
     */
    private String keyword;

    /**
     * 是否启用 0 未启用；1已启用
     */
    private Boolean isEnabled;

    /**
     * 趋势
     */
    private String trend;

    private Integer searchNum;

    /**
     * 是否删除 0 正常 ；1已删除
     */
    private Integer isDeleted;

    private LocalDateTime updated;

    /**
     * 创建时间
     */
    private LocalDateTime created;

    private Integer uTimestamp;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
