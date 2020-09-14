package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpTkMkSecEntity;
import com.yss.risk.demo.service.TmpTkMkSecService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:38
 */
@RestController
@RequestMapping("demo/tmptkmksec")
public class TmpTkMkSecController {
    @Autowired
    private TmpTkMkSecService tmpTkMkSecService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpTkMkSecService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{securityId}")
    public R info(@PathVariable("securityId") String securityId){
		TmpTkMkSecEntity tmpTkMkSec = tmpTkMkSecService.getById(securityId);

        return R.ok().put("tmpTkMkSec", tmpTkMkSec);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpTkMkSecEntity tmpTkMkSec){
		tmpTkMkSecService.save(tmpTkMkSec);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpTkMkSecEntity tmpTkMkSec){
		tmpTkMkSecService.updateById(tmpTkMkSec);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] securityIds){
		tmpTkMkSecService.removeByIds(Arrays.asList(securityIds));

        return R.ok();
    }

}
