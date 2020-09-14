package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfAcVarPcEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:21
 */
public interface TsPfAcVarPcService extends IService<TsPfAcVarPcEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

