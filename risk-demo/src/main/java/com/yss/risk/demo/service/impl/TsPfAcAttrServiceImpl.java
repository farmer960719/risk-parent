package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcAttrDao;
import com.yss.risk.demo.entity.TsPfAcAttrEntity;
import com.yss.risk.demo.service.TsPfAcAttrService;


@Service("tsPfAcAttrService")
public class TsPfAcAttrServiceImpl extends ServiceImpl<TsPfAcAttrDao, TsPfAcAttrEntity> implements TsPfAcAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcAttrEntity> page = this.page(
                new Query<TsPfAcAttrEntity>().getPage(params),
                new QueryWrapper<TsPfAcAttrEntity>()
        );

        return new PageUtils(page);
    }

}