package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsMkBondCashflowDao;
import com.yss.risk.demo.entity.TsMkBondCashflowEntity;
import com.yss.risk.demo.service.TsMkBondCashflowService;


@Service("tsMkBondCashflowService")
public class TsMkBondCashflowServiceImpl extends ServiceImpl<TsMkBondCashflowDao, TsMkBondCashflowEntity> implements TsMkBondCashflowService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsMkBondCashflowEntity> page = this.page(
                new Query<TsMkBondCashflowEntity>().getPage(params),
                new QueryWrapper<TsMkBondCashflowEntity>()
        );

        return new PageUtils(page);
    }

}