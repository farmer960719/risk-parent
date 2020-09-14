package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfSecAttrEntity;

import java.util.Map;

/**
 * tabledesc
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:16
 */
public interface TsPfSecAttrService extends IService<TsPfSecAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

