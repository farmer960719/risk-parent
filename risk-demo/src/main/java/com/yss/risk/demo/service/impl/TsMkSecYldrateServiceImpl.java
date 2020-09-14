package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsMkSecYldrateDao;
import com.yss.risk.demo.entity.TsMkSecYldrateEntity;
import com.yss.risk.demo.service.TsMkSecYldrateService;


@Service("tsMkSecYldrateService")
public class TsMkSecYldrateServiceImpl extends ServiceImpl<TsMkSecYldrateDao, TsMkSecYldrateEntity> implements TsMkSecYldrateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsMkSecYldrateEntity> page = this.page(
                new Query<TsMkSecYldrateEntity>().getPage(params),
                new QueryWrapper<TsMkSecYldrateEntity>()
        );

        return new PageUtils(page);
    }

}