package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfVarPcDao;
import com.yss.risk.demo.entity.TsPfVarPcEntity;
import com.yss.risk.demo.service.TsPfVarPcService;


@Service("tsPfVarPcService")
public class TsPfVarPcServiceImpl extends ServiceImpl<TsPfVarPcDao, TsPfVarPcEntity> implements TsPfVarPcService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfVarPcEntity> page = this.page(
                new Query<TsPfVarPcEntity>().getPage(params),
                new QueryWrapper<TsPfVarPcEntity>()
        );

        return new PageUtils(page);
    }

}