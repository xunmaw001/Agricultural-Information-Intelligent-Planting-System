package com.dao;

import com.entity.ChuqinyangzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuqinyangzhiView;

/**
 * 畜禽养殖 Dao 接口
 *
 * @author 
 */
public interface ChuqinyangzhiDao extends BaseMapper<ChuqinyangzhiEntity> {

   List<ChuqinyangzhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
