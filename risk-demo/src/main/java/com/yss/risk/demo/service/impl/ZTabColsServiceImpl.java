package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.ZTabColsDao;
import com.yss.risk.demo.entity.ZTabColsEntity;
import com.yss.risk.demo.service.ZTabColsService;


@Service("zTabColsService")
public class ZTabColsServiceImpl extends ServiceImpl<ZTabColsDao, ZTabColsEntity> implements ZTabColsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ZTabColsEntity> page = this.page(
                new Query<ZTabColsEntity>().getPage(params),
                new QueryWrapper<ZTabColsEntity>()
        );

        return new PageUtils(page);
    }

}