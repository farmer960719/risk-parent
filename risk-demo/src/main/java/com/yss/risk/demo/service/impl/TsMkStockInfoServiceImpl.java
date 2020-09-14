package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsMkStockInfoDao;
import com.yss.risk.demo.entity.TsMkStockInfoEntity;
import com.yss.risk.demo.service.TsMkStockInfoService;


@Service("tsMkStockInfoService")
public class TsMkStockInfoServiceImpl extends ServiceImpl<TsMkStockInfoDao, TsMkStockInfoEntity> implements TsMkStockInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsMkStockInfoEntity> page = this.page(
                new Query<TsMkStockInfoEntity>().getPage(params),
                new QueryWrapper<TsMkStockInfoEntity>()
        );

        return new PageUtils(page);
    }

}