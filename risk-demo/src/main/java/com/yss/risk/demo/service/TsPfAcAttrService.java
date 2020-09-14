package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfAcAttrEntity;

import java.util.Map;

/**
 * tabledesc
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:23
 */
public interface TsPfAcAttrService extends IService<TsPfAcAttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

