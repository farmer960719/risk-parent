package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfBrisonFiEntity;

import java.util.Map;

/**
 * Brison结果表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:19
 */
public interface TsPfBrisonFiService extends IService<TsPfBrisonFiEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

