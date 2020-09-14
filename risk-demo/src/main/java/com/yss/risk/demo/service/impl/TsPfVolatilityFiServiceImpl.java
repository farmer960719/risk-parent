package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfVolatilityFiDao;
import com.yss.risk.demo.entity.TsPfVolatilityFiEntity;
import com.yss.risk.demo.service.TsPfVolatilityFiService;


@Service("tsPfVolatilityFiService")
public class TsPfVolatilityFiServiceImpl extends ServiceImpl<TsPfVolatilityFiDao, TsPfVolatilityFiEntity> implements TsPfVolatilityFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfVolatilityFiEntity> page = this.page(
                new Query<TsPfVolatilityFiEntity>().getPage(params),
                new QueryWrapper<TsPfVolatilityFiEntity>()
        );

        return new PageUtils(page);
    }

}