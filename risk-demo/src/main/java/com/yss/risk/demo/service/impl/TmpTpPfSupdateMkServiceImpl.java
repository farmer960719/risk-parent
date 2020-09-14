package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTpPfSupdateMkDao;
import com.yss.risk.demo.entity.TmpTpPfSupdateMkEntity;
import com.yss.risk.demo.service.TmpTpPfSupdateMkService;


@Service("tmpTpPfSupdateMkService")
public class TmpTpPfSupdateMkServiceImpl extends ServiceImpl<TmpTpPfSupdateMkDao, TmpTpPfSupdateMkEntity> implements TmpTpPfSupdateMkService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTpPfSupdateMkEntity> page = this.page(
                new Query<TmpTpPfSupdateMkEntity>().getPage(params),
                new QueryWrapper<TmpTpPfSupdateMkEntity>()
        );

        return new PageUtils(page);
    }

}