package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TrParTreeRelEntity;
import com.yss.risk.demo.service.TrParTreeRelService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 外部组合树定义表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:25
 */
@RestController
@RequestMapping("demo/trpartreerel")
public class TrParTreeRelController {
    @Autowired
    private TrParTreeRelService trParTreeRelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = trParTreeRelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TrParTreeRelEntity trParTreeRel = trParTreeRelService.getById(id);

        return R.ok().put("trParTreeRel", trParTreeRel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TrParTreeRelEntity trParTreeRel){
		trParTreeRelService.save(trParTreeRel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TrParTreeRelEntity trParTreeRel){
		trParTreeRelService.updateById(trParTreeRel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		trParTreeRelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
