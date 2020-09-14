package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TrParFundInfoEntity;
import com.yss.risk.demo.service.TrParFundInfoService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:26
 */
@RestController
@RequestMapping("demo/trparfundinfo")
public class TrParFundInfoController {
    @Autowired
    private TrParFundInfoService trParFundInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = trParFundInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TrParFundInfoEntity trParFundInfo = trParFundInfoService.getById(id);

        return R.ok().put("trParFundInfo", trParFundInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TrParFundInfoEntity trParFundInfo){
		trParFundInfoService.save(trParFundInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TrParFundInfoEntity trParFundInfo){
		trParFundInfoService.updateById(trParFundInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		trParFundInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
