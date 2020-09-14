package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTsPfAcInfo0904Dao;
import com.yss.risk.demo.entity.TmpTsPfAcInfo0904Entity;
import com.yss.risk.demo.service.TmpTsPfAcInfo0904Service;


@Service("tmpTsPfAcInfo0904Service")
public class TmpTsPfAcInfo0904ServiceImpl extends ServiceImpl<TmpTsPfAcInfo0904Dao, TmpTsPfAcInfo0904Entity> implements TmpTsPfAcInfo0904Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTsPfAcInfo0904Entity> page = this.page(
                new Query<TmpTsPfAcInfo0904Entity>().getPage(params),
                new QueryWrapper<TmpTsPfAcInfo0904Entity>()
        );

        return new PageUtils(page);
    }

}