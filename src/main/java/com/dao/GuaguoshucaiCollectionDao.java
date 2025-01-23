package com.dao;

import com.entity.GuaguoshucaiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuaguoshucaiCollectionView;

/**
 * 瓜果蔬菜收藏 Dao 接口
 *
 * @author 
 */
public interface GuaguoshucaiCollectionDao extends BaseMapper<GuaguoshucaiCollectionEntity> {

   List<GuaguoshucaiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
