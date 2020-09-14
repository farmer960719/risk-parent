package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpFuncChartEntity;
import com.yss.risk.demo.service.TpFuncChartService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:33
 */
@RestController
@RequestMapping("demo/tpfuncchart")
public class TpFuncChartController {
    @Autowired
    private TpFuncChartService tpFuncChartService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpFuncChartService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpFuncChartEntity tpFuncChart = tpFuncChartService.getById(id);

        return R.ok().put("tpFuncChart", tpFuncChart);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpFuncChartEntity tpFuncChart){
		tpFuncChartService.save(tpFuncChart);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpFuncChartEntity tpFuncChart){
		tpFuncChartService.updateById(tpFuncChart);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpFuncChartService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
