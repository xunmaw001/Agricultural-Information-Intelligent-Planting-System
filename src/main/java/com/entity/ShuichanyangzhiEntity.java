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
 * 水产养殖
 *
 * @author 
 * @email
 */
@TableName("shuichanyangzhi")
public class ShuichanyangzhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShuichanyangzhiEntity() {

	}

	public ShuichanyangzhiEntity(T t) {
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
     * 水产养殖标题
     */
    @ColumnInfo(comment="水产养殖标题",type="varchar(200)")
    @TableField(value = "shuichanyangzhi_name")

    private String shuichanyangzhiName;


    /**
     * 水产养殖编号
     */
    @ColumnInfo(comment="水产养殖编号",type="varchar(200)")
    @TableField(value = "shuichanyangzhi_uuid_number")

    private String shuichanyangzhiUuidNumber;


    /**
     * 水产养殖照片
     */
    @ColumnInfo(comment="水产养殖照片",type="varchar(200)")
    @TableField(value = "shuichanyangzhi_photo")

    private String shuichanyangzhiPhoto;


    /**
     * 水产养殖类型
     */
    @ColumnInfo(comment="水产养殖类型",type="int(11)")
    @TableField(value = "shuichanyangzhi_types")

    private Integer shuichanyangzhiTypes;


    /**
     * 水产养殖热度
     */
    @ColumnInfo(comment="水产养殖热度",type="int(11)")
    @TableField(value = "shuichanyangzhi_clicknum")

    private Integer shuichanyangzhiClicknum;


    /**
     * 水产养殖详细介绍
     */
    @ColumnInfo(comment="水产养殖详细介绍",type="text")
    @TableField(value = "shuichanyangzhi_content")

    private String shuichanyangzhiContent;


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
    @TableField(value = "shuichanyangzhi_delete")

    private Integer shuichanyangzhiDelete;


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
	 * 获取：水产养殖标题
	 */
    public String getShuichanyangzhiName() {
        return shuichanyangzhiName;
    }
    /**
	 * 设置：水产养殖标题
	 */

    public void setShuichanyangzhiName(String shuichanyangzhiName) {
        this.shuichanyangzhiName = shuichanyangzhiName;
    }
    /**
	 * 获取：水产养殖编号
	 */
    public String getShuichanyangzhiUuidNumber() {
        return shuichanyangzhiUuidNumber;
    }
    /**
	 * 设置：水产养殖编号
	 */

    public void setShuichanyangzhiUuidNumber(String shuichanyangzhiUuidNumber) {
        this.shuichanyangzhiUuidNumber = shuichanyangzhiUuidNumber;
    }
    /**
	 * 获取：水产养殖照片
	 */
    public String getShuichanyangzhiPhoto() {
        return shuichanyangzhiPhoto;
    }
    /**
	 * 设置：水产养殖照片
	 */

    public void setShuichanyangzhiPhoto(String shuichanyangzhiPhoto) {
        this.shuichanyangzhiPhoto = shuichanyangzhiPhoto;
    }
    /**
	 * 获取：水产养殖类型
	 */
    public Integer getShuichanyangzhiTypes() {
        return shuichanyangzhiTypes;
    }
    /**
	 * 设置：水产养殖类型
	 */

    public void setShuichanyangzhiTypes(Integer shuichanyangzhiTypes) {
        this.shuichanyangzhiTypes = shuichanyangzhiTypes;
    }
    /**
	 * 获取：水产养殖热度
	 */
    public Integer getShuichanyangzhiClicknum() {
        return shuichanyangzhiClicknum;
    }
    /**
	 * 设置：水产养殖热度
	 */

    public void setShuichanyangzhiClicknum(Integer shuichanyangzhiClicknum) {
        this.shuichanyangzhiClicknum = shuichanyangzhiClicknum;
    }
    /**
	 * 获取：水产养殖详细介绍
	 */
    public String getShuichanyangzhiContent() {
        return shuichanyangzhiContent;
    }
    /**
	 * 设置：水产养殖详细介绍
	 */

    public void setShuichanyangzhiContent(String shuichanyangzhiContent) {
        this.shuichanyangzhiContent = shuichanyangzhiContent;
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
    public Integer getShuichanyangzhiDelete() {
        return shuichanyangzhiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setShuichanyangzhiDelete(Integer shuichanyangzhiDelete) {
        this.shuichanyangzhiDelete = shuichanyangzhiDelete;
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
        return "Shuichanyangzhi{" +
            ", id=" + id +
            ", shuichanyangzhiName=" + shuichanyangzhiName +
            ", shuichanyangzhiUuidNumber=" + shuichanyangzhiUuidNumber +
            ", shuichanyangzhiPhoto=" + shuichanyangzhiPhoto +
            ", shuichanyangzhiTypes=" + shuichanyangzhiTypes +
            ", shuichanyangzhiClicknum=" + shuichanyangzhiClicknum +
            ", shuichanyangzhiContent=" + shuichanyangzhiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", shuichanyangzhiDelete=" + shuichanyangzhiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
