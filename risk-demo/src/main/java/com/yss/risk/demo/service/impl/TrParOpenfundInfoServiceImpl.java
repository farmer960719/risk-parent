package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TrParOpenfundInfoDao;
import com.yss.risk.demo.entity.TrParOpenfundInfoEntity;
import com.yss.risk.demo.service.TrParOpenfundInfoService;


@Service("trParOpenfundInfoService")
public class TrParOpenfundInfoServiceImpl extends ServiceImpl<TrParOpenfundInfoDao, TrParOpenfundInfoEntity> implements TrParOpenfundInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TrParOpenfundInfoEntity> page = this.page(
                new Query<TrParOpenfundInfoEntity>().getPage(params),
                new QueryWrapper<TrParOpenfundInfoEntity>()
        );

        return new PageUtils(page);
    }

}