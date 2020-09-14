package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpMkDate2Entity;
import com.yss.risk.demo.service.TmpMkDate2Service;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:39
 */
@RestController
@RequestMapping("demo/tmpmkdate2")
public class TmpMkDate2Controller {
    @Autowired
    private TmpMkDate2Service tmpMkDate2Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpMkDate2Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pfId}")
    public R info(@PathVariable("pfId") String pfId){
		TmpMkDate2Entity tmpMkDate2 = tmpMkDate2Service.getById(pfId);

        return R.ok().put("tmpMkDate2", tmpMkDate2);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpMkDate2Entity tmpMkDate2){
		tmpMkDate2Service.save(tmpMkDate2);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpMkDate2Entity tmpMkDate2){
		tmpMkDate2Service.updateById(tmpMkDate2);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] pfIds){
		tmpMkDate2Service.removeByIds(Arrays.asList(pfIds));

        return R.ok();
    }

}
