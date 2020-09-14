package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpHissceneInfoDao;
import com.yss.risk.demo.entity.TpHissceneInfoEntity;
import com.yss.risk.demo.service.TpHissceneInfoService;


@Service("tpHissceneInfoService")
public class TpHissceneInfoServiceImpl extends ServiceImpl<TpHissceneInfoDao, TpHissceneInfoEntity> implements TpHissceneInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpHissceneInfoEntity> page = this.page(
                new Query<TpHissceneInfoEntity>().getPage(params),
                new QueryWrapper<TpHissceneInfoEntity>()
        );

        return new PageUtils(page);
    }

}