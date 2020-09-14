package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfVolatilityDao;
import com.yss.risk.demo.entity.TsPfVolatilityEntity;
import com.yss.risk.demo.service.TsPfVolatilityService;


@Service("tsPfVolatilityService")
public class TsPfVolatilityServiceImpl extends ServiceImpl<TsPfVolatilityDao, TsPfVolatilityEntity> implements TsPfVolatilityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfVolatilityEntity> page = this.page(
                new Query<TsPfVolatilityEntity>().getPage(params),
                new QueryWrapper<TsPfVolatilityEntity>()
        );

        return new PageUtils(page);
    }

}