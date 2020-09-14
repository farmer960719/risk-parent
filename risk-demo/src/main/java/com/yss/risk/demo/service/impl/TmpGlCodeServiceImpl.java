package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpGlCodeDao;
import com.yss.risk.demo.entity.TmpGlCodeEntity;
import com.yss.risk.demo.service.TmpGlCodeService;


@Service("tmpGlCodeService")
public class TmpGlCodeServiceImpl extends ServiceImpl<TmpGlCodeDao, TmpGlCodeEntity> implements TmpGlCodeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpGlCodeEntity> page = this.page(
                new Query<TmpGlCodeEntity>().getPage(params),
                new QueryWrapper<TmpGlCodeEntity>()
        );

        return new PageUtils(page);
    }

}