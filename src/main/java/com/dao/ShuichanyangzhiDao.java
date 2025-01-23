package com.dao;

import com.entity.ShuichanyangzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuichanyangzhiView;

/**
 * 水产养殖 Dao 接口
 *
 * @author 
 */
public interface ShuichanyangzhiDao extends BaseMapper<ShuichanyangzhiEntity> {

   List<ShuichanyangzhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
