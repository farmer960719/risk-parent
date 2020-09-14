package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAttrDao;
import com.yss.risk.demo.entity.TsPfAttrEntity;
import com.yss.risk.demo.service.TsPfAttrService;


@Service("tsPfAttrService")
public class TsPfAttrServiceImpl extends ServiceImpl<TsPfAttrDao, TsPfAttrEntity> implements TsPfAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAttrEntity> page = this.page(
                new Query<TsPfAttrEntity>().getPage(params),
                new QueryWrapper<TsPfAttrEntity>()
        );

        return new PageUtils(page);
    }

}