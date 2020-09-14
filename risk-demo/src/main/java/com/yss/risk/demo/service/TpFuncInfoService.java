package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpFuncInfoEntity;

import java.util.Map;

/**
 * 自定义查询页面
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:32
 */
public interface TpFuncInfoService extends IService<TpFuncInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

