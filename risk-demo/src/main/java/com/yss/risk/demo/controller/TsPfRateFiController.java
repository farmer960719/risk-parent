package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfRateFiEntity;
import com.yss.risk.demo.service.TsPfRateFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 组合收益分析
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:17
 */
@RestController
@RequestMapping("demo/tspfratefi")
public class TsPfRateFiController {
    @Autowired
    private TsPfRateFiService tsPfRateFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfRateFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfRateFiEntity tsPfRateFi = tsPfRateFiService.getById(id);

        return R.ok().put("tsPfRateFi", tsPfRateFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfRateFiEntity tsPfRateFi){
		tsPfRateFiService.save(tsPfRateFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfRateFiEntity tsPfRateFi){
		tsPfRateFiService.updateById(tsPfRateFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfRateFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
