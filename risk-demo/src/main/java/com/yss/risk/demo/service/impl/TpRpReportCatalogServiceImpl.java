package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpRpReportCatalogDao;
import com.yss.risk.demo.entity.TpRpReportCatalogEntity;
import com.yss.risk.demo.service.TpRpReportCatalogService;


@Service("tpRpReportCatalogService")
public class TpRpReportCatalogServiceImpl extends ServiceImpl<TpRpReportCatalogDao, TpRpReportCatalogEntity> implements TpRpReportCatalogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpRpReportCatalogEntity> page = this.page(
                new Query<TpRpReportCatalogEntity>().getPage(params),
                new QueryWrapper<TpRpReportCatalogEntity>()
        );

        return new PageUtils(page);
    }

}