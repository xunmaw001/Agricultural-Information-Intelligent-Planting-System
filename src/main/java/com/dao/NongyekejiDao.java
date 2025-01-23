package com.dao;

import com.entity.NongyekejiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyekejiView;

/**
 * 农业科技 Dao 接口
 *
 * @author 
 */
public interface NongyekejiDao extends BaseMapper<NongyekejiEntity> {

   List<NongyekejiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
