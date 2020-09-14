package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfVolatilityEntity;
import com.yss.risk.demo.service.TsPfVolatilityService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:11
 */
@RestController
@RequestMapping("demo/tspfvolatility")
public class TsPfVolatilityController {
    @Autowired
    private TsPfVolatilityService tsPfVolatilityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfVolatilityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfVolatilityEntity tsPfVolatility = tsPfVolatilityService.getById(id);

        return R.ok().put("tsPfVolatility", tsPfVolatility);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfVolatilityEntity tsPfVolatility){
		tsPfVolatilityService.save(tsPfVolatility);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfVolatilityEntity tsPfVolatility){
		tsPfVolatilityService.updateById(tsPfVolatility);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfVolatilityService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
