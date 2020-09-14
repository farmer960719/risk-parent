package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfBrisonFiDao;
import com.yss.risk.demo.entity.TsPfBrisonFiEntity;
import com.yss.risk.demo.service.TsPfBrisonFiService;


@Service("tsPfBrisonFiService")
public class TsPfBrisonFiServiceImpl extends ServiceImpl<TsPfBrisonFiDao, TsPfBrisonFiEntity> implements TsPfBrisonFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfBrisonFiEntity> page = this.page(
                new Query<TsPfBrisonFiEntity>().getPage(params),
                new QueryWrapper<TsPfBrisonFiEntity>()
        );

        return new PageUtils(page);
    }

}