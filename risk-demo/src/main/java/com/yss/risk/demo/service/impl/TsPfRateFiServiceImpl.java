package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfRateFiDao;
import com.yss.risk.demo.entity.TsPfRateFiEntity;
import com.yss.risk.demo.service.TsPfRateFiService;


@Service("tsPfRateFiService")
public class TsPfRateFiServiceImpl extends ServiceImpl<TsPfRateFiDao, TsPfRateFiEntity> implements TsPfRateFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfRateFiEntity> page = this.page(
                new Query<TsPfRateFiEntity>().getPage(params),
                new QueryWrapper<TsPfRateFiEntity>()
        );

        return new PageUtils(page);
    }

}