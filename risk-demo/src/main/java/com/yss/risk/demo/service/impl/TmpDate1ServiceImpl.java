package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpDate1Dao;
import com.yss.risk.demo.entity.TmpDate1Entity;
import com.yss.risk.demo.service.TmpDate1Service;


@Service("tmpDate1Service")
public class TmpDate1ServiceImpl extends ServiceImpl<TmpDate1Dao, TmpDate1Entity> implements TmpDate1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpDate1Entity> page = this.page(
                new Query<TmpDate1Entity>().getPage(params),
                new QueryWrapper<TmpDate1Entity>()
        );

        return new PageUtils(page);
    }

}