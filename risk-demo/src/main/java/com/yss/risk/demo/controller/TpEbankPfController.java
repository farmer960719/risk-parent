package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpEbankPfEntity;
import com.yss.risk.demo.service.TpEbankPfService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 资产代码（网银）
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:33
 */
@RestController
@RequestMapping("demo/tpebankpf")
public class TpEbankPfController {
    @Autowired
    private TpEbankPfService tpEbankPfService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpEbankPfService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpEbankPfEntity tpEbankPf = tpEbankPfService.getById(id);

        return R.ok().put("tpEbankPf", tpEbankPf);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpEbankPfEntity tpEbankPf){
		tpEbankPfService.save(tpEbankPf);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpEbankPfEntity tpEbankPf){
		tpEbankPfService.updateById(tpEbankPf);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpEbankPfService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
