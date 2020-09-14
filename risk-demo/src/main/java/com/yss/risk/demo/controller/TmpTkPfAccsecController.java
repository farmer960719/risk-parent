package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpTkPfAccsecEntity;
import com.yss.risk.demo.service.TmpTkPfAccsecService;
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
@RequestMapping("demo/tmptkpfaccsec")
public class TmpTkPfAccsecController {
    @Autowired
    private TmpTkPfAccsecService tmpTkPfAccsecService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpTkPfAccsecService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pfId}")
    public R info(@PathVariable("pfId") String pfId){
		TmpTkPfAccsecEntity tmpTkPfAccsec = tmpTkPfAccsecService.getById(pfId);

        return R.ok().put("tmpTkPfAccsec", tmpTkPfAccsec);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpTkPfAccsecEntity tmpTkPfAccsec){
		tmpTkPfAccsecService.save(tmpTkPfAccsec);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpTkPfAccsecEntity tmpTkPfAccsec){
		tmpTkPfAccsecService.updateById(tmpTkPfAccsec);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] pfIds){
		tmpTkPfAccsecService.removeByIds(Arrays.asList(pfIds));

        return R.ok();
    }

}
