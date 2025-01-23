package com.entity.vo;

import com.entity.ShuichanyangzhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 水产养殖
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shuichanyangzhi")
public class ShuichanyangzhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 水产养殖标题
     */

    @TableField(value = "shuichanyangzhi_name")
    private String shuichanyangzhiName;


    /**
     * 水产养殖编号
     */

    @TableField(value = "shuichanyangzhi_uuid_number")
    private String shuichanyangzhiUuidNumber;


    /**
     * 水产养殖照片
     */

    @TableField(value = "shuichanyangzhi_photo")
    private String shuichanyangzhiPhoto;


    /**
     * 水产养殖类型
     */

    @TableField(value = "shuichanyangzhi_types")
    private Integer shuichanyangzhiTypes;


    /**
     * 水产养殖热度
     */

    @TableField(value = "shuichanyangzhi_clicknum")
    private Integer shuichanyangzhiClicknum;


    /**
     * 水产养殖详细介绍
     */

    @TableField(value = "shuichanyangzhi_content")
    private String shuichanyangzhiContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "shuichanyangzhi_delete")
    private Integer shuichanyangzhiDelete;


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
	 * 设置：水产养殖标题
	 */
    public String getShuichanyangzhiName() {
        return shuichanyangzhiName;
    }


    /**
	 * 获取：水产养殖标题
	 */

    public void setShuichanyangzhiName(String shuichanyangzhiName) {
        this.shuichanyangzhiName = shuichanyangzhiName;
    }
    /**
	 * 设置：水产养殖编号
	 */
    public String getShuichanyangzhiUuidNumber() {
        return shuichanyangzhiUuidNumber;
    }


    /**
	 * 获取：水产养殖编号
	 */

    public void setShuichanyangzhiUuidNumber(String shuichanyangzhiUuidNumber) {
        this.shuichanyangzhiUuidNumber = shuichanyangzhiUuidNumber;
    }
    /**
	 * 设置：水产养殖照片
	 */
    public String getShuichanyangzhiPhoto() {
        return shuichanyangzhiPhoto;
    }


    /**
	 * 获取：水产养殖照片
	 */

    public void setShuichanyangzhiPhoto(String shuichanyangzhiPhoto) {
        this.shuichanyangzhiPhoto = shuichanyangzhiPhoto;
    }
    /**
	 * 设置：水产养殖类型
	 */
    public Integer getShuichanyangzhiTypes() {
        return shuichanyangzhiTypes;
    }


    /**
	 * 获取：水产养殖类型
	 */

    public void setShuichanyangzhiTypes(Integer shuichanyangzhiTypes) {
        this.shuichanyangzhiTypes = shuichanyangzhiTypes;
    }
    /**
	 * 设置：水产养殖热度
	 */
    public Integer getShuichanyangzhiClicknum() {
        return shuichanyangzhiClicknum;
    }


    /**
	 * 获取：水产养殖热度
	 */

    public void setShuichanyangzhiClicknum(Integer shuichanyangzhiClicknum) {
        this.shuichanyangzhiClicknum = shuichanyangzhiClicknum;
    }
    /**
	 * 设置：水产养殖详细介绍
	 */
    public String getShuichanyangzhiContent() {
        return shuichanyangzhiContent;
    }


    /**
	 * 获取：水产养殖详细介绍
	 */

    public void setShuichanyangzhiContent(String shuichanyangzhiContent) {
        this.shuichanyangzhiContent = shuichanyangzhiContent;
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
    public Integer getShuichanyangzhiDelete() {
        return shuichanyangzhiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShuichanyangzhiDelete(Integer shuichanyangzhiDelete) {
        this.shuichanyangzhiDelete = shuichanyangzhiDelete;
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
