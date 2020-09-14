package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpRpCatalogDao;
import com.yss.risk.demo.entity.TpRpCatalogEntity;
import com.yss.risk.demo.service.TpRpCatalogService;


@Service("tpRpCatalogService")
public class TpRpCatalogServiceImpl extends ServiceImpl<TpRpCatalogDao, TpRpCatalogEntity> implements TpRpCatalogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpRpCatalogEntity> page = this.page(
                new Query<TpRpCatalogEntity>().getPage(params),
                new QueryWrapper<TpRpCatalogEntity>()
        );

        return new PageUtils(page);
    }

}