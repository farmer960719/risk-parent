package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TrParTreeRelDao;
import com.yss.risk.demo.entity.TrParTreeRelEntity;
import com.yss.risk.demo.service.TrParTreeRelService;


@Service("trParTreeRelService")
public class TrParTreeRelServiceImpl extends ServiceImpl<TrParTreeRelDao, TrParTreeRelEntity> implements TrParTreeRelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TrParTreeRelEntity> page = this.page(
                new Query<TrParTreeRelEntity>().getPage(params),
                new QueryWrapper<TrParTreeRelEntity>()
        );

        return new PageUtils(page);
    }

}