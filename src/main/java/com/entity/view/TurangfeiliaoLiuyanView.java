package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.TurangfeiliaoLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 土壤肥料留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("turangfeiliao_liuyan")
public class TurangfeiliaoLiuyanView extends TurangfeiliaoLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 土壤肥料
		/**
		* 土壤肥料标题
		*/

		@ColumnInfo(comment="土壤肥料标题",type="varchar(200)")
		private String turangfeiliaoName;
		/**
		* 土壤肥料编号
		*/

		@ColumnInfo(comment="土壤肥料编号",type="varchar(200)")
		private String turangfeiliaoUuidNumber;
		/**
		* 土壤肥料照片
		*/

		@ColumnInfo(comment="土壤肥料照片",type="varchar(200)")
		private String turangfeiliaoPhoto;
		/**
		* 土壤肥料类型
		*/
		@ColumnInfo(comment="土壤肥料类型",type="int(11)")
		private Integer turangfeiliaoTypes;
			/**
			* 土壤肥料类型的值
			*/
			@ColumnInfo(comment="土壤肥料类型的字典表值",type="varchar(200)")
			private String turangfeiliaoValue;
		/**
		* 土壤肥料热度
		*/

		@ColumnInfo(comment="土壤肥料热度",type="int(11)")
		private Integer turangfeiliaoClicknum;
		/**
		* 土壤肥料详细介绍
		*/

		@ColumnInfo(comment="土壤肥料详细介绍",type="text")
		private String turangfeiliaoContent;
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
		private Integer turangfeiliaoDelete;
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



	public TurangfeiliaoLiuyanView() {

	}

	public TurangfeiliaoLiuyanView(TurangfeiliaoLiuyanEntity turangfeiliaoLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, turangfeiliaoLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 土壤肥料

		/**
		* 获取： 土壤肥料标题
		*/
		public String getTurangfeiliaoName() {
			return turangfeiliaoName;
		}
		/**
		* 设置： 土壤肥料标题
		*/
		public void setTurangfeiliaoName(String turangfeiliaoName) {
			this.turangfeiliaoName = turangfeiliaoName;
		}

		/**
		* 获取： 土壤肥料编号
		*/
		public String getTurangfeiliaoUuidNumber() {
			return turangfeiliaoUuidNumber;
		}
		/**
		* 设置： 土壤肥料编号
		*/
		public void setTurangfeiliaoUuidNumber(String turangfeiliaoUuidNumber) {
			this.turangfeiliaoUuidNumber = turangfeiliaoUuidNumber;
		}

		/**
		* 获取： 土壤肥料照片
		*/
		public String getTurangfeiliaoPhoto() {
			return turangfeiliaoPhoto;
		}
		/**
		* 设置： 土壤肥料照片
		*/
		public void setTurangfeiliaoPhoto(String turangfeiliaoPhoto) {
			this.turangfeiliaoPhoto = turangfeiliaoPhoto;
		}
		/**
		* 获取： 土壤肥料类型
		*/
		public Integer getTurangfeiliaoTypes() {
			return turangfeiliaoTypes;
		}
		/**
		* 设置： 土壤肥料类型
		*/
		public void setTurangfeiliaoTypes(Integer turangfeiliaoTypes) {
			this.turangfeiliaoTypes = turangfeiliaoTypes;
		}


			/**
			* 获取： 土壤肥料类型的值
			*/
			public String getTurangfeiliaoValue() {
				return turangfeiliaoValue;
			}
			/**
			* 设置： 土壤肥料类型的值
			*/
			public void setTurangfeiliaoValue(String turangfeiliaoValue) {
				this.turangfeiliaoValue = turangfeiliaoValue;
			}

		/**
		* 获取： 土壤肥料热度
		*/
		public Integer getTurangfeiliaoClicknum() {
			return turangfeiliaoClicknum;
		}
		/**
		* 设置： 土壤肥料热度
		*/
		public void setTurangfeiliaoClicknum(Integer turangfeiliaoClicknum) {
			this.turangfeiliaoClicknum = turangfeiliaoClicknum;
		}

		/**
		* 获取： 土壤肥料详细介绍
		*/
		public String getTurangfeiliaoContent() {
			return turangfeiliaoContent;
		}
		/**
		* 设置： 土壤肥料详细介绍
		*/
		public void setTurangfeiliaoContent(String turangfeiliaoContent) {
			this.turangfeiliaoContent = turangfeiliaoContent;
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
		public Integer getTurangfeiliaoDelete() {
			return turangfeiliaoDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setTurangfeiliaoDelete(Integer turangfeiliaoDelete) {
			this.turangfeiliaoDelete = turangfeiliaoDelete;
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
		return "TurangfeiliaoLiuyanView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", turangfeiliaoName=" + turangfeiliaoName +
			", turangfeiliaoUuidNumber=" + turangfeiliaoUuidNumber +
			", turangfeiliaoPhoto=" + turangfeiliaoPhoto +
			", turangfeiliaoClicknum=" + turangfeiliaoClicknum +
			", turangfeiliaoContent=" + turangfeiliaoContent +
			", turangfeiliaoDelete=" + turangfeiliaoDelete +
			"} " + super.toString();
	}
}
