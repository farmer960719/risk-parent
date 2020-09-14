package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfSecLiquidityEntity;
import com.yss.risk.demo.service.TsPfSecLiquidityService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:15
 */
@RestController
@RequestMapping("demo/tspfsecliquidity")
public class TsPfSecLiquidityController {
    @Autowired
    private TsPfSecLiquidityService tsPfSecLiquidityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfSecLiquidityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfSecLiquidityEntity tsPfSecLiquidity = tsPfSecLiquidityService.getById(id);

        return R.ok().put("tsPfSecLiquidity", tsPfSecLiquidity);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfSecLiquidityEntity tsPfSecLiquidity){
		tsPfSecLiquidityService.save(tsPfSecLiquidity);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfSecLiquidityEntity tsPfSecLiquidity){
		tsPfSecLiquidityService.updateById(tsPfSecLiquidity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfSecLiquidityService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
