package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfTrackingerrorDcmpDao;
import com.yss.risk.demo.entity.TsPfTrackingerrorDcmpEntity;
import com.yss.risk.demo.service.TsPfTrackingerrorDcmpService;


@Service("tsPfTrackingerrorDcmpService")
public class TsPfTrackingerrorDcmpServiceImpl extends ServiceImpl<TsPfTrackingerrorDcmpDao, TsPfTrackingerrorDcmpEntity> implements TsPfTrackingerrorDcmpService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfTrackingerrorDcmpEntity> page = this.page(
                new Query<TsPfTrackingerrorDcmpEntity>().getPage(params),
                new QueryWrapper<TsPfTrackingerrorDcmpEntity>()
        );

        return new PageUtils(page);
    }

}