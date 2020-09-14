package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpFuncIdxParaEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:32
 */
public interface TpFuncIdxParaService extends IService<TpFuncIdxParaEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

