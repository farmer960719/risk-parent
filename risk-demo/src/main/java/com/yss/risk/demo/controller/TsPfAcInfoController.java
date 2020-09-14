package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfAcInfoEntity;
import com.yss.risk.demo.service.TsPfAcInfoService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 1.包含了真实组合、虚拟组合、汇总组合

2.按证券代码汇总

3.包含持仓、交易、损益

 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:22
 */
@RestController
@RequestMapping("demo/tspfacinfo")
public class TsPfAcInfoController {
    @Autowired
    private TsPfAcInfoService tsPfAcInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfAcInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfAcInfoEntity tsPfAcInfo = tsPfAcInfoService.getById(id);

        return R.ok().put("tsPfAcInfo", tsPfAcInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfAcInfoEntity tsPfAcInfo){
		tsPfAcInfoService.save(tsPfAcInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfAcInfoEntity tsPfAcInfo){
		tsPfAcInfoService.updateById(tsPfAcInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfAcInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
