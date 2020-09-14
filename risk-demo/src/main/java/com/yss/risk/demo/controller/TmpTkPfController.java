package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpTkPfEntity;
import com.yss.risk.demo.service.TmpTkPfService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:37
 */
@RestController
@RequestMapping("demo/tmptkpf")
public class TmpTkPfController {
    @Autowired
    private TmpTkPfService tmpTkPfService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpTkPfService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pfId}")
    public R info(@PathVariable("pfId") String pfId){
		TmpTkPfEntity tmpTkPf = tmpTkPfService.getById(pfId);

        return R.ok().put("tmpTkPf", tmpTkPf);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpTkPfEntity tmpTkPf){
		tmpTkPfService.save(tmpTkPf);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpTkPfEntity tmpTkPf){
		tmpTkPfService.updateById(tmpTkPf);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] pfIds){
		tmpTkPfService.removeByIds(Arrays.asList(pfIds));

        return R.ok();
    }

}
