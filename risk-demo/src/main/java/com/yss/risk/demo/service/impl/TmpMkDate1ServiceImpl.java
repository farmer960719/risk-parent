package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpMkDate1Dao;
import com.yss.risk.demo.entity.TmpMkDate1Entity;
import com.yss.risk.demo.service.TmpMkDate1Service;


@Service("tmpMkDate1Service")
public class TmpMkDate1ServiceImpl extends ServiceImpl<TmpMkDate1Dao, TmpMkDate1Entity> implements TmpMkDate1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpMkDate1Entity> page = this.page(
                new Query<TmpMkDate1Entity>().getPage(params),
                new QueryWrapper<TmpMkDate1Entity>()
        );

        return new PageUtils(page);
    }

}