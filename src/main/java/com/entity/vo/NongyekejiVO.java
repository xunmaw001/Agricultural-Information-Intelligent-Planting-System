package com.entity.vo;

import com.entity.NongyekejiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 农业科技
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("nongyekeji")
public class NongyekejiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 农业科技标题
     */

    @TableField(value = "nongyekeji_name")
    private String nongyekejiName;


    /**
     * 农业科技编号
     */

    @TableField(value = "nongyekeji_uuid_number")
    private String nongyekejiUuidNumber;


    /**
     * 农业科技照片
     */

    @TableField(value = "nongyekeji_photo")
    private String nongyekejiPhoto;


    /**
     * 农业科技类型
     */

    @TableField(value = "nongyekeji_types")
    private Integer nongyekejiTypes;


    /**
     * 科技研发时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yanfa_time")
    private Date yanfaTime;


    /**
     * 农业科技热度
     */

    @TableField(value = "nongyekeji_clicknum")
    private Integer nongyekejiClicknum;


    /**
     * 农业科技功效
     */

    @TableField(value = "nongyekeji_gongxiao")
    private String nongyekejiGongxiao;


    /**
     * 农业科技详细介绍
     */

    @TableField(value = "nongyekeji_content")
    private String nongyekejiContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "nongyekeji_delete")
    private Integer nongyekejiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：农业科技标题
	 */
    public String getNongyekejiName() {
        return nongyekejiName;
    }


    /**
	 * 获取：农业科技标题
	 */

    public void setNongyekejiName(String nongyekejiName) {
        this.nongyekejiName = nongyekejiName;
    }
    /**
	 * 设置：农业科技编号
	 */
    public String getNongyekejiUuidNumber() {
        return nongyekejiUuidNumber;
    }


    /**
	 * 获取：农业科技编号
	 */

    public void setNongyekejiUuidNumber(String nongyekejiUuidNumber) {
        this.nongyekejiUuidNumber = nongyekejiUuidNumber;
    }
    /**
	 * 设置：农业科技照片
	 */
    public String getNongyekejiPhoto() {
        return nongyekejiPhoto;
    }


    /**
	 * 获取：农业科技照片
	 */

    public void setNongyekejiPhoto(String nongyekejiPhoto) {
        this.nongyekejiPhoto = nongyekejiPhoto;
    }
    /**
	 * 设置：农业科技类型
	 */
    public Integer getNongyekejiTypes() {
        return nongyekejiTypes;
    }


    /**
	 * 获取：农业科技类型
	 */

    public void setNongyekejiTypes(Integer nongyekejiTypes) {
        this.nongyekejiTypes = nongyekejiTypes;
    }
    /**
	 * 设置：科技研发时间
	 */
    public Date getYanfaTime() {
        return yanfaTime;
    }


    /**
	 * 获取：科技研发时间
	 */

    public void setYanfaTime(Date yanfaTime) {
        this.yanfaTime = yanfaTime;
    }
    /**
	 * 设置：农业科技热度
	 */
    public Integer getNongyekejiClicknum() {
        return nongyekejiClicknum;
    }


    /**
	 * 获取：农业科技热度
	 */

    public void setNongyekejiClicknum(Integer nongyekejiClicknum) {
        this.nongyekejiClicknum = nongyekejiClicknum;
    }
    /**
	 * 设置：农业科技功效
	 */
    public String getNongyekejiGongxiao() {
        return nongyekejiGongxiao;
    }


    /**
	 * 获取：农业科技功效
	 */

    public void setNongyekejiGongxiao(String nongyekejiGongxiao) {
        this.nongyekejiGongxiao = nongyekejiGongxiao;
    }
    /**
	 * 设置：农业科技详细介绍
	 */
    public String getNongyekejiContent() {
        return nongyekejiContent;
    }


    /**
	 * 获取：农业科技详细介绍
	 */

    public void setNongyekejiContent(String nongyekejiContent) {
        this.nongyekejiContent = nongyekejiContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getNongyekejiDelete() {
        return nongyekejiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setNongyekejiDelete(Integer nongyekejiDelete) {
        this.nongyekejiDelete = nongyekejiDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
