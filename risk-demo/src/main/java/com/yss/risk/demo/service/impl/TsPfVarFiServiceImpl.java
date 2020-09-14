package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfVarFiDao;
import com.yss.risk.demo.entity.TsPfVarFiEntity;
import com.yss.risk.demo.service.TsPfVarFiService;


@Service("tsPfVarFiService")
public class TsPfVarFiServiceImpl extends ServiceImpl<TsPfVarFiDao, TsPfVarFiEntity> implements TsPfVarFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfVarFiEntity> page = this.page(
                new Query<TsPfVarFiEntity>().getPage(params),
                new QueryWrapper<TsPfVarFiEntity>()
        );

        return new PageUtils(page);
    }

}