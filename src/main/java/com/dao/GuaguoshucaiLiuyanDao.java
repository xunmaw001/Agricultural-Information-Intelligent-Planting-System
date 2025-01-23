package com.dao;

import com.entity.GuaguoshucaiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuaguoshucaiLiuyanView;

/**
 * 瓜果蔬菜留言 Dao 接口
 *
 * @author 
 */
public interface GuaguoshucaiLiuyanDao extends BaseMapper<GuaguoshucaiLiuyanEntity> {

   List<GuaguoshucaiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
