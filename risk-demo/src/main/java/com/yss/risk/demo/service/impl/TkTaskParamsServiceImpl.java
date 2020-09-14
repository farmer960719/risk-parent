package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TkTaskParamsDao;
import com.yss.risk.demo.entity.TkTaskParamsEntity;
import com.yss.risk.demo.service.TkTaskParamsService;


@Service("tkTaskParamsService")
public class TkTaskParamsServiceImpl extends ServiceImpl<TkTaskParamsDao, TkTaskParamsEntity> implements TkTaskParamsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TkTaskParamsEntity> page = this.page(
                new Query<TkTaskParamsEntity>().getPage(params),
                new QueryWrapper<TkTaskParamsEntity>()
        );

        return new PageUtils(page);
    }

}