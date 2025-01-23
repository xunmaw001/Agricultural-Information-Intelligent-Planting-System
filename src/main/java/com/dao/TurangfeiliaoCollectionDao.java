package com.dao;

import com.entity.TurangfeiliaoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TurangfeiliaoCollectionView;

/**
 * 土壤肥料收藏 Dao 接口
 *
 * @author 
 */
public interface TurangfeiliaoCollectionDao extends BaseMapper<TurangfeiliaoCollectionEntity> {

   List<TurangfeiliaoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
