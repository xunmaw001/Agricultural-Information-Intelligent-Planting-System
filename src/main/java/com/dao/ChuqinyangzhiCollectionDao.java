package com.dao;

import com.entity.ChuqinyangzhiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuqinyangzhiCollectionView;

/**
 * 畜禽养殖收藏 Dao 接口
 *
 * @author 
 */
public interface ChuqinyangzhiCollectionDao extends BaseMapper<ChuqinyangzhiCollectionEntity> {

   List<ChuqinyangzhiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
