package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTkPfDao;
import com.yss.risk.demo.entity.TmpTkPfEntity;
import com.yss.risk.demo.service.TmpTkPfService;


@Service("tmpTkPfService")
public class TmpTkPfServiceImpl extends ServiceImpl<TmpTkPfDao, TmpTkPfEntity> implements TmpTkPfService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTkPfEntity> page = this.page(
                new Query<TmpTkPfEntity>().getPage(params),
                new QueryWrapper<TmpTkPfEntity>()
        );

        return new PageUtils(page);
    }

}