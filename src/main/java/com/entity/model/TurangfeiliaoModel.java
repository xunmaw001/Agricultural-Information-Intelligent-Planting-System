package com.entity.model;

import com.entity.TurangfeiliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 土壤肥料
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TurangfeiliaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 土壤肥料标题
     */
    private String turangfeiliaoName;


    /**
     * 土壤肥料编号
     */
    private String turangfeiliaoUuidNumber;


    /**
     * 土壤肥料照片
     */
    private String turangfeiliaoPhoto;


    /**
     * 土壤肥料类型
     */
    private Integer turangfeiliaoTypes;


    /**
     * 土壤肥料热度
     */
    private Integer turangfeiliaoClicknum;


    /**
     * 土壤肥料详细介绍
     */
    private String turangfeiliaoContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer turangfeiliaoDelete;


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
