package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfFixattrFiDao;
import com.yss.risk.demo.entity.TsPfFixattrFiEntity;
import com.yss.risk.demo.service.TsPfFixattrFiService;


@Service("tsPfFixattrFiService")
public class TsPfFixattrFiServiceImpl extends ServiceImpl<TsPfFixattrFiDao, TsPfFixattrFiEntity> implements TsPfFixattrFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfFixattrFiEntity> page = this.page(
                new Query<TsPfFixattrFiEntity>().getPage(params),
                new QueryWrapper<TsPfFixattrFiEntity>()
        );

        return new PageUtils(page);
    }

}