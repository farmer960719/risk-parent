package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TkTaskParamsEntity;
import com.yss.risk.demo.service.TkTaskParamsService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 任务参数日志表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:40
 */
@RestController
@RequestMapping("demo/tktaskparams")
public class TkTaskParamsController {
    @Autowired
    private TkTaskParamsService tkTaskParamsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tkTaskParamsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TkTaskParamsEntity tkTaskParams = tkTaskParamsService.getById(id);

        return R.ok().put("tkTaskParams", tkTaskParams);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TkTaskParamsEntity tkTaskParams){
		tkTaskParamsService.save(tkTaskParams);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TkTaskParamsEntity tkTaskParams){
		tkTaskParamsService.updateById(tkTaskParams);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tkTaskParamsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
