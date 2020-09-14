package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfSecInfoEntity;

import java.util.Map;

/**
 * 证券每日基础指标
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:16
 */
public interface TsPfSecInfoService extends IService<TsPfSecInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

