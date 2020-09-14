package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfSecYldrateDao;
import com.yss.risk.demo.entity.TsPfSecYldrateEntity;
import com.yss.risk.demo.service.TsPfSecYldrateService;


@Service("tsPfSecYldrateService")
public class TsPfSecYldrateServiceImpl extends ServiceImpl<TsPfSecYldrateDao, TsPfSecYldrateEntity> implements TsPfSecYldrateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfSecYldrateEntity> page = this.page(
                new Query<TsPfSecYldrateEntity>().getPage(params),
                new QueryWrapper<TsPfSecYldrateEntity>()
        );

        return new PageUtils(page);
    }

}