package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsMkStockRiskEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:23
 */
public interface TsMkStockRiskService extends IService<TsMkStockRiskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

