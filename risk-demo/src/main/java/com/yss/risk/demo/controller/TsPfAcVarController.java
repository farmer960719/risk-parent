package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfAcVarEntity;
import com.yss.risk.demo.service.TsPfAcVarService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:21
 */
@RestController
@RequestMapping("demo/tspfacvar")
public class TsPfAcVarController {
    @Autowired
    private TsPfAcVarService tsPfAcVarService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfAcVarService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfAcVarEntity tsPfAcVar = tsPfAcVarService.getById(id);

        return R.ok().put("tsPfAcVar", tsPfAcVar);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfAcVarEntity tsPfAcVar){
		tsPfAcVarService.save(tsPfAcVar);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfAcVarEntity tsPfAcVar){
		tsPfAcVarService.updateById(tsPfAcVar);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfAcVarService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
