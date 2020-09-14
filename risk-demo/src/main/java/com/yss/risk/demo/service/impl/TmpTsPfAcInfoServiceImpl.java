package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTsPfAcInfoDao;
import com.yss.risk.demo.entity.TmpTsPfAcInfoEntity;
import com.yss.risk.demo.service.TmpTsPfAcInfoService;


@Service("tmpTsPfAcInfoService")
public class TmpTsPfAcInfoServiceImpl extends ServiceImpl<TmpTsPfAcInfoDao, TmpTsPfAcInfoEntity> implements TmpTsPfAcInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTsPfAcInfoEntity> page = this.page(
                new Query<TmpTsPfAcInfoEntity>().getPage(params),
                new QueryWrapper<TmpTsPfAcInfoEntity>()
        );

        return new PageUtils(page);
    }

}