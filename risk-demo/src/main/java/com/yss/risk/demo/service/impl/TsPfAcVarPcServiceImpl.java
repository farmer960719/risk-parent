package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcVarPcDao;
import com.yss.risk.demo.entity.TsPfAcVarPcEntity;
import com.yss.risk.demo.service.TsPfAcVarPcService;


@Service("tsPfAcVarPcService")
public class TsPfAcVarPcServiceImpl extends ServiceImpl<TsPfAcVarPcDao, TsPfAcVarPcEntity> implements TsPfAcVarPcService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcVarPcEntity> page = this.page(
                new Query<TsPfAcVarPcEntity>().getPage(params),
                new QueryWrapper<TsPfAcVarPcEntity>()
        );

        return new PageUtils(page);
    }

}