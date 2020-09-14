package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpDate2Dao;
import com.yss.risk.demo.entity.TmpDate2Entity;
import com.yss.risk.demo.service.TmpDate2Service;


@Service("tmpDate2Service")
public class TmpDate2ServiceImpl extends ServiceImpl<TmpDate2Dao, TmpDate2Entity> implements TmpDate2Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpDate2Entity> page = this.page(
                new Query<TmpDate2Entity>().getPage(params),
                new QueryWrapper<TmpDate2Entity>()
        );

        return new PageUtils(page);
    }

}