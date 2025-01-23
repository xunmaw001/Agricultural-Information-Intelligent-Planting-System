package com.entity.vo;

import com.entity.TurangfeiliaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 土壤肥料
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("turangfeiliao")
public class TurangfeiliaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 土壤肥料标题
     */

    @TableField(value = "turangfeiliao_name")
    private String turangfeiliaoName;


    /**
     * 土壤肥料编号
     */

    @TableField(value = "turangfeiliao_uuid_number")
    private String turangfeiliaoUuidNumber;


    /**
     * 土壤肥料照片
     */

    @TableField(value = "turangfeiliao_photo")
    private String turangfeiliaoPhoto;


    /**
     * 土壤肥料类型
     */

    @TableField(value = "turangfeiliao_types")
    private Integer turangfeiliaoTypes;


    /**
     * 土壤肥料热度
     */

    @TableField(value = "turangfeiliao_clicknum")
    private Integer turangfeiliaoClicknum;


    /**
     * 土壤肥料详细介绍
     */

    @TableField(value = "turangfeiliao_content")
    private String turangfeiliaoContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "turangfeiliao_delete")
    private Integer turangfeiliaoDelete;


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
	 * 设置：土壤肥料标题
	 */
    public String getTurangfeiliaoName() {
        return turangfeiliaoName;
    }


    /**
	 * 获取：土壤肥料标题
	 */

    public void setTurangfeiliaoName(String turangfeiliaoName) {
        this.turangfeiliaoName = turangfeiliaoName;
    }
    /**
	 * 设置：土壤肥料编号
	 */
    public String getTurangfeiliaoUuidNumber() {
        return turangfeiliaoUuidNumber;
    }


    /**
	 * 获取：土壤肥料编号
	 */

    public void setTurangfeiliaoUuidNumber(String turangfeiliaoUuidNumber) {
        this.turangfeiliaoUuidNumber = turangfeiliaoUuidNumber;
    }
    /**
	 * 设置：土壤肥料照片
	 */
    public String getTurangfeiliaoPhoto() {
        return turangfeiliaoPhoto;
    }


    /**
	 * 获取：土壤肥料照片
	 */

    public void setTurangfeiliaoPhoto(String turangfeiliaoPhoto) {
        this.turangfeiliaoPhoto = turangfeiliaoPhoto;
    }
    /**
	 * 设置：土壤肥料类型
	 */
    public Integer getTurangfeiliaoTypes() {
        return turangfeiliaoTypes;
    }


    /**
	 * 获取：土壤肥料类型
	 */

    public void setTurangfeiliaoTypes(Integer turangfeiliaoTypes) {
        this.turangfeiliaoTypes = turangfeiliaoTypes;
    }
    /**
	 * 设置：土壤肥料热度
	 */
    public Integer getTurangfeiliaoClicknum() {
        return turangfeiliaoClicknum;
    }


    /**
	 * 获取：土壤肥料热度
	 */

    public void setTurangfeiliaoClicknum(Integer turangfeiliaoClicknum) {
        this.turangfeiliaoClicknum = turangfeiliaoClicknum;
    }
    /**
	 * 设置：土壤肥料详细介绍
	 */
    public String getTurangfeiliaoContent() {
        return turangfeiliaoContent;
    }


    /**
	 * 获取：土壤肥料详细介绍
	 */

    public void setTurangfeiliaoContent(String turangfeiliaoContent) {
        this.turangfeiliaoContent = turangfeiliaoContent;
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
    public Integer getTurangfeiliaoDelete() {
        return turangfeiliaoDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setTurangfeiliaoDelete(Integer turangfeiliaoDelete) {
        this.turangfeiliaoDelete = turangfeiliaoDelete;
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
