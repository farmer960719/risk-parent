package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpRpReportCatalogEntity;

import java.util.Map;

/**
 * 目录报表关系映射表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:29
 */
public interface TpRpReportCatalogService extends IService<TpRpReportCatalogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

