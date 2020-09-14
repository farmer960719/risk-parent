package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfVolatilityFiEntity;
import com.yss.risk.demo.service.TsPfVolatilityFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 组合风险指标
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:10
 */
@RestController
@RequestMapping("demo/tspfvolatilityfi")
public class TsPfVolatilityFiController {
    @Autowired
    private TsPfVolatilityFiService tsPfVolatilityFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfVolatilityFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfVolatilityFiEntity tsPfVolatilityFi = tsPfVolatilityFiService.getById(id);

        return R.ok().put("tsPfVolatilityFi", tsPfVolatilityFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfVolatilityFiEntity tsPfVolatilityFi){
		tsPfVolatilityFiService.save(tsPfVolatilityFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfVolatilityFiEntity tsPfVolatilityFi){
		tsPfVolatilityFiService.updateById(tsPfVolatilityFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfVolatilityFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
