package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTkMkSecDao;
import com.yss.risk.demo.entity.TmpTkMkSecEntity;
import com.yss.risk.demo.service.TmpTkMkSecService;


@Service("tmpTkMkSecService")
public class TmpTkMkSecServiceImpl extends ServiceImpl<TmpTkMkSecDao, TmpTkMkSecEntity> implements TmpTkMkSecService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTkMkSecEntity> page = this.page(
                new Query<TmpTkMkSecEntity>().getPage(params),
                new QueryWrapper<TmpTkMkSecEntity>()
        );

        return new PageUtils(page);
    }

}