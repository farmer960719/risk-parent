package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpDatacheckLogHideDao;
import com.yss.risk.demo.entity.TpDatacheckLogHideEntity;
import com.yss.risk.demo.service.TpDatacheckLogHideService;


@Service("tpDatacheckLogHideService")
public class TpDatacheckLogHideServiceImpl extends ServiceImpl<TpDatacheckLogHideDao, TpDatacheckLogHideEntity> implements TpDatacheckLogHideService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpDatacheckLogHideEntity> page = this.page(
                new Query<TpDatacheckLogHideEntity>().getPage(params),
                new QueryWrapper<TpDatacheckLogHideEntity>()
        );

        return new PageUtils(page);
    }

}