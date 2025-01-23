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
 * 瓜果蔬菜
 *
 * @author 
 * @email
 */
@TableName("guaguoshucai")
public class GuaguoshucaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuaguoshucaiEntity() {

	}

	public GuaguoshucaiEntity(T t) {
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
     * 瓜果蔬菜标题
     */
    @ColumnInfo(comment="瓜果蔬菜标题",type="varchar(200)")
    @TableField(value = "guaguoshucai_name")

    private String guaguoshucaiName;


    /**
     * 瓜果蔬菜编号
     */
    @ColumnInfo(comment="瓜果蔬菜编号",type="varchar(200)")
    @TableField(value = "guaguoshucai_uuid_number")

    private String guaguoshucaiUuidNumber;


    /**
     * 瓜果蔬菜照片
     */
    @ColumnInfo(comment="瓜果蔬菜照片",type="varchar(200)")
    @TableField(value = "guaguoshucai_photo")

    private String guaguoshucaiPhoto;


    /**
     * 瓜果蔬菜类型
     */
    @ColumnInfo(comment="瓜果蔬菜类型",type="int(11)")
    @TableField(value = "guaguoshucai_types")

    private Integer guaguoshucaiTypes;


    /**
     * 瓜果蔬菜热度
     */
    @ColumnInfo(comment="瓜果蔬菜热度",type="int(11)")
    @TableField(value = "guaguoshucai_clicknum")

    private Integer guaguoshucaiClicknum;


    /**
     * 瓜果蔬菜详细介绍
     */
    @ColumnInfo(comment="瓜果蔬菜详细介绍",type="text")
    @TableField(value = "guaguoshucai_content")

    private String guaguoshucaiContent;


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
    @TableField(value = "guaguoshucai_delete")

    private Integer guaguoshucaiDelete;


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
	 * 获取：瓜果蔬菜标题
	 */
    public String getGuaguoshucaiName() {
        return guaguoshucaiName;
    }
    /**
	 * 设置：瓜果蔬菜标题
	 */

    public void setGuaguoshucaiName(String guaguoshucaiName) {
        this.guaguoshucaiName = guaguoshucaiName;
    }
    /**
	 * 获取：瓜果蔬菜编号
	 */
    public String getGuaguoshucaiUuidNumber() {
        return guaguoshucaiUuidNumber;
    }
    /**
	 * 设置：瓜果蔬菜编号
	 */

    public void setGuaguoshucaiUuidNumber(String guaguoshucaiUuidNumber) {
        this.guaguoshucaiUuidNumber = guaguoshucaiUuidNumber;
    }
    /**
	 * 获取：瓜果蔬菜照片
	 */
    public String getGuaguoshucaiPhoto() {
        return guaguoshucaiPhoto;
    }
    /**
	 * 设置：瓜果蔬菜照片
	 */

    public void setGuaguoshucaiPhoto(String guaguoshucaiPhoto) {
        this.guaguoshucaiPhoto = guaguoshucaiPhoto;
    }
    /**
	 * 获取：瓜果蔬菜类型
	 */
    public Integer getGuaguoshucaiTypes() {
        return guaguoshucaiTypes;
    }
    /**
	 * 设置：瓜果蔬菜类型
	 */

    public void setGuaguoshucaiTypes(Integer guaguoshucaiTypes) {
        this.guaguoshucaiTypes = guaguoshucaiTypes;
    }
    /**
	 * 获取：瓜果蔬菜热度
	 */
    public Integer getGuaguoshucaiClicknum() {
        return guaguoshucaiClicknum;
    }
    /**
	 * 设置：瓜果蔬菜热度
	 */

    public void setGuaguoshucaiClicknum(Integer guaguoshucaiClicknum) {
        this.guaguoshucaiClicknum = guaguoshucaiClicknum;
    }
    /**
	 * 获取：瓜果蔬菜详细介绍
	 */
    public String getGuaguoshucaiContent() {
        return guaguoshucaiContent;
    }
    /**
	 * 设置：瓜果蔬菜详细介绍
	 */

    public void setGuaguoshucaiContent(String guaguoshucaiContent) {
        this.guaguoshucaiContent = guaguoshucaiContent;
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
    public Integer getGuaguoshucaiDelete() {
        return guaguoshucaiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setGuaguoshucaiDelete(Integer guaguoshucaiDelete) {
        this.guaguoshucaiDelete = guaguoshucaiDelete;
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
        return "Guaguoshucai{" +
            ", id=" + id +
            ", guaguoshucaiName=" + guaguoshucaiName +
            ", guaguoshucaiUuidNumber=" + guaguoshucaiUuidNumber +
            ", guaguoshucaiPhoto=" + guaguoshucaiPhoto +
            ", guaguoshucaiTypes=" + guaguoshucaiTypes +
            ", guaguoshucaiClicknum=" + guaguoshucaiClicknum +
            ", guaguoshucaiContent=" + guaguoshucaiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", guaguoshucaiDelete=" + guaguoshucaiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
