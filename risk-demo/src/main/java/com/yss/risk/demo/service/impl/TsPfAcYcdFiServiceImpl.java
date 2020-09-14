package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcYcdFiDao;
import com.yss.risk.demo.entity.TsPfAcYcdFiEntity;
import com.yss.risk.demo.service.TsPfAcYcdFiService;


@Service("tsPfAcYcdFiService")
public class TsPfAcYcdFiServiceImpl extends ServiceImpl<TsPfAcYcdFiDao, TsPfAcYcdFiEntity> implements TsPfAcYcdFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcYcdFiEntity> page = this.page(
                new Query<TsPfAcYcdFiEntity>().getPage(params),
                new QueryWrapper<TsPfAcYcdFiEntity>()
        );

        return new PageUtils(page);
    }

}