package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsMkBondInfoDao;
import com.yss.risk.demo.entity.TsMkBondInfoEntity;
import com.yss.risk.demo.service.TsMkBondInfoService;


@Service("tsMkBondInfoService")
public class TsMkBondInfoServiceImpl extends ServiceImpl<TsMkBondInfoDao, TsMkBondInfoEntity> implements TsMkBondInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsMkBondInfoEntity> page = this.page(
                new Query<TsMkBondInfoEntity>().getPage(params),
                new QueryWrapper<TsMkBondInfoEntity>()
        );

        return new PageUtils(page);
    }

}