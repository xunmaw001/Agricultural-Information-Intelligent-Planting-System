package com.entity.vo;

import com.entity.ChuqinyangzhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 畜禽养殖
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("chuqinyangzhi")
public class ChuqinyangzhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 畜禽养殖标题
     */

    @TableField(value = "chuqinyangzhi_name")
    private String chuqinyangzhiName;


    /**
     * 畜禽养殖编号
     */

    @TableField(value = "chuqinyangzhi_uuid_number")
    private String chuqinyangzhiUuidNumber;


    /**
     * 畜禽养殖照片
     */

    @TableField(value = "chuqinyangzhi_photo")
    private String chuqinyangzhiPhoto;


    /**
     * 畜禽养殖类型
     */

    @TableField(value = "chuqinyangzhi_types")
    private Integer chuqinyangzhiTypes;


    /**
     * 畜禽养殖热度
     */

    @TableField(value = "chuqinyangzhi_clicknum")
    private Integer chuqinyangzhiClicknum;


    /**
     * 畜禽养殖详细介绍
     */

    @TableField(value = "chuqinyangzhi_content")
    private String chuqinyangzhiContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "chuqinyangzhi_delete")
    private Integer chuqinyangzhiDelete;


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
	 * 设置：畜禽养殖标题
	 */
    public String getChuqinyangzhiName() {
        return chuqinyangzhiName;
    }


    /**
	 * 获取：畜禽养殖标题
	 */

    public void setChuqinyangzhiName(String chuqinyangzhiName) {
        this.chuqinyangzhiName = chuqinyangzhiName;
    }
    /**
	 * 设置：畜禽养殖编号
	 */
    public String getChuqinyangzhiUuidNumber() {
        return chuqinyangzhiUuidNumber;
    }


    /**
	 * 获取：畜禽养殖编号
	 */

    public void setChuqinyangzhiUuidNumber(String chuqinyangzhiUuidNumber) {
        this.chuqinyangzhiUuidNumber = chuqinyangzhiUuidNumber;
    }
    /**
	 * 设置：畜禽养殖照片
	 */
    public String getChuqinyangzhiPhoto() {
        return chuqinyangzhiPhoto;
    }


    /**
	 * 获取：畜禽养殖照片
	 */

    public void setChuqinyangzhiPhoto(String chuqinyangzhiPhoto) {
        this.chuqinyangzhiPhoto = chuqinyangzhiPhoto;
    }
    /**
	 * 设置：畜禽养殖类型
	 */
    public Integer getChuqinyangzhiTypes() {
        return chuqinyangzhiTypes;
    }


    /**
	 * 获取：畜禽养殖类型
	 */

    public void setChuqinyangzhiTypes(Integer chuqinyangzhiTypes) {
        this.chuqinyangzhiTypes = chuqinyangzhiTypes;
    }
    /**
	 * 设置：畜禽养殖热度
	 */
    public Integer getChuqinyangzhiClicknum() {
        return chuqinyangzhiClicknum;
    }


    /**
	 * 获取：畜禽养殖热度
	 */

    public void setChuqinyangzhiClicknum(Integer chuqinyangzhiClicknum) {
        this.chuqinyangzhiClicknum = chuqinyangzhiClicknum;
    }
    /**
	 * 设置：畜禽养殖详细介绍
	 */
    public String getChuqinyangzhiContent() {
        return chuqinyangzhiContent;
    }


    /**
	 * 获取：畜禽养殖详细介绍
	 */

    public void setChuqinyangzhiContent(String chuqinyangzhiContent) {
        this.chuqinyangzhiContent = chuqinyangzhiContent;
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
    public Integer getChuqinyangzhiDelete() {
        return chuqinyangzhiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setChuqinyangzhiDelete(Integer chuqinyangzhiDelete) {
        this.chuqinyangzhiDelete = chuqinyangzhiDelete;
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
