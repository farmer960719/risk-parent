package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpPfGrouptreeSec0904Dao;
import com.yss.risk.demo.entity.TmpPfGrouptreeSec0904Entity;
import com.yss.risk.demo.service.TmpPfGrouptreeSec0904Service;


@Service("tmpPfGrouptreeSec0904Service")
public class TmpPfGrouptreeSec0904ServiceImpl extends ServiceImpl<TmpPfGrouptreeSec0904Dao, TmpPfGrouptreeSec0904Entity> implements TmpPfGrouptreeSec0904Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpPfGrouptreeSec0904Entity> page = this.page(
                new Query<TmpPfGrouptreeSec0904Entity>().getPage(params),
                new QueryWrapper<TmpPfGrouptreeSec0904Entity>()
        );

        return new PageUtils(page);
    }

}