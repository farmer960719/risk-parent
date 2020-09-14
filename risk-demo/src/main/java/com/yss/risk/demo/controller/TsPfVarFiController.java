package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfVarFiEntity;
import com.yss.risk.demo.service.TsPfVarFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 组合风险指标
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:12
 */
@RestController
@RequestMapping("demo/tspfvarfi")
public class TsPfVarFiController {
    @Autowired
    private TsPfVarFiService tsPfVarFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfVarFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfVarFiEntity tsPfVarFi = tsPfVarFiService.getById(id);

        return R.ok().put("tsPfVarFi", tsPfVarFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfVarFiEntity tsPfVarFi){
		tsPfVarFiService.save(tsPfVarFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfVarFiEntity tsPfVarFi){
		tsPfVarFiService.updateById(tsPfVarFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfVarFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
