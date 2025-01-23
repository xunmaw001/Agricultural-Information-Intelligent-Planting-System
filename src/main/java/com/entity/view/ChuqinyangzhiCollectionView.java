package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ChuqinyangzhiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 畜禽养殖收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("chuqinyangzhi_collection")
public class ChuqinyangzhiCollectionView extends ChuqinyangzhiCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String chuqinyangzhiCollectionValue;

	//级联表 畜禽养殖
		/**
		* 畜禽养殖标题
		*/

		@ColumnInfo(comment="畜禽养殖标题",type="varchar(200)")
		private String chuqinyangzhiName;
		/**
		* 畜禽养殖编号
		*/

		@ColumnInfo(comment="畜禽养殖编号",type="varchar(200)")
		private String chuqinyangzhiUuidNumber;
		/**
		* 畜禽养殖照片
		*/

		@ColumnInfo(comment="畜禽养殖照片",type="varchar(200)")
		private String chuqinyangzhiPhoto;
		/**
		* 畜禽养殖类型
		*/
		@ColumnInfo(comment="畜禽养殖类型",type="int(11)")
		private Integer chuqinyangzhiTypes;
			/**
			* 畜禽养殖类型的值
			*/
			@ColumnInfo(comment="畜禽养殖类型的字典表值",type="varchar(200)")
			private String chuqinyangzhiValue;
		/**
		* 畜禽养殖热度
		*/

		@ColumnInfo(comment="畜禽养殖热度",type="int(11)")
		private Integer chuqinyangzhiClicknum;
		/**
		* 畜禽养殖详细介绍
		*/

		@ColumnInfo(comment="畜禽养殖详细介绍",type="text")
		private String chuqinyangzhiContent;
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
		private Integer chuqinyangzhiDelete;
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



	public ChuqinyangzhiCollectionView() {

	}

	public ChuqinyangzhiCollectionView(ChuqinyangzhiCollectionEntity chuqinyangzhiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, chuqinyangzhiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getChuqinyangzhiCollectionValue() {
		return chuqinyangzhiCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setChuqinyangzhiCollectionValue(String chuqinyangzhiCollectionValue) {
		this.chuqinyangzhiCollectionValue = chuqinyangzhiCollectionValue;
	}


	//级联表的get和set 畜禽养殖

		/**
		* 获取： 畜禽养殖标题
		*/
		public String getChuqinyangzhiName() {
			return chuqinyangzhiName;
		}
		/**
		* 设置： 畜禽养殖标题
		*/
		public void setChuqinyangzhiName(String chuqinyangzhiName) {
			this.chuqinyangzhiName = chuqinyangzhiName;
		}

		/**
		* 获取： 畜禽养殖编号
		*/
		public String getChuqinyangzhiUuidNumber() {
			return chuqinyangzhiUuidNumber;
		}
		/**
		* 设置： 畜禽养殖编号
		*/
		public void setChuqinyangzhiUuidNumber(String chuqinyangzhiUuidNumber) {
			this.chuqinyangzhiUuidNumber = chuqinyangzhiUuidNumber;
		}

		/**
		* 获取： 畜禽养殖照片
		*/
		public String getChuqinyangzhiPhoto() {
			return chuqinyangzhiPhoto;
		}
		/**
		* 设置： 畜禽养殖照片
		*/
		public void setChuqinyangzhiPhoto(String chuqinyangzhiPhoto) {
			this.chuqinyangzhiPhoto = chuqinyangzhiPhoto;
		}
		/**
		* 获取： 畜禽养殖类型
		*/
		public Integer getChuqinyangzhiTypes() {
			return chuqinyangzhiTypes;
		}
		/**
		* 设置： 畜禽养殖类型
		*/
		public void setChuqinyangzhiTypes(Integer chuqinyangzhiTypes) {
			this.chuqinyangzhiTypes = chuqinyangzhiTypes;
		}


			/**
			* 获取： 畜禽养殖类型的值
			*/
			public String getChuqinyangzhiValue() {
				return chuqinyangzhiValue;
			}
			/**
			* 设置： 畜禽养殖类型的值
			*/
			public void setChuqinyangzhiValue(String chuqinyangzhiValue) {
				this.chuqinyangzhiValue = chuqinyangzhiValue;
			}

		/**
		* 获取： 畜禽养殖热度
		*/
		public Integer getChuqinyangzhiClicknum() {
			return chuqinyangzhiClicknum;
		}
		/**
		* 设置： 畜禽养殖热度
		*/
		public void setChuqinyangzhiClicknum(Integer chuqinyangzhiClicknum) {
			this.chuqinyangzhiClicknum = chuqinyangzhiClicknum;
		}

		/**
		* 获取： 畜禽养殖详细介绍
		*/
		public String getChuqinyangzhiContent() {
			return chuqinyangzhiContent;
		}
		/**
		* 设置： 畜禽养殖详细介绍
		*/
		public void setChuqinyangzhiContent(String chuqinyangzhiContent) {
			this.chuqinyangzhiContent = chuqinyangzhiContent;
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
		public Integer getChuqinyangzhiDelete() {
			return chuqinyangzhiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setChuqinyangzhiDelete(Integer chuqinyangzhiDelete) {
			this.chuqinyangzhiDelete = chuqinyangzhiDelete;
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
		return "ChuqinyangzhiCollectionView{" +
			", chuqinyangzhiCollectionValue=" + chuqinyangzhiCollectionValue +
			", chuqinyangzhiName=" + chuqinyangzhiName +
			", chuqinyangzhiUuidNumber=" + chuqinyangzhiUuidNumber +
			", chuqinyangzhiPhoto=" + chuqinyangzhiPhoto +
			", chuqinyangzhiClicknum=" + chuqinyangzhiClicknum +
			", chuqinyangzhiContent=" + chuqinyangzhiContent +
			", chuqinyangzhiDelete=" + chuqinyangzhiDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
