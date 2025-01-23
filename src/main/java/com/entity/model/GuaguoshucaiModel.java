package com.entity.model;

import com.entity.GuaguoshucaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 瓜果蔬菜
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GuaguoshucaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 瓜果蔬菜标题
     */
    private String guaguoshucaiName;


    /**
     * 瓜果蔬菜编号
     */
    private String guaguoshucaiUuidNumber;


    /**
     * 瓜果蔬菜照片
     */
    private String guaguoshucaiPhoto;


    /**
     * 瓜果蔬菜类型
     */
    private Integer guaguoshucaiTypes;


    /**
     * 瓜果蔬菜热度
     */
    private Integer guaguoshucaiClicknum;


    /**
     * 瓜果蔬菜详细介绍
     */
    private String guaguoshucaiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer guaguoshucaiDelete;


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
