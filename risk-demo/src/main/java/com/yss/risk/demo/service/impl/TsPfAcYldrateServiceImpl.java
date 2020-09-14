package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcYldrateDao;
import com.yss.risk.demo.entity.TsPfAcYldrateEntity;
import com.yss.risk.demo.service.TsPfAcYldrateService;


@Service("tsPfAcYldrateService")
public class TsPfAcYldrateServiceImpl extends ServiceImpl<TsPfAcYldrateDao, TsPfAcYldrateEntity> implements TsPfAcYldrateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcYldrateEntity> page = this.page(
                new Query<TsPfAcYldrateEntity>().getPage(params),
                new QueryWrapper<TsPfAcYldrateEntity>()
        );

        return new PageUtils(page);
    }

}