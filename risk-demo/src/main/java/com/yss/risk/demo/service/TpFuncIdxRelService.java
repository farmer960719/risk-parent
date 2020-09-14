package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpFuncIdxRelEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:32
 */
public interface TpFuncIdxRelService extends IService<TpFuncIdxRelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

