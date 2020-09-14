package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcBrisonFiDao;
import com.yss.risk.demo.entity.TsPfAcBrisonFiEntity;
import com.yss.risk.demo.service.TsPfAcBrisonFiService;


@Service("tsPfAcBrisonFiService")
public class TsPfAcBrisonFiServiceImpl extends ServiceImpl<TsPfAcBrisonFiDao, TsPfAcBrisonFiEntity> implements TsPfAcBrisonFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcBrisonFiEntity> page = this.page(
                new Query<TsPfAcBrisonFiEntity>().getPage(params),
                new QueryWrapper<TsPfAcBrisonFiEntity>()
        );

        return new PageUtils(page);
    }

}