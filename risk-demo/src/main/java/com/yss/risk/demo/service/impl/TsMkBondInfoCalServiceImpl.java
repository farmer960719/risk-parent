package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsMkBondInfoCalDao;
import com.yss.risk.demo.entity.TsMkBondInfoCalEntity;
import com.yss.risk.demo.service.TsMkBondInfoCalService;


@Service("tsMkBondInfoCalService")
public class TsMkBondInfoCalServiceImpl extends ServiceImpl<TsMkBondInfoCalDao, TsMkBondInfoCalEntity> implements TsMkBondInfoCalService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsMkBondInfoCalEntity> page = this.page(
                new Query<TsMkBondInfoCalEntity>().getPage(params),
                new QueryWrapper<TsMkBondInfoCalEntity>()
        );

        return new PageUtils(page);
    }

}