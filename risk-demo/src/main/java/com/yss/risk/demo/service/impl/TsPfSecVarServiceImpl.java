package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfSecVarDao;
import com.yss.risk.demo.entity.TsPfSecVarEntity;
import com.yss.risk.demo.service.TsPfSecVarService;


@Service("tsPfSecVarService")
public class TsPfSecVarServiceImpl extends ServiceImpl<TsPfSecVarDao, TsPfSecVarEntity> implements TsPfSecVarService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfSecVarEntity> page = this.page(
                new Query<TsPfSecVarEntity>().getPage(params),
                new QueryWrapper<TsPfSecVarEntity>()
        );

        return new PageUtils(page);
    }

}