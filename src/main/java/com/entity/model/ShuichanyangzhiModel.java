package com.entity.model;

import com.entity.ShuichanyangzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 水产养殖
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShuichanyangzhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 水产养殖标题
     */
    private String shuichanyangzhiName;


    /**
     * 水产养殖编号
     */
    private String shuichanyangzhiUuidNumber;


    /**
     * 水产养殖照片
     */
    private String shuichanyangzhiPhoto;


    /**
     * 水产养殖类型
     */
    private Integer shuichanyangzhiTypes;


    /**
     * 水产养殖热度
     */
    private Integer shuichanyangzhiClicknum;


    /**
     * 水产养殖详细介绍
     */
    private String shuichanyangzhiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer shuichanyangzhiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
