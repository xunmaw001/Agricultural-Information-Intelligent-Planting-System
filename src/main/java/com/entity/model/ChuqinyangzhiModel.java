package com.entity.model;

import com.entity.ChuqinyangzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 畜禽养殖
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChuqinyangzhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 畜禽养殖标题
     */
    private String chuqinyangzhiName;


    /**
     * 畜禽养殖编号
     */
    private String chuqinyangzhiUuidNumber;


    /**
     * 畜禽养殖照片
     */
    private String chuqinyangzhiPhoto;


    /**
     * 畜禽养殖类型
     */
    private Integer chuqinyangzhiTypes;


    /**
     * 畜禽养殖热度
     */
    private Integer chuqinyangzhiClicknum;


    /**
     * 畜禽养殖详细介绍
     */
    private String chuqinyangzhiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer chuqinyangzhiDelete;


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
