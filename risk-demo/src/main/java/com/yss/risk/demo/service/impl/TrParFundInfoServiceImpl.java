package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TrParFundInfoDao;
import com.yss.risk.demo.entity.TrParFundInfoEntity;
import com.yss.risk.demo.service.TrParFundInfoService;


@Service("trParFundInfoService")
public class TrParFundInfoServiceImpl extends ServiceImpl<TrParFundInfoDao, TrParFundInfoEntity> implements TrParFundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TrParFundInfoEntity> page = this.page(
                new Query<TrParFundInfoEntity>().getPage(params),
                new QueryWrapper<TrParFundInfoEntity>()
        );

        return new PageUtils(page);
    }

}