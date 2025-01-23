package com.dao;

import com.entity.NongyekejiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyekejiLiuyanView;

/**
 * 农业科技留言 Dao 接口
 *
 * @author 
 */
public interface NongyekejiLiuyanDao extends BaseMapper<NongyekejiLiuyanEntity> {

   List<NongyekejiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
