package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTkPfBenchDao;
import com.yss.risk.demo.entity.TmpTkPfBenchEntity;
import com.yss.risk.demo.service.TmpTkPfBenchService;


@Service("tmpTkPfBenchService")
public class TmpTkPfBenchServiceImpl extends ServiceImpl<TmpTkPfBenchDao, TmpTkPfBenchEntity> implements TmpTkPfBenchService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTkPfBenchEntity> page = this.page(
                new Query<TmpTkPfBenchEntity>().getPage(params),
                new QueryWrapper<TmpTkPfBenchEntity>()
        );

        return new PageUtils(page);
    }

}