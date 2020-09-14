package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsMkBondCashflowEntity;
import com.yss.risk.demo.service.TsMkBondCashflowService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:25
 */
@RestController
@RequestMapping("demo/tsmkbondcashflow")
public class TsMkBondCashflowController {
    @Autowired
    private TsMkBondCashflowService tsMkBondCashflowService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsMkBondCashflowService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsMkBondCashflowEntity tsMkBondCashflow = tsMkBondCashflowService.getById(id);

        return R.ok().put("tsMkBondCashflow", tsMkBondCashflow);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsMkBondCashflowEntity tsMkBondCashflow){
		tsMkBondCashflowService.save(tsMkBondCashflow);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsMkBondCashflowEntity tsMkBondCashflow){
		tsMkBondCashflowService.updateById(tsMkBondCashflow);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsMkBondCashflowService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
