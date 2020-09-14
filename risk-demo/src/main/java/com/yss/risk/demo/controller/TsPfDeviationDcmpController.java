package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfDeviationDcmpEntity;
import com.yss.risk.demo.service.TsPfDeviationDcmpService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:19
 */
@RestController
@RequestMapping("demo/tspfdeviationdcmp")
public class TsPfDeviationDcmpController {
    @Autowired
    private TsPfDeviationDcmpService tsPfDeviationDcmpService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfDeviationDcmpService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfDeviationDcmpEntity tsPfDeviationDcmp = tsPfDeviationDcmpService.getById(id);

        return R.ok().put("tsPfDeviationDcmp", tsPfDeviationDcmp);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfDeviationDcmpEntity tsPfDeviationDcmp){
		tsPfDeviationDcmpService.save(tsPfDeviationDcmp);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfDeviationDcmpEntity tsPfDeviationDcmp){
		tsPfDeviationDcmpService.updateById(tsPfDeviationDcmp);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfDeviationDcmpService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
