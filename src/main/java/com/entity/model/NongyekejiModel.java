package com.entity.model;

import com.entity.NongyekejiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 农业科技
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class NongyekejiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 农业科技标题
     */
    private String nongyekejiName;


    /**
     * 农业科技编号
     */
    private String nongyekejiUuidNumber;


    /**
     * 农业科技照片
     */
    private String nongyekejiPhoto;


    /**
     * 农业科技类型
     */
    private Integer nongyekejiTypes;


    /**
     * 科技研发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yanfaTime;


    /**
     * 农业科技热度
     */
    private Integer nongyekejiClicknum;


    /**
     * 农业科技功效
     */
    private String nongyekejiGongxiao;


    /**
     * 农业科技详细介绍
     */
    private String nongyekejiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer nongyekejiDelete;


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
