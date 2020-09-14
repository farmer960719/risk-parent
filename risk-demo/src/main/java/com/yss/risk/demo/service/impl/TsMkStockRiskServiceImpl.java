package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsMkStockRiskDao;
import com.yss.risk.demo.entity.TsMkStockRiskEntity;
import com.yss.risk.demo.service.TsMkStockRiskService;


@Service("tsMkStockRiskService")
public class TsMkStockRiskServiceImpl extends ServiceImpl<TsMkStockRiskDao, TsMkStockRiskEntity> implements TsMkStockRiskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsMkStockRiskEntity> page = this.page(
                new Query<TsMkStockRiskEntity>().getPage(params),
                new QueryWrapper<TsMkStockRiskEntity>()
        );

        return new PageUtils(page);
    }

}