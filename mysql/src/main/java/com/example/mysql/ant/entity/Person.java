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
 * 艺人
 * </p>
 *
 * @author tobi
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Person extends Model<Person> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 姓名
     */
    private String zhName;

    /**
     * 性别 1 男； 2 女
     */
    private Integer sex;

    /**
     * 国家地区
     */
    private Integer countryId;

    /**
     * 描述
     */
    private String description;

    /**
     * 姓名拼音
     */
    private String pinyinName;

    /**
     * 英文名
     */
    private String enName;

    /**
     * 别名
     */
    private String alias;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 身高(cm)
     */
    private Integer height;

    /**
     * 体重(kg)
     */
    private Integer weight;

    /**
     * 已启用，计算指数
     */
    private Boolean isEnabled;

    /**
     * 已编辑完整
     */
    private Boolean isComplete;

    /**
     * 是否可以在寻艺签到
     */
    private Boolean isXunyeeCheck;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 网络头像
     */
    private String avatarCustom;

    /**
     * 是否是编剧
     */
    private Boolean isWriter;

    /**
     * 是否是导演
     */
    private Boolean isDirector;

    /**
     * 是否是演员
     */
    private Boolean isPerformer;

    /**
     * 是否是监制
     */
    private Boolean isProducer;

    /**
     * 是否是制片人
     */
    private Boolean isExeproducer;

    /**
     * 是否锁定
     */
    private Boolean isLock;

    /**
     * 是否删除 0 正常 ；1已删除
     */
    private Boolean isDeleted;

    /**
     * 记录修改时间戳
     */
    private LocalDateTime updated;

    /**
     * 记录创建日期
     */
    private LocalDateTime created;

    /**
     * 记录更新unix时间戳
     */
    private Integer uTimestamp;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
