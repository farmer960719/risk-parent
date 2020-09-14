package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfYldrateDao;
import com.yss.risk.demo.entity.TsPfYldrateEntity;
import com.yss.risk.demo.service.TsPfYldrateService;


@Service("tsPfYldrateService")
public class TsPfYldrateServiceImpl extends ServiceImpl<TsPfYldrateDao, TsPfYldrateEntity> implements TsPfYldrateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfYldrateEntity> page = this.page(
                new Query<TsPfYldrateEntity>().getPage(params),
                new QueryWrapper<TsPfYldrateEntity>()
        );

        return new PageUtils(page);
    }

}