package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfSecAccYldrate1Dao;
import com.yss.risk.demo.entity.TsPfSecAccYldrate1Entity;
import com.yss.risk.demo.service.TsPfSecAccYldrate1Service;


@Service("tsPfSecAccYldrate1Service")
public class TsPfSecAccYldrate1ServiceImpl extends ServiceImpl<TsPfSecAccYldrate1Dao, TsPfSecAccYldrate1Entity> implements TsPfSecAccYldrate1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfSecAccYldrate1Entity> page = this.page(
                new Query<TsPfSecAccYldrate1Entity>().getPage(params),
                new QueryWrapper<TsPfSecAccYldrate1Entity>()
        );

        return new PageUtils(page);
    }

}