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
 * 畜禽养殖
 *
 * @author 
 * @email
 */
@TableName("chuqinyangzhi")
public class ChuqinyangzhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChuqinyangzhiEntity() {

	}

	public ChuqinyangzhiEntity(T t) {
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
     * 畜禽养殖标题
     */
    @ColumnInfo(comment="畜禽养殖标题",type="varchar(200)")
    @TableField(value = "chuqinyangzhi_name")

    private String chuqinyangzhiName;


    /**
     * 畜禽养殖编号
     */
    @ColumnInfo(comment="畜禽养殖编号",type="varchar(200)")
    @TableField(value = "chuqinyangzhi_uuid_number")

    private String chuqinyangzhiUuidNumber;


    /**
     * 畜禽养殖照片
     */
    @ColumnInfo(comment="畜禽养殖照片",type="varchar(200)")
    @TableField(value = "chuqinyangzhi_photo")

    private String chuqinyangzhiPhoto;


    /**
     * 畜禽养殖类型
     */
    @ColumnInfo(comment="畜禽养殖类型",type="int(11)")
    @TableField(value = "chuqinyangzhi_types")

    private Integer chuqinyangzhiTypes;


    /**
     * 畜禽养殖热度
     */
    @ColumnInfo(comment="畜禽养殖热度",type="int(11)")
    @TableField(value = "chuqinyangzhi_clicknum")

    private Integer chuqinyangzhiClicknum;


    /**
     * 畜禽养殖详细介绍
     */
    @ColumnInfo(comment="畜禽养殖详细介绍",type="text")
    @TableField(value = "chuqinyangzhi_content")

    private String chuqinyangzhiContent;


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
    @TableField(value = "chuqinyangzhi_delete")

    private Integer chuqinyangzhiDelete;


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
	 * 获取：畜禽养殖标题
	 */
    public String getChuqinyangzhiName() {
        return chuqinyangzhiName;
    }
    /**
	 * 设置：畜禽养殖标题
	 */

    public void setChuqinyangzhiName(String chuqinyangzhiName) {
        this.chuqinyangzhiName = chuqinyangzhiName;
    }
    /**
	 * 获取：畜禽养殖编号
	 */
    public String getChuqinyangzhiUuidNumber() {
        return chuqinyangzhiUuidNumber;
    }
    /**
	 * 设置：畜禽养殖编号
	 */

    public void setChuqinyangzhiUuidNumber(String chuqinyangzhiUuidNumber) {
        this.chuqinyangzhiUuidNumber = chuqinyangzhiUuidNumber;
    }
    /**
	 * 获取：畜禽养殖照片
	 */
    public String getChuqinyangzhiPhoto() {
        return chuqinyangzhiPhoto;
    }
    /**
	 * 设置：畜禽养殖照片
	 */

    public void setChuqinyangzhiPhoto(String chuqinyangzhiPhoto) {
        this.chuqinyangzhiPhoto = chuqinyangzhiPhoto;
    }
    /**
	 * 获取：畜禽养殖类型
	 */
    public Integer getChuqinyangzhiTypes() {
        return chuqinyangzhiTypes;
    }
    /**
	 * 设置：畜禽养殖类型
	 */

    public void setChuqinyangzhiTypes(Integer chuqinyangzhiTypes) {
        this.chuqinyangzhiTypes = chuqinyangzhiTypes;
    }
    /**
	 * 获取：畜禽养殖热度
	 */
    public Integer getChuqinyangzhiClicknum() {
        return chuqinyangzhiClicknum;
    }
    /**
	 * 设置：畜禽养殖热度
	 */

    public void setChuqinyangzhiClicknum(Integer chuqinyangzhiClicknum) {
        this.chuqinyangzhiClicknum = chuqinyangzhiClicknum;
    }
    /**
	 * 获取：畜禽养殖详细介绍
	 */
    public String getChuqinyangzhiContent() {
        return chuqinyangzhiContent;
    }
    /**
	 * 设置：畜禽养殖详细介绍
	 */

    public void setChuqinyangzhiContent(String chuqinyangzhiContent) {
        this.chuqinyangzhiContent = chuqinyangzhiContent;
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
    public Integer getChuqinyangzhiDelete() {
        return chuqinyangzhiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setChuqinyangzhiDelete(Integer chuqinyangzhiDelete) {
        this.chuqinyangzhiDelete = chuqinyangzhiDelete;
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
        return "Chuqinyangzhi{" +
            ", id=" + id +
            ", chuqinyangzhiName=" + chuqinyangzhiName +
            ", chuqinyangzhiUuidNumber=" + chuqinyangzhiUuidNumber +
            ", chuqinyangzhiPhoto=" + chuqinyangzhiPhoto +
            ", chuqinyangzhiTypes=" + chuqinyangzhiTypes +
            ", chuqinyangzhiClicknum=" + chuqinyangzhiClicknum +
            ", chuqinyangzhiContent=" + chuqinyangzhiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", chuqinyangzhiDelete=" + chuqinyangzhiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
