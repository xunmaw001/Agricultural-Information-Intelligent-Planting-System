package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GuaguoshucaiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 瓜果蔬菜收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("guaguoshucai_collection")
public class GuaguoshucaiCollectionView extends GuaguoshucaiCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String guaguoshucaiCollectionValue;

	//级联表 瓜果蔬菜
		/**
		* 瓜果蔬菜标题
		*/

		@ColumnInfo(comment="瓜果蔬菜标题",type="varchar(200)")
		private String guaguoshucaiName;
		/**
		* 瓜果蔬菜编号
		*/

		@ColumnInfo(comment="瓜果蔬菜编号",type="varchar(200)")
		private String guaguoshucaiUuidNumber;
		/**
		* 瓜果蔬菜照片
		*/

		@ColumnInfo(comment="瓜果蔬菜照片",type="varchar(200)")
		private String guaguoshucaiPhoto;
		/**
		* 瓜果蔬菜类型
		*/
		@ColumnInfo(comment="瓜果蔬菜类型",type="int(11)")
		private Integer guaguoshucaiTypes;
			/**
			* 瓜果蔬菜类型的值
			*/
			@ColumnInfo(comment="瓜果蔬菜类型的字典表值",type="varchar(200)")
			private String guaguoshucaiValue;
		/**
		* 瓜果蔬菜热度
		*/

		@ColumnInfo(comment="瓜果蔬菜热度",type="int(11)")
		private Integer guaguoshucaiClicknum;
		/**
		* 瓜果蔬菜详细介绍
		*/

		@ColumnInfo(comment="瓜果蔬菜详细介绍",type="text")
		private String guaguoshucaiContent;
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
		private Integer guaguoshucaiDelete;
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



	public GuaguoshucaiCollectionView() {

	}

	public GuaguoshucaiCollectionView(GuaguoshucaiCollectionEntity guaguoshucaiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, guaguoshucaiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getGuaguoshucaiCollectionValue() {
		return guaguoshucaiCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setGuaguoshucaiCollectionValue(String guaguoshucaiCollectionValue) {
		this.guaguoshucaiCollectionValue = guaguoshucaiCollectionValue;
	}


	//级联表的get和set 瓜果蔬菜

		/**
		* 获取： 瓜果蔬菜标题
		*/
		public String getGuaguoshucaiName() {
			return guaguoshucaiName;
		}
		/**
		* 设置： 瓜果蔬菜标题
		*/
		public void setGuaguoshucaiName(String guaguoshucaiName) {
			this.guaguoshucaiName = guaguoshucaiName;
		}

		/**
		* 获取： 瓜果蔬菜编号
		*/
		public String getGuaguoshucaiUuidNumber() {
			return guaguoshucaiUuidNumber;
		}
		/**
		* 设置： 瓜果蔬菜编号
		*/
		public void setGuaguoshucaiUuidNumber(String guaguoshucaiUuidNumber) {
			this.guaguoshucaiUuidNumber = guaguoshucaiUuidNumber;
		}

		/**
		* 获取： 瓜果蔬菜照片
		*/
		public String getGuaguoshucaiPhoto() {
			return guaguoshucaiPhoto;
		}
		/**
		* 设置： 瓜果蔬菜照片
		*/
		public void setGuaguoshucaiPhoto(String guaguoshucaiPhoto) {
			this.guaguoshucaiPhoto = guaguoshucaiPhoto;
		}
		/**
		* 获取： 瓜果蔬菜类型
		*/
		public Integer getGuaguoshucaiTypes() {
			return guaguoshucaiTypes;
		}
		/**
		* 设置： 瓜果蔬菜类型
		*/
		public void setGuaguoshucaiTypes(Integer guaguoshucaiTypes) {
			this.guaguoshucaiTypes = guaguoshucaiTypes;
		}


			/**
			* 获取： 瓜果蔬菜类型的值
			*/
			public String getGuaguoshucaiValue() {
				return guaguoshucaiValue;
			}
			/**
			* 设置： 瓜果蔬菜类型的值
			*/
			public void setGuaguoshucaiValue(String guaguoshucaiValue) {
				this.guaguoshucaiValue = guaguoshucaiValue;
			}

		/**
		* 获取： 瓜果蔬菜热度
		*/
		public Integer getGuaguoshucaiClicknum() {
			return guaguoshucaiClicknum;
		}
		/**
		* 设置： 瓜果蔬菜热度
		*/
		public void setGuaguoshucaiClicknum(Integer guaguoshucaiClicknum) {
			this.guaguoshucaiClicknum = guaguoshucaiClicknum;
		}

		/**
		* 获取： 瓜果蔬菜详细介绍
		*/
		public String getGuaguoshucaiContent() {
			return guaguoshucaiContent;
		}
		/**
		* 设置： 瓜果蔬菜详细介绍
		*/
		public void setGuaguoshucaiContent(String guaguoshucaiContent) {
			this.guaguoshucaiContent = guaguoshucaiContent;
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
		public Integer getGuaguoshucaiDelete() {
			return guaguoshucaiDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setGuaguoshucaiDelete(Integer guaguoshucaiDelete) {
			this.guaguoshucaiDelete = guaguoshucaiDelete;
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
		return "GuaguoshucaiCollectionView{" +
			", guaguoshucaiCollectionValue=" + guaguoshucaiCollectionValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", guaguoshucaiName=" + guaguoshucaiName +
			", guaguoshucaiUuidNumber=" + guaguoshucaiUuidNumber +
			", guaguoshucaiPhoto=" + guaguoshucaiPhoto +
			", guaguoshucaiClicknum=" + guaguoshucaiClicknum +
			", guaguoshucaiContent=" + guaguoshucaiContent +
			", guaguoshucaiDelete=" + guaguoshucaiDelete +
			"} " + super.toString();
	}
}
