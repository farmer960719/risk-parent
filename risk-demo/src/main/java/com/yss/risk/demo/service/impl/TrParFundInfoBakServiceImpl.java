package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TrParFundInfoBakDao;
import com.yss.risk.demo.entity.TrParFundInfoBakEntity;
import com.yss.risk.demo.service.TrParFundInfoBakService;


@Service("trParFundInfoBakService")
public class TrParFundInfoBakServiceImpl extends ServiceImpl<TrParFundInfoBakDao, TrParFundInfoBakEntity> implements TrParFundInfoBakService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TrParFundInfoBakEntity> page = this.page(
                new Query<TrParFundInfoBakEntity>().getPage(params),
                new QueryWrapper<TrParFundInfoBakEntity>()
        );

        return new PageUtils(page);
    }

}