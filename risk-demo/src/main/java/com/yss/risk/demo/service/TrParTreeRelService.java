package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TrParTreeRelEntity;

import java.util.Map;

/**
 * 外部组合树定义表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:25
 */
public interface TrParTreeRelService extends IService<TrParTreeRelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

