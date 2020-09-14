package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpPfGrouptreeSec0904Entity;
import com.yss.risk.demo.service.TmpPfGrouptreeSec0904Service;
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
@RequestMapping("demo/tmppfgrouptreesec0904")
public class TmpPfGrouptreeSec0904Controller {
    @Autowired
    private TmpPfGrouptreeSec0904Service tmpPfGrouptreeSec0904Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpPfGrouptreeSec0904Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pfId}")
    public R info(@PathVariable("pfId") String pfId){
		TmpPfGrouptreeSec0904Entity tmpPfGrouptreeSec0904 = tmpPfGrouptreeSec0904Service.getById(pfId);

        return R.ok().put("tmpPfGrouptreeSec0904", tmpPfGrouptreeSec0904);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpPfGrouptreeSec0904Entity tmpPfGrouptreeSec0904){
		tmpPfGrouptreeSec0904Service.save(tmpPfGrouptreeSec0904);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpPfGrouptreeSec0904Entity tmpPfGrouptreeSec0904){
		tmpPfGrouptreeSec0904Service.updateById(tmpPfGrouptreeSec0904);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] pfIds){
		tmpPfGrouptreeSec0904Service.removeByIds(Arrays.asList(pfIds));

        return R.ok();
    }

}
