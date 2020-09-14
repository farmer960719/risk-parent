package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsMkSecQuotationDao;
import com.yss.risk.demo.entity.TsMkSecQuotationEntity;
import com.yss.risk.demo.service.TsMkSecQuotationService;


@Service("tsMkSecQuotationService")
public class TsMkSecQuotationServiceImpl extends ServiceImpl<TsMkSecQuotationDao, TsMkSecQuotationEntity> implements TsMkSecQuotationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsMkSecQuotationEntity> page = this.page(
                new Query<TsMkSecQuotationEntity>().getPage(params),
                new QueryWrapper<TsMkSecQuotationEntity>()
        );

        return new PageUtils(page);
    }

}