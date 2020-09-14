package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfSecAccYldrateDao;
import com.yss.risk.demo.entity.TsPfSecAccYldrateEntity;
import com.yss.risk.demo.service.TsPfSecAccYldrateService;


@Service("tsPfSecAccYldrateService")
public class TsPfSecAccYldrateServiceImpl extends ServiceImpl<TsPfSecAccYldrateDao, TsPfSecAccYldrateEntity> implements TsPfSecAccYldrateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfSecAccYldrateEntity> page = this.page(
                new Query<TsPfSecAccYldrateEntity>().getPage(params),
                new QueryWrapper<TsPfSecAccYldrateEntity>()
        );

        return new PageUtils(page);
    }

}