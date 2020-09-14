package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpEbankCustomerDao;
import com.yss.risk.demo.entity.TpEbankCustomerEntity;
import com.yss.risk.demo.service.TpEbankCustomerService;


@Service("tpEbankCustomerService")
public class TpEbankCustomerServiceImpl extends ServiceImpl<TpEbankCustomerDao, TpEbankCustomerEntity> implements TpEbankCustomerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpEbankCustomerEntity> page = this.page(
                new Query<TpEbankCustomerEntity>().getPage(params),
                new QueryWrapper<TpEbankCustomerEntity>()
        );

        return new PageUtils(page);
    }

}