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
 * 土壤肥料
 *
 * @author 
 * @email
 */
@TableName("turangfeiliao")
public class TurangfeiliaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TurangfeiliaoEntity() {

	}

	public TurangfeiliaoEntity(T t) {
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
     * 土壤肥料标题
     */
    @ColumnInfo(comment="土壤肥料标题",type="varchar(200)")
    @TableField(value = "turangfeiliao_name")

    private String turangfeiliaoName;


    /**
     * 土壤肥料编号
     */
    @ColumnInfo(comment="土壤肥料编号",type="varchar(200)")
    @TableField(value = "turangfeiliao_uuid_number")

    private String turangfeiliaoUuidNumber;


    /**
     * 土壤肥料照片
     */
    @ColumnInfo(comment="土壤肥料照片",type="varchar(200)")
    @TableField(value = "turangfeiliao_photo")

    private String turangfeiliaoPhoto;


    /**
     * 土壤肥料类型
     */
    @ColumnInfo(comment="土壤肥料类型",type="int(11)")
    @TableField(value = "turangfeiliao_types")

    private Integer turangfeiliaoTypes;


    /**
     * 土壤肥料热度
     */
    @ColumnInfo(comment="土壤肥料热度",type="int(11)")
    @TableField(value = "turangfeiliao_clicknum")

    private Integer turangfeiliaoClicknum;


    /**
     * 土壤肥料详细介绍
     */
    @ColumnInfo(comment="土壤肥料详细介绍",type="text")
    @TableField(value = "turangfeiliao_content")

    private String turangfeiliaoContent;


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
    @TableField(value = "turangfeiliao_delete")

    private Integer turangfeiliaoDelete;


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
	 * 获取：土壤肥料标题
	 */
    public String getTurangfeiliaoName() {
        return turangfeiliaoName;
    }
    /**
	 * 设置：土壤肥料标题
	 */

    public void setTurangfeiliaoName(String turangfeiliaoName) {
        this.turangfeiliaoName = turangfeiliaoName;
    }
    /**
	 * 获取：土壤肥料编号
	 */
    public String getTurangfeiliaoUuidNumber() {
        return turangfeiliaoUuidNumber;
    }
    /**
	 * 设置：土壤肥料编号
	 */

    public void setTurangfeiliaoUuidNumber(String turangfeiliaoUuidNumber) {
        this.turangfeiliaoUuidNumber = turangfeiliaoUuidNumber;
    }
    /**
	 * 获取：土壤肥料照片
	 */
    public String getTurangfeiliaoPhoto() {
        return turangfeiliaoPhoto;
    }
    /**
	 * 设置：土壤肥料照片
	 */

    public void setTurangfeiliaoPhoto(String turangfeiliaoPhoto) {
        this.turangfeiliaoPhoto = turangfeiliaoPhoto;
    }
    /**
	 * 获取：土壤肥料类型
	 */
    public Integer getTurangfeiliaoTypes() {
        return turangfeiliaoTypes;
    }
    /**
	 * 设置：土壤肥料类型
	 */

    public void setTurangfeiliaoTypes(Integer turangfeiliaoTypes) {
        this.turangfeiliaoTypes = turangfeiliaoTypes;
    }
    /**
	 * 获取：土壤肥料热度
	 */
    public Integer getTurangfeiliaoClicknum() {
        return turangfeiliaoClicknum;
    }
    /**
	 * 设置：土壤肥料热度
	 */

    public void setTurangfeiliaoClicknum(Integer turangfeiliaoClicknum) {
        this.turangfeiliaoClicknum = turangfeiliaoClicknum;
    }
    /**
	 * 获取：土壤肥料详细介绍
	 */
    public String getTurangfeiliaoContent() {
        return turangfeiliaoContent;
    }
    /**
	 * 设置：土壤肥料详细介绍
	 */

    public void setTurangfeiliaoContent(String turangfeiliaoContent) {
        this.turangfeiliaoContent = turangfeiliaoContent;
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
    public Integer getTurangfeiliaoDelete() {
        return turangfeiliaoDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setTurangfeiliaoDelete(Integer turangfeiliaoDelete) {
        this.turangfeiliaoDelete = turangfeiliaoDelete;
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
        return "Turangfeiliao{" +
            ", id=" + id +
            ", turangfeiliaoName=" + turangfeiliaoName +
            ", turangfeiliaoUuidNumber=" + turangfeiliaoUuidNumber +
            ", turangfeiliaoPhoto=" + turangfeiliaoPhoto +
            ", turangfeiliaoTypes=" + turangfeiliaoTypes +
            ", turangfeiliaoClicknum=" + turangfeiliaoClicknum +
            ", turangfeiliaoContent=" + turangfeiliaoContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", turangfeiliaoDelete=" + turangfeiliaoDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
