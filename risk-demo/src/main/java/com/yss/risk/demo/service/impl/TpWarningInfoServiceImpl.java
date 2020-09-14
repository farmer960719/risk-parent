package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpWarningInfoDao;
import com.yss.risk.demo.entity.TpWarningInfoEntity;
import com.yss.risk.demo.service.TpWarningInfoService;


@Service("tpWarningInfoService")
public class TpWarningInfoServiceImpl extends ServiceImpl<TpWarningInfoDao, TpWarningInfoEntity> implements TpWarningInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpWarningInfoEntity> page = this.page(
                new Query<TpWarningInfoEntity>().getPage(params),
                new QueryWrapper<TpWarningInfoEntity>()
        );

        return new PageUtils(page);
    }

}