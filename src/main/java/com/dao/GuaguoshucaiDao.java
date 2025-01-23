package com.dao;

import com.entity.GuaguoshucaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuaguoshucaiView;

/**
 * 瓜果蔬菜 Dao 接口
 *
 * @author 
 */
public interface GuaguoshucaiDao extends BaseMapper<GuaguoshucaiEntity> {

   List<GuaguoshucaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
