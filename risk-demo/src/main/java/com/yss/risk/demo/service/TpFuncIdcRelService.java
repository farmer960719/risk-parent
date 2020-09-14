package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpFuncIdcRelEntity;

import java.util.Map;

/**
 * 定义自定义功能中每个列对应的指标类
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:33
 */
public interface TpFuncIdcRelService extends IService<TpFuncIdcRelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

