package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpGlClassDatadict6Dao;
import com.yss.risk.demo.entity.TpGlClassDatadict6Entity;
import com.yss.risk.demo.service.TpGlClassDatadict6Service;


@Service("tpGlClassDatadict6Service")
public class TpGlClassDatadict6ServiceImpl extends ServiceImpl<TpGlClassDatadict6Dao, TpGlClassDatadict6Entity> implements TpGlClassDatadict6Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpGlClassDatadict6Entity> page = this.page(
                new Query<TpGlClassDatadict6Entity>().getPage(params),
                new QueryWrapper<TpGlClassDatadict6Entity>()
        );

        return new PageUtils(page);
    }

}