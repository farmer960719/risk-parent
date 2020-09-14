package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpGlExhibDatadict6Entity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:31
 */
public interface TpGlExhibDatadict6Service extends IService<TpGlExhibDatadict6Entity> {

    PageUtils queryPage(Map<String, Object> params);
}

