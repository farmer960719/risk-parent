package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.Tt20180314Dao;
import com.yss.risk.demo.entity.Tt20180314Entity;
import com.yss.risk.demo.service.Tt20180314Service;


@Service("tt20180314Service")
public class Tt20180314ServiceImpl extends ServiceImpl<Tt20180314Dao, Tt20180314Entity> implements Tt20180314Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Tt20180314Entity> page = this.page(
                new Query<Tt20180314Entity>().getPage(params),
                new QueryWrapper<Tt20180314Entity>()
        );

        return new PageUtils(page);
    }

}