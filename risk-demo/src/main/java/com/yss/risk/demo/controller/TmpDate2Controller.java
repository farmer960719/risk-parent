package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpDate2Entity;
import com.yss.risk.demo.service.TmpDate2Service;
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
@RequestMapping("demo/tmpdate2")
public class TmpDate2Controller {
    @Autowired
    private TmpDate2Service tmpDate2Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpDate2Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pfId}")
    public R info(@PathVariable("pfId") String pfId){
		TmpDate2Entity tmpDate2 = tmpDate2Service.getById(pfId);

        return R.ok().put("tmpDate2", tmpDate2);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpDate2Entity tmpDate2){
		tmpDate2Service.save(tmpDate2);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpDate2Entity tmpDate2){
		tmpDate2Service.updateById(tmpDate2);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] pfIds){
		tmpDate2Service.removeByIds(Arrays.asList(pfIds));

        return R.ok();
    }

}
