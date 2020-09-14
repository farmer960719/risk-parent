package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfVarDao;
import com.yss.risk.demo.entity.TsPfVarEntity;
import com.yss.risk.demo.service.TsPfVarService;


@Service("tsPfVarService")
public class TsPfVarServiceImpl extends ServiceImpl<TsPfVarDao, TsPfVarEntity> implements TsPfVarService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfVarEntity> page = this.page(
                new Query<TsPfVarEntity>().getPage(params),
                new QueryWrapper<TsPfVarEntity>()
        );

        return new PageUtils(page);
    }

}