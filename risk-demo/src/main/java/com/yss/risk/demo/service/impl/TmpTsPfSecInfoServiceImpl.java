package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTsPfSecInfoDao;
import com.yss.risk.demo.entity.TmpTsPfSecInfoEntity;
import com.yss.risk.demo.service.TmpTsPfSecInfoService;


@Service("tmpTsPfSecInfoService")
public class TmpTsPfSecInfoServiceImpl extends ServiceImpl<TmpTsPfSecInfoDao, TmpTsPfSecInfoEntity> implements TmpTsPfSecInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTsPfSecInfoEntity> page = this.page(
                new Query<TmpTsPfSecInfoEntity>().getPage(params),
                new QueryWrapper<TmpTsPfSecInfoEntity>()
        );

        return new PageUtils(page);
    }

}