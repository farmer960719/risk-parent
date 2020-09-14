package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfCetDcmpEntity;
import com.yss.risk.demo.service.TsPfCetDcmpService;
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
@RequestMapping("demo/tspfcetdcmp")
public class TsPfCetDcmpController {
    @Autowired
    private TsPfCetDcmpService tsPfCetDcmpService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfCetDcmpService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfCetDcmpEntity tsPfCetDcmp = tsPfCetDcmpService.getById(id);

        return R.ok().put("tsPfCetDcmp", tsPfCetDcmp);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfCetDcmpEntity tsPfCetDcmp){
		tsPfCetDcmpService.save(tsPfCetDcmp);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfCetDcmpEntity tsPfCetDcmp){
		tsPfCetDcmpService.updateById(tsPfCetDcmp);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfCetDcmpService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
