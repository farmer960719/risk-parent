package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfMddDao;
import com.yss.risk.demo.entity.TsPfMddEntity;
import com.yss.risk.demo.service.TsPfMddService;


@Service("tsPfMddService")
public class TsPfMddServiceImpl extends ServiceImpl<TsPfMddDao, TsPfMddEntity> implements TsPfMddService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfMddEntity> page = this.page(
                new Query<TsPfMddEntity>().getPage(params),
                new QueryWrapper<TsPfMddEntity>()
        );

        return new PageUtils(page);
    }

}