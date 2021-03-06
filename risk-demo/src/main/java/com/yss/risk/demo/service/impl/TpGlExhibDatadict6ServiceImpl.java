package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpGlExhibDatadict6Dao;
import com.yss.risk.demo.entity.TpGlExhibDatadict6Entity;
import com.yss.risk.demo.service.TpGlExhibDatadict6Service;


@Service("tpGlExhibDatadict6Service")
public class TpGlExhibDatadict6ServiceImpl extends ServiceImpl<TpGlExhibDatadict6Dao, TpGlExhibDatadict6Entity> implements TpGlExhibDatadict6Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpGlExhibDatadict6Entity> page = this.page(
                new Query<TpGlExhibDatadict6Entity>().getPage(params),
                new QueryWrapper<TpGlExhibDatadict6Entity>()
        );

        return new PageUtils(page);
    }

}