package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcVarDao;
import com.yss.risk.demo.entity.TsPfAcVarEntity;
import com.yss.risk.demo.service.TsPfAcVarService;


@Service("tsPfAcVarService")
public class TsPfAcVarServiceImpl extends ServiceImpl<TsPfAcVarDao, TsPfAcVarEntity> implements TsPfAcVarService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcVarEntity> page = this.page(
                new Query<TsPfAcVarEntity>().getPage(params),
                new QueryWrapper<TsPfAcVarEntity>()
        );

        return new PageUtils(page);
    }

}