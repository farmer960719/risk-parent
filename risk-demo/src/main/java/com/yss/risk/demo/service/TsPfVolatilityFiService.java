package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfVolatilityFiEntity;

import java.util.Map;

/**
 * 组合风险指标
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:10
 */
public interface TsPfVolatilityFiService extends IService<TsPfVolatilityFiEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

