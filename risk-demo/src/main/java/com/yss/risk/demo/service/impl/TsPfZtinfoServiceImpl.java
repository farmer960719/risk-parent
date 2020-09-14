package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfZtinfoDao;
import com.yss.risk.demo.entity.TsPfZtinfoEntity;
import com.yss.risk.demo.service.TsPfZtinfoService;


@Service("tsPfZtinfoService")
public class TsPfZtinfoServiceImpl extends ServiceImpl<TsPfZtinfoDao, TsPfZtinfoEntity> implements TsPfZtinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfZtinfoEntity> page = this.page(
                new Query<TsPfZtinfoEntity>().getPage(params),
                new QueryWrapper<TsPfZtinfoEntity>()
        );

        return new PageUtils(page);
    }

}