package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfSecIsFiEntity;

import java.util.Map;

/**
 * 组合个券投资风格
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:15
 */
public interface TsPfSecIsFiService extends IService<TsPfSecIsFiEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

