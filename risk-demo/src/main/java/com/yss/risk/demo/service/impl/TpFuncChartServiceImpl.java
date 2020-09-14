package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpFuncChartDao;
import com.yss.risk.demo.entity.TpFuncChartEntity;
import com.yss.risk.demo.service.TpFuncChartService;


@Service("tpFuncChartService")
public class TpFuncChartServiceImpl extends ServiceImpl<TpFuncChartDao, TpFuncChartEntity> implements TpFuncChartService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpFuncChartEntity> page = this.page(
                new Query<TpFuncChartEntity>().getPage(params),
                new QueryWrapper<TpFuncChartEntity>()
        );

        return new PageUtils(page);
    }

}