package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpMkDate2Dao;
import com.yss.risk.demo.entity.TmpMkDate2Entity;
import com.yss.risk.demo.service.TmpMkDate2Service;


@Service("tmpMkDate2Service")
public class TmpMkDate2ServiceImpl extends ServiceImpl<TmpMkDate2Dao, TmpMkDate2Entity> implements TmpMkDate2Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpMkDate2Entity> page = this.page(
                new Query<TmpMkDate2Entity>().getPage(params),
                new QueryWrapper<TmpMkDate2Entity>()
        );

        return new PageUtils(page);
    }

}