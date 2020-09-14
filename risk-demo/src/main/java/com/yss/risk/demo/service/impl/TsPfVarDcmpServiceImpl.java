package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfVarDcmpDao;
import com.yss.risk.demo.entity.TsPfVarDcmpEntity;
import com.yss.risk.demo.service.TsPfVarDcmpService;


@Service("tsPfVarDcmpService")
public class TsPfVarDcmpServiceImpl extends ServiceImpl<TsPfVarDcmpDao, TsPfVarDcmpEntity> implements TsPfVarDcmpService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfVarDcmpEntity> page = this.page(
                new Query<TsPfVarDcmpEntity>().getPage(params),
                new QueryWrapper<TsPfVarDcmpEntity>()
        );

        return new PageUtils(page);
    }

}