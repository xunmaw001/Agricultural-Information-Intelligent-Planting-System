package com.dao;

import com.entity.ShuichanyangzhiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuichanyangzhiLiuyanView;

/**
 * 水产养殖留言 Dao 接口
 *
 * @author 
 */
public interface ShuichanyangzhiLiuyanDao extends BaseMapper<ShuichanyangzhiLiuyanEntity> {

   List<ShuichanyangzhiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
