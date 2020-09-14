package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfMddEntity;

import java.util.Map;

/**
 * 回撤落地表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:17
 */
public interface TsPfMddService extends IService<TsPfMddEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

