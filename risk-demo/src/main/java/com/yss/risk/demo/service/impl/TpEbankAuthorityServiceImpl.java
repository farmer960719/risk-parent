package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpEbankAuthorityDao;
import com.yss.risk.demo.entity.TpEbankAuthorityEntity;
import com.yss.risk.demo.service.TpEbankAuthorityService;


@Service("tpEbankAuthorityService")
public class TpEbankAuthorityServiceImpl extends ServiceImpl<TpEbankAuthorityDao, TpEbankAuthorityEntity> implements TpEbankAuthorityService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpEbankAuthorityEntity> page = this.page(
                new Query<TpEbankAuthorityEntity>().getPage(params),
                new QueryWrapper<TpEbankAuthorityEntity>()
        );

        return new PageUtils(page);
    }

}