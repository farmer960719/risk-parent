package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpEbankAuthorityEntity;
import com.yss.risk.demo.service.TpEbankAuthorityService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 网银权限控制表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:34
 */
@RestController
@RequestMapping("demo/tpebankauthority")
public class TpEbankAuthorityController {
    @Autowired
    private TpEbankAuthorityService tpEbankAuthorityService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpEbankAuthorityService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpEbankAuthorityEntity tpEbankAuthority = tpEbankAuthorityService.getById(id);

        return R.ok().put("tpEbankAuthority", tpEbankAuthority);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpEbankAuthorityEntity tpEbankAuthority){
		tpEbankAuthorityService.save(tpEbankAuthority);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpEbankAuthorityEntity tpEbankAuthority){
		tpEbankAuthorityService.updateById(tpEbankAuthority);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpEbankAuthorityService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
