package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpRpCatalogEntity;

import java.util.Map;

/**
 * 报表目录文件表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:30
 */
public interface TpRpCatalogService extends IService<TpRpCatalogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

