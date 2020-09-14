package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TCebConfigDao;
import com.yss.risk.demo.entity.TCebConfigEntity;
import com.yss.risk.demo.service.TCebConfigService;


@Service("tCebConfigService")
public class TCebConfigServiceImpl extends ServiceImpl<TCebConfigDao, TCebConfigEntity> implements TCebConfigService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TCebConfigEntity> page = this.page(
                new Query<TCebConfigEntity>().getPage(params),
                new QueryWrapper<TCebConfigEntity>()
        );

        return new PageUtils(page);
    }

}