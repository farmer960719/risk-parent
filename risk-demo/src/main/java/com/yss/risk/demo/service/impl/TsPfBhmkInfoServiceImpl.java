package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfBhmkInfoDao;
import com.yss.risk.demo.entity.TsPfBhmkInfoEntity;
import com.yss.risk.demo.service.TsPfBhmkInfoService;


@Service("tsPfBhmkInfoService")
public class TsPfBhmkInfoServiceImpl extends ServiceImpl<TsPfBhmkInfoDao, TsPfBhmkInfoEntity> implements TsPfBhmkInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfBhmkInfoEntity> page = this.page(
                new Query<TsPfBhmkInfoEntity>().getPage(params),
                new QueryWrapper<TsPfBhmkInfoEntity>()
        );

        return new PageUtils(page);
    }

}