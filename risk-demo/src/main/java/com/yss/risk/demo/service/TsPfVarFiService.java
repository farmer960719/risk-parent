package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfVarFiEntity;

import java.util.Map;

/**
 * 组合风险指标
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:12
 */
public interface TsPfVarFiService extends IService<TsPfVarFiEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

