package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfDeviationDcmpDao;
import com.yss.risk.demo.entity.TsPfDeviationDcmpEntity;
import com.yss.risk.demo.service.TsPfDeviationDcmpService;


@Service("tsPfDeviationDcmpService")
public class TsPfDeviationDcmpServiceImpl extends ServiceImpl<TsPfDeviationDcmpDao, TsPfDeviationDcmpEntity> implements TsPfDeviationDcmpService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfDeviationDcmpEntity> page = this.page(
                new Query<TsPfDeviationDcmpEntity>().getPage(params),
                new QueryWrapper<TsPfDeviationDcmpEntity>()
        );

        return new PageUtils(page);
    }

}