package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpFuncIdcRelEntity;
import com.yss.risk.demo.service.TpFuncIdcRelService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 定义自定义功能中每个列对应的指标类
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:33
 */
@RestController
@RequestMapping("demo/tpfuncidcrel")
public class TpFuncIdcRelController {
    @Autowired
    private TpFuncIdcRelService tpFuncIdcRelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpFuncIdcRelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpFuncIdcRelEntity tpFuncIdcRel = tpFuncIdcRelService.getById(id);

        return R.ok().put("tpFuncIdcRel", tpFuncIdcRel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpFuncIdcRelEntity tpFuncIdcRel){
		tpFuncIdcRelService.save(tpFuncIdcRel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpFuncIdcRelEntity tpFuncIdcRel){
		tpFuncIdcRelService.updateById(tpFuncIdcRel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpFuncIdcRelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
