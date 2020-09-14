package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpFuncInfoEntity;
import com.yss.risk.demo.service.TpFuncInfoService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 自定义查询页面
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:32
 */
@RestController
@RequestMapping("demo/tpfuncinfo")
public class TpFuncInfoController {
    @Autowired
    private TpFuncInfoService tpFuncInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpFuncInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpFuncInfoEntity tpFuncInfo = tpFuncInfoService.getById(id);

        return R.ok().put("tpFuncInfo", tpFuncInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpFuncInfoEntity tpFuncInfo){
		tpFuncInfoService.save(tpFuncInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpFuncInfoEntity tpFuncInfo){
		tpFuncInfoService.updateById(tpFuncInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpFuncInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
