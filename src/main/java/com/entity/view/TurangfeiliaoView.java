package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.TurangfeiliaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 土壤肥料
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("turangfeiliao")
public class TurangfeiliaoView extends TurangfeiliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 土壤肥料类型的值
	*/
	@ColumnInfo(comment="土壤肥料类型的字典表值",type="varchar(200)")
	private String turangfeiliaoValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;




	public TurangfeiliaoView() {

	}

	public TurangfeiliaoView(TurangfeiliaoEntity turangfeiliaoEntity) {
		try {
			BeanUtils.copyProperties(this, turangfeiliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
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
	//当前表的
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




	@Override
	public String toString() {
		return "TurangfeiliaoView{" +
			", turangfeiliaoValue=" + turangfeiliaoValue +
			", shangxiaValue=" + shangxiaValue +
			"} " + super.toString();
	}
}
