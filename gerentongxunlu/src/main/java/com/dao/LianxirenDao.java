package com.dao;

import com.entity.LianxirenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LianxirenView;

/**
 * 联系人 Dao 接口
 *
 * @author 
 * @since 2021-04-20
 */
public interface LianxirenDao extends BaseMapper<LianxirenEntity> {

   List<LianxirenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
