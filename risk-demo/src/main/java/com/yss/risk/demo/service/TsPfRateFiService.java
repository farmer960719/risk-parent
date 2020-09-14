package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfRateFiEntity;

import java.util.Map;

/**
 * 组合收益分析
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:17
 */
public interface TsPfRateFiService extends IService<TsPfRateFiEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

