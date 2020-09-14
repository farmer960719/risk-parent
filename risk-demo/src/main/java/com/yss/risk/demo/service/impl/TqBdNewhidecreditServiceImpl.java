package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TqBdNewhidecreditDao;
import com.yss.risk.demo.entity.TqBdNewhidecreditEntity;
import com.yss.risk.demo.service.TqBdNewhidecreditService;


@Service("tqBdNewhidecreditService")
public class TqBdNewhidecreditServiceImpl extends ServiceImpl<TqBdNewhidecreditDao, TqBdNewhidecreditEntity> implements TqBdNewhidecreditService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TqBdNewhidecreditEntity> page = this.page(
                new Query<TqBdNewhidecreditEntity>().getPage(params),
                new QueryWrapper<TqBdNewhidecreditEntity>()
        );

        return new PageUtils(page);
    }

}