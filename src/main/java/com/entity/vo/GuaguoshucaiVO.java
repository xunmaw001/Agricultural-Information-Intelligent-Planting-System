package com.entity.vo;

import com.entity.GuaguoshucaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 瓜果蔬菜
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guaguoshucai")
public class GuaguoshucaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 瓜果蔬菜标题
     */

    @TableField(value = "guaguoshucai_name")
    private String guaguoshucaiName;


    /**
     * 瓜果蔬菜编号
     */

    @TableField(value = "guaguoshucai_uuid_number")
    private String guaguoshucaiUuidNumber;


    /**
     * 瓜果蔬菜照片
     */

    @TableField(value = "guaguoshucai_photo")
    private String guaguoshucaiPhoto;


    /**
     * 瓜果蔬菜类型
     */

    @TableField(value = "guaguoshucai_types")
    private Integer guaguoshucaiTypes;


    /**
     * 瓜果蔬菜热度
     */

    @TableField(value = "guaguoshucai_clicknum")
    private Integer guaguoshucaiClicknum;


    /**
     * 瓜果蔬菜详细介绍
     */

    @TableField(value = "guaguoshucai_content")
    private String guaguoshucaiContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "guaguoshucai_delete")
    private Integer guaguoshucaiDelete;


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
	 * 设置：瓜果蔬菜标题
	 */
    public String getGuaguoshucaiName() {
        return guaguoshucaiName;
    }


    /**
	 * 获取：瓜果蔬菜标题
	 */

    public void setGuaguoshucaiName(String guaguoshucaiName) {
        this.guaguoshucaiName = guaguoshucaiName;
    }
    /**
	 * 设置：瓜果蔬菜编号
	 */
    public String getGuaguoshucaiUuidNumber() {
        return guaguoshucaiUuidNumber;
    }


    /**
	 * 获取：瓜果蔬菜编号
	 */

    public void setGuaguoshucaiUuidNumber(String guaguoshucaiUuidNumber) {
        this.guaguoshucaiUuidNumber = guaguoshucaiUuidNumber;
    }
    /**
	 * 设置：瓜果蔬菜照片
	 */
    public String getGuaguoshucaiPhoto() {
        return guaguoshucaiPhoto;
    }


    /**
	 * 获取：瓜果蔬菜照片
	 */

    public void setGuaguoshucaiPhoto(String guaguoshucaiPhoto) {
        this.guaguoshucaiPhoto = guaguoshucaiPhoto;
    }
    /**
	 * 设置：瓜果蔬菜类型
	 */
    public Integer getGuaguoshucaiTypes() {
        return guaguoshucaiTypes;
    }


    /**
	 * 获取：瓜果蔬菜类型
	 */

    public void setGuaguoshucaiTypes(Integer guaguoshucaiTypes) {
        this.guaguoshucaiTypes = guaguoshucaiTypes;
    }
    /**
	 * 设置：瓜果蔬菜热度
	 */
    public Integer getGuaguoshucaiClicknum() {
        return guaguoshucaiClicknum;
    }


    /**
	 * 获取：瓜果蔬菜热度
	 */

    public void setGuaguoshucaiClicknum(Integer guaguoshucaiClicknum) {
        this.guaguoshucaiClicknum = guaguoshucaiClicknum;
    }
    /**
	 * 设置：瓜果蔬菜详细介绍
	 */
    public String getGuaguoshucaiContent() {
        return guaguoshucaiContent;
    }


    /**
	 * 获取：瓜果蔬菜详细介绍
	 */

    public void setGuaguoshucaiContent(String guaguoshucaiContent) {
        this.guaguoshucaiContent = guaguoshucaiContent;
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
    public Integer getGuaguoshucaiDelete() {
        return guaguoshucaiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setGuaguoshucaiDelete(Integer guaguoshucaiDelete) {
        this.guaguoshucaiDelete = guaguoshucaiDelete;
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
