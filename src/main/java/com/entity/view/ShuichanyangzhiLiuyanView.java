package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ShuichanyangzhiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 水产养殖留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("shuichanyangzhi_liuyan")
public class ShuichanyangzhiLiuyanView extends ShuichanyangzhiLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 水产养殖
		/**
		* 水产养殖标题
		*/

		@ColumnInfo(comment="水产养殖标题",type="varchar(200)")
		private String shuichanyangzhiName;
		/**
		* 水产养殖编号
		*/

		@ColumnInfo(comment="水产养殖编号",type="varchar(200)")
		private String shuichanyangzhiUuidNumber;
		/**
		* 水产养殖照片
		*/

		@ColumnInfo(comment="水产养殖照片",type="varchar(200)")
		private String shuichanyangzhiPhoto;
		/**
		* 水产养殖类型
		*/
		@ColumnInfo(comment="水产养殖类型",type="int(11)")
		private Integer shuichanyangzhiTypes;
			/**
			* 水产养殖类型的值
			*/
			@ColumnInfo(comment="水产养殖类型的字典表值",type="varchar(200)")
			private String shuichanyangzhiValue;
		/**
		* 水产养殖热度
		*/

		@ColumnInfo(comment="水产养殖热度",type="int(11)")
		private Integer shuichanyangzhiClicknum;
		/**
		* 水产养殖详细介绍
		*/

		@ColumnInfo(comment="水产养殖详细介绍",type="text")
		private String shuichanyangzhiContent;
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
		private Integer shuichanyangzhiDelete;
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



	public ShuichanyangzhiLiuyanView() {

	}

	public ShuichanyangzhiLiuyanView(ShuichanyangzhiLiuyanEntity shuichanyangzhiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, shuichanyangzhiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 水产养殖

		/**
		* 获取： 水产养殖标题
		*/
		public String getShuichanyangzhiName() {
			return shuichanyangzhiName;
		}
		/**
		* 设置： 水产养殖标题
		*/
		public void setShuichanyangzhiName(String shuichanyangzhiName) {
			this.shuichanyangzhiName = shuichanyangzhiName;
		}

		/**
		* 获取： 水产养殖编号
		*/
		public String getShuichanyangzhiUuidNumber() {
			return shuichanyangzhiUuidNumber;
		}
		/**
		* 设置： 水产养殖编号
		*/
		public void setShuichanyangzhiUuidNumber(String shuichanyangzhiUuidNumber) {
			this.shuichanyangzhiUuidNumber = shuichanyangzhiUuidNumber;
		}

		/**
		* 获取： 水产养殖照片
		*/
		public String getShuichanyangzhiPhoto() {
			return shuichanyangzhiPhoto;
		}
		/**
		* 设置： 水产养殖照片
		*/
		public void setShuichanyangzhiPhoto(String shuichanyangzhiPhoto) {
			this.shuichanyangzhiPhoto = shuichanyangzhiPhoto;
		}
		/**
		* 获取： 水产养殖类型
		*/
		public Integer getShuichanyangzhiTypes() {
			return shuichanyangzhiTypes;
		}
		/**
		* 设置： 水产养殖类型
		*/
		public void setShuichanyangzhiTypes(Integer shuichanyangzhiTypes) {
			this.shuichanyangzhiTypes = shuichanyangzhiTypes;
		}


			/**
			* 获取： 水产养殖类型的值
			*/
			public String getShuichanyangzhiValue() {
				return shuichanyangzhiValue;
			}
			/**
			* 设置： 水产养殖类型的值
			*/
			public void setShuichanyangzhiValue(String shuichanyangzhiValue) {
				this.shuichanyangzhiValue = shuichanyangzhiValue;
			}

		/**
		* 获取： 水产养殖热度
		*/
		public Integer getShuichanyangzhiClicknum() {
			return shuichanyangzhiClicknum;
		}
		/**
		* 设置： 水产养殖热度
		*/
		public void setShuichanyangzhiClicknum(Integer shuichanyangzhiClicknum) {
			this.shuichanyangzhiClicknum = shuichanyangzhiClicknum;
		}

		/**
		* 获取： 水产养殖详细介绍
		*/
		public String getShuichanyangzhiContent() {
			return shuichanyangzhiContent;
		}
		/**
		* 设置： 水产养殖详细介绍
		*/
		public void setShuichanyangzhiContent(String shuichanyangzhiContent) {
			this.shuichanyangzhiContent = shuichanyangzhiContent;
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
		public Integer getShuichanyangzhiDelete() {
			return shuichanyangzhiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setShuichanyangzhiDelete(Integer shuichanyangzhiDelete) {
			this.shuichanyangzhiDelete = shuichanyangzhiDelete;
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
		return "ShuichanyangzhiLiuyanView{" +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", shuichanyangzhiName=" + shuichanyangzhiName +
			", shuichanyangzhiUuidNumber=" + shuichanyangzhiUuidNumber +
			", shuichanyangzhiPhoto=" + shuichanyangzhiPhoto +
			", shuichanyangzhiClicknum=" + shuichanyangzhiClicknum +
			", shuichanyangzhiContent=" + shuichanyangzhiContent +
			", shuichanyangzhiDelete=" + shuichanyangzhiDelete +
			"} " + super.toString();
	}
}
