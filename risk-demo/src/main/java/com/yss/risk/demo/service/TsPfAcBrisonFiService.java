package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfAcBrisonFiEntity;

import java.util.Map;

/**
 * Brison结果表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:22
 */
public interface TsPfAcBrisonFiService extends IService<TsPfAcBrisonFiEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

