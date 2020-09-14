package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpFuncIdxRelEntity;
import com.yss.risk.demo.service.TpFuncIdxRelService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:32
 */
@RestController
@RequestMapping("demo/tpfuncidxrel")
public class TpFuncIdxRelController {
    @Autowired
    private TpFuncIdxRelService tpFuncIdxRelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpFuncIdxRelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpFuncIdxRelEntity tpFuncIdxRel = tpFuncIdxRelService.getById(id);

        return R.ok().put("tpFuncIdxRel", tpFuncIdxRel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpFuncIdxRelEntity tpFuncIdxRel){
		tpFuncIdxRelService.save(tpFuncIdxRel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpFuncIdxRelEntity tpFuncIdxRel){
		tpFuncIdxRelService.updateById(tpFuncIdxRel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpFuncIdxRelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
