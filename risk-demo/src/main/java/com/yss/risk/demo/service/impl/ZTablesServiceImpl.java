package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.ZTablesDao;
import com.yss.risk.demo.entity.ZTablesEntity;
import com.yss.risk.demo.service.ZTablesService;


@Service("zTablesService")
public class ZTablesServiceImpl extends ServiceImpl<ZTablesDao, ZTablesEntity> implements ZTablesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ZTablesEntity> page = this.page(
                new Query<ZTablesEntity>().getPage(params),
                new QueryWrapper<ZTablesEntity>()
        );

        return new PageUtils(page);
    }

}