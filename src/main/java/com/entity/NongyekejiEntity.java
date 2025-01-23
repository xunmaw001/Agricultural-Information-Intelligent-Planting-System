package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 农业科技
 *
 * @author 
 * @email
 */
@TableName("nongyekeji")
public class NongyekejiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public NongyekejiEntity() {

	}

	public NongyekejiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 农业科技标题
     */
    @ColumnInfo(comment="农业科技标题",type="varchar(200)")
    @TableField(value = "nongyekeji_name")

    private String nongyekejiName;


    /**
     * 农业科技编号
     */
    @ColumnInfo(comment="农业科技编号",type="varchar(200)")
    @TableField(value = "nongyekeji_uuid_number")

    private String nongyekejiUuidNumber;


    /**
     * 农业科技照片
     */
    @ColumnInfo(comment="农业科技照片",type="varchar(200)")
    @TableField(value = "nongyekeji_photo")

    private String nongyekejiPhoto;


    /**
     * 农业科技类型
     */
    @ColumnInfo(comment="农业科技类型",type="int(11)")
    @TableField(value = "nongyekeji_types")

    private Integer nongyekejiTypes;


    /**
     * 科技研发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="科技研发时间",type="timestamp")
    @TableField(value = "yanfa_time")

    private Date yanfaTime;


    /**
     * 农业科技热度
     */
    @ColumnInfo(comment="农业科技热度",type="int(11)")
    @TableField(value = "nongyekeji_clicknum")

    private Integer nongyekejiClicknum;


    /**
     * 农业科技功效
     */
    @ColumnInfo(comment="农业科技功效",type="varchar(200)")
    @TableField(value = "nongyekeji_gongxiao")

    private String nongyekejiGongxiao;


    /**
     * 农业科技详细介绍
     */
    @ColumnInfo(comment="农业科技详细介绍",type="text")
    @TableField(value = "nongyekeji_content")

    private String nongyekejiContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "nongyekeji_delete")

    private Integer nongyekejiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：农业科技标题
	 */
    public String getNongyekejiName() {
        return nongyekejiName;
    }
    /**
	 * 设置：农业科技标题
	 */

    public void setNongyekejiName(String nongyekejiName) {
        this.nongyekejiName = nongyekejiName;
    }
    /**
	 * 获取：农业科技编号
	 */
    public String getNongyekejiUuidNumber() {
        return nongyekejiUuidNumber;
    }
    /**
	 * 设置：农业科技编号
	 */

    public void setNongyekejiUuidNumber(String nongyekejiUuidNumber) {
        this.nongyekejiUuidNumber = nongyekejiUuidNumber;
    }
    /**
	 * 获取：农业科技照片
	 */
    public String getNongyekejiPhoto() {
        return nongyekejiPhoto;
    }
    /**
	 * 设置：农业科技照片
	 */

    public void setNongyekejiPhoto(String nongyekejiPhoto) {
        this.nongyekejiPhoto = nongyekejiPhoto;
    }
    /**
	 * 获取：农业科技类型
	 */
    public Integer getNongyekejiTypes() {
        return nongyekejiTypes;
    }
    /**
	 * 设置：农业科技类型
	 */

    public void setNongyekejiTypes(Integer nongyekejiTypes) {
        this.nongyekejiTypes = nongyekejiTypes;
    }
    /**
	 * 获取：科技研发时间
	 */
    public Date getYanfaTime() {
        return yanfaTime;
    }
    /**
	 * 设置：科技研发时间
	 */

    public void setYanfaTime(Date yanfaTime) {
        this.yanfaTime = yanfaTime;
    }
    /**
	 * 获取：农业科技热度
	 */
    public Integer getNongyekejiClicknum() {
        return nongyekejiClicknum;
    }
    /**
	 * 设置：农业科技热度
	 */

    public void setNongyekejiClicknum(Integer nongyekejiClicknum) {
        this.nongyekejiClicknum = nongyekejiClicknum;
    }
    /**
	 * 获取：农业科技功效
	 */
    public String getNongyekejiGongxiao() {
        return nongyekejiGongxiao;
    }
    /**
	 * 设置：农业科技功效
	 */

    public void setNongyekejiGongxiao(String nongyekejiGongxiao) {
        this.nongyekejiGongxiao = nongyekejiGongxiao;
    }
    /**
	 * 获取：农业科技详细介绍
	 */
    public String getNongyekejiContent() {
        return nongyekejiContent;
    }
    /**
	 * 设置：农业科技详细介绍
	 */

    public void setNongyekejiContent(String nongyekejiContent) {
        this.nongyekejiContent = nongyekejiContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getNongyekejiDelete() {
        return nongyekejiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setNongyekejiDelete(Integer nongyekejiDelete) {
        this.nongyekejiDelete = nongyekejiDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Nongyekeji{" +
            ", id=" + id +
            ", nongyekejiName=" + nongyekejiName +
            ", nongyekejiUuidNumber=" + nongyekejiUuidNumber +
            ", nongyekejiPhoto=" + nongyekejiPhoto +
            ", nongyekejiTypes=" + nongyekejiTypes +
            ", yanfaTime=" + DateUtil.convertString(yanfaTime,"yyyy-MM-dd") +
            ", nongyekejiClicknum=" + nongyekejiClicknum +
            ", nongyekejiGongxiao=" + nongyekejiGongxiao +
            ", nongyekejiContent=" + nongyekejiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", nongyekejiDelete=" + nongyekejiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
