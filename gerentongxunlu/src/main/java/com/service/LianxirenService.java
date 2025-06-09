package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LianxirenEntity;
import java.util.Map;

/**
 * 联系人 服务类
 * @author 
 * @since 2021-04-20
 */
public interface LianxirenService extends IService<LianxirenEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}