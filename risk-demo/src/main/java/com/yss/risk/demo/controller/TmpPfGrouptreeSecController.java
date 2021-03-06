package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpPfGrouptreeSecEntity;
import com.yss.risk.demo.service.TmpPfGrouptreeSecService;
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
@RequestMapping("demo/tmppfgrouptreesec")
public class TmpPfGrouptreeSecController {
    @Autowired
    private TmpPfGrouptreeSecService tmpPfGrouptreeSecService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpPfGrouptreeSecService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pfId}")
    public R info(@PathVariable("pfId") String pfId){
		TmpPfGrouptreeSecEntity tmpPfGrouptreeSec = tmpPfGrouptreeSecService.getById(pfId);

        return R.ok().put("tmpPfGrouptreeSec", tmpPfGrouptreeSec);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpPfGrouptreeSecEntity tmpPfGrouptreeSec){
		tmpPfGrouptreeSecService.save(tmpPfGrouptreeSec);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpPfGrouptreeSecEntity tmpPfGrouptreeSec){
		tmpPfGrouptreeSecService.updateById(tmpPfGrouptreeSec);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] pfIds){
		tmpPfGrouptreeSecService.removeByIds(Arrays.asList(pfIds));

        return R.ok();
    }

}
