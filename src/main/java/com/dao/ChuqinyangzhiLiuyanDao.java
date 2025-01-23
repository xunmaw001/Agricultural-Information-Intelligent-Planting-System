package com.dao;

import com.entity.ChuqinyangzhiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuqinyangzhiLiuyanView;

/**
 * 畜禽养殖留言 Dao 接口
 *
 * @author 
 */
public interface ChuqinyangzhiLiuyanDao extends BaseMapper<ChuqinyangzhiLiuyanEntity> {

   List<ChuqinyangzhiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
