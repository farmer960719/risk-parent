package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfVarPcEntity;
import com.yss.risk.demo.service.TsPfVarPcService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:12
 */
@RestController
@RequestMapping("demo/tspfvarpc")
public class TsPfVarPcController {
    @Autowired
    private TsPfVarPcService tsPfVarPcService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfVarPcService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfVarPcEntity tsPfVarPc = tsPfVarPcService.getById(id);

        return R.ok().put("tsPfVarPc", tsPfVarPc);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfVarPcEntity tsPfVarPc){
		tsPfVarPcService.save(tsPfVarPc);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfVarPcEntity tsPfVarPc){
		tsPfVarPcService.updateById(tsPfVarPc);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfVarPcService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
