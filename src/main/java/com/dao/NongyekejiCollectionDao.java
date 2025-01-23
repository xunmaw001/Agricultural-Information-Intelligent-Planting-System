package com.dao;

import com.entity.NongyekejiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyekejiCollectionView;

/**
 * 农业科技收藏 Dao 接口
 *
 * @author 
 */
public interface NongyekejiCollectionDao extends BaseMapper<NongyekejiCollectionEntity> {

   List<NongyekejiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
