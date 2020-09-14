package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfVarDcmpEntity;
import com.yss.risk.demo.service.TsPfVarDcmpService;
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
@RequestMapping("demo/tspfvardcmp")
public class TsPfVarDcmpController {
    @Autowired
    private TsPfVarDcmpService tsPfVarDcmpService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfVarDcmpService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfVarDcmpEntity tsPfVarDcmp = tsPfVarDcmpService.getById(id);

        return R.ok().put("tsPfVarDcmp", tsPfVarDcmp);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfVarDcmpEntity tsPfVarDcmp){
		tsPfVarDcmpService.save(tsPfVarDcmp);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfVarDcmpEntity tsPfVarDcmp){
		tsPfVarDcmpService.updateById(tsPfVarDcmp);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfVarDcmpService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
