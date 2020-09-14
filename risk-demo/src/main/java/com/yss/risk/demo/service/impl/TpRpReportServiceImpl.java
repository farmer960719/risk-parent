package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpRpReportDao;
import com.yss.risk.demo.entity.TpRpReportEntity;
import com.yss.risk.demo.service.TpRpReportService;


@Service("tpRpReportService")
public class TpRpReportServiceImpl extends ServiceImpl<TpRpReportDao, TpRpReportEntity> implements TpRpReportService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpRpReportEntity> page = this.page(
                new Query<TpRpReportEntity>().getPage(params),
                new QueryWrapper<TpRpReportEntity>()
        );

        return new PageUtils(page);
    }

}