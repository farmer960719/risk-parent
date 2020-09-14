package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTpPfSupdateDao;
import com.yss.risk.demo.entity.TmpTpPfSupdateEntity;
import com.yss.risk.demo.service.TmpTpPfSupdateService;


@Service("tmpTpPfSupdateService")
public class TmpTpPfSupdateServiceImpl extends ServiceImpl<TmpTpPfSupdateDao, TmpTpPfSupdateEntity> implements TmpTpPfSupdateService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTpPfSupdateEntity> page = this.page(
                new Query<TmpTpPfSupdateEntity>().getPage(params),
                new QueryWrapper<TmpTpPfSupdateEntity>()
        );

        return new PageUtils(page);
    }

}