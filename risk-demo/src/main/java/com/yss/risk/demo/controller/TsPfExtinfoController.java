package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfExtinfoEntity;
import com.yss.risk.demo.service.TsPfExtinfoService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 1.包含了真实组合、虚拟组合、汇总组合

2.按组合内码汇总

3.包含真实交易的发生金额及费用/组合其它费用

 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:18
 */
@RestController
@RequestMapping("demo/tspfextinfo")
public class TsPfExtinfoController {
    @Autowired
    private TsPfExtinfoService tsPfExtinfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfExtinfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfExtinfoEntity tsPfExtinfo = tsPfExtinfoService.getById(id);

        return R.ok().put("tsPfExtinfo", tsPfExtinfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfExtinfoEntity tsPfExtinfo){
		tsPfExtinfoService.save(tsPfExtinfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfExtinfoEntity tsPfExtinfo){
		tsPfExtinfoService.updateById(tsPfExtinfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfExtinfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
