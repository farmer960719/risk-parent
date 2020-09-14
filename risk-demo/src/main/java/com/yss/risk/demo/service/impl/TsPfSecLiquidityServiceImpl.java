package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfSecLiquidityDao;
import com.yss.risk.demo.entity.TsPfSecLiquidityEntity;
import com.yss.risk.demo.service.TsPfSecLiquidityService;


@Service("tsPfSecLiquidityService")
public class TsPfSecLiquidityServiceImpl extends ServiceImpl<TsPfSecLiquidityDao, TsPfSecLiquidityEntity> implements TsPfSecLiquidityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfSecLiquidityEntity> page = this.page(
                new Query<TsPfSecLiquidityEntity>().getPage(params),
                new QueryWrapper<TsPfSecLiquidityEntity>()
        );

        return new PageUtils(page);
    }

}