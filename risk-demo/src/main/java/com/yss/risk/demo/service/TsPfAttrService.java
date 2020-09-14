package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfAttrEntity;

import java.util.Map;

/**
 * tabledesc
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:20
 */
public interface TsPfAttrService extends IService<TsPfAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

