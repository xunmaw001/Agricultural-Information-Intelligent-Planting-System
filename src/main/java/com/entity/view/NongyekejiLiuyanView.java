package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.NongyekejiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 农业科技留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("nongyekeji_liuyan")
public class NongyekejiLiuyanView extends NongyekejiLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 农业科技
		/**
		* 农业科技标题
		*/

		@ColumnInfo(comment="农业科技标题",type="varchar(200)")
		private String nongyekejiName;
		/**
		* 农业科技编号
		*/

		@ColumnInfo(comment="农业科技编号",type="varchar(200)")
		private String nongyekejiUuidNumber;
		/**
		* 农业科技照片
		*/

		@ColumnInfo(comment="农业科技照片",type="varchar(200)")
		private String nongyekejiPhoto;
		/**
		* 农业科技类型
		*/
		@ColumnInfo(comment="农业科技类型",type="int(11)")
		private Integer nongyekejiTypes;
			/**
			* 农业科技类型的值
			*/
			@ColumnInfo(comment="农业科技类型的字典表值",type="varchar(200)")
			private String nongyekejiValue;
		/**
		* 科技研发时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="科技研发时间",type="timestamp")
		private Date yanfaTime;
		/**
		* 农业科技热度
		*/

		@ColumnInfo(comment="农业科技热度",type="int(11)")
		private Integer nongyekejiClicknum;
		/**
		* 农业科技功效
		*/

		@ColumnInfo(comment="农业科技功效",type="varchar(200)")
		private String nongyekejiGongxiao;
		/**
		* 农业科技详细介绍
		*/

		@ColumnInfo(comment="农业科技详细介绍",type="text")
		private String nongyekejiContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer nongyekejiDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public NongyekejiLiuyanView() {

	}

	public NongyekejiLiuyanView(NongyekejiLiuyanEntity nongyekejiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, nongyekejiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 农业科技

		/**
		* 获取： 农业科技标题
		*/
		public String getNongyekejiName() {
			return nongyekejiName;
		}
		/**
		* 设置： 农业科技标题
		*/
		public void setNongyekejiName(String nongyekejiName) {
			this.nongyekejiName = nongyekejiName;
		}

		/**
		* 获取： 农业科技编号
		*/
		public String getNongyekejiUuidNumber() {
			return nongyekejiUuidNumber;
		}
		/**
		* 设置： 农业科技编号
		*/
		public void setNongyekejiUuidNumber(String nongyekejiUuidNumber) {
			this.nongyekejiUuidNumber = nongyekejiUuidNumber;
		}

		/**
		* 获取： 农业科技照片
		*/
		public String getNongyekejiPhoto() {
			return nongyekejiPhoto;
		}
		/**
		* 设置： 农业科技照片
		*/
		public void setNongyekejiPhoto(String nongyekejiPhoto) {
			this.nongyekejiPhoto = nongyekejiPhoto;
		}
		/**
		* 获取： 农业科技类型
		*/
		public Integer getNongyekejiTypes() {
			return nongyekejiTypes;
		}
		/**
		* 设置： 农业科技类型
		*/
		public void setNongyekejiTypes(Integer nongyekejiTypes) {
			this.nongyekejiTypes = nongyekejiTypes;
		}


			/**
			* 获取： 农业科技类型的值
			*/
			public String getNongyekejiValue() {
				return nongyekejiValue;
			}
			/**
			* 设置： 农业科技类型的值
			*/
			public void setNongyekejiValue(String nongyekejiValue) {
				this.nongyekejiValue = nongyekejiValue;
			}

		/**
		* 获取： 科技研发时间
		*/
		public Date getYanfaTime() {
			return yanfaTime;
		}
		/**
		* 设置： 科技研发时间
		*/
		public void setYanfaTime(Date yanfaTime) {
			this.yanfaTime = yanfaTime;
		}

		/**
		* 获取： 农业科技热度
		*/
		public Integer getNongyekejiClicknum() {
			return nongyekejiClicknum;
		}
		/**
		* 设置： 农业科技热度
		*/
		public void setNongyekejiClicknum(Integer nongyekejiClicknum) {
			this.nongyekejiClicknum = nongyekejiClicknum;
		}

		/**
		* 获取： 农业科技功效
		*/
		public String getNongyekejiGongxiao() {
			return nongyekejiGongxiao;
		}
		/**
		* 设置： 农业科技功效
		*/
		public void setNongyekejiGongxiao(String nongyekejiGongxiao) {
			this.nongyekejiGongxiao = nongyekejiGongxiao;
		}

		/**
		* 获取： 农业科技详细介绍
		*/
		public String getNongyekejiContent() {
			return nongyekejiContent;
		}
		/**
		* 设置： 农业科技详细介绍
		*/
		public void setNongyekejiContent(String nongyekejiContent) {
			this.nongyekejiContent = nongyekejiContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getNongyekejiDelete() {
			return nongyekejiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setNongyekejiDelete(Integer nongyekejiDelete) {
			this.nongyekejiDelete = nongyekejiDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "NongyekejiLiuyanView{" +
			", nongyekejiName=" + nongyekejiName +
			", nongyekejiUuidNumber=" + nongyekejiUuidNumber +
			", nongyekejiPhoto=" + nongyekejiPhoto +
			", yanfaTime=" + DateUtil.convertString(yanfaTime,"yyyy-MM-dd") +
			", nongyekejiClicknum=" + nongyekejiClicknum +
			", nongyekejiGongxiao=" + nongyekejiGongxiao +
			", nongyekejiContent=" + nongyekejiContent +
			", nongyekejiDelete=" + nongyekejiDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
