package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpPfAllsecNewEntity;
import com.yss.risk.demo.service.TmpPfAllsecNewService;
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
@RequestMapping("demo/tmppfallsecnew")
public class TmpPfAllsecNewController {
    @Autowired
    private TmpPfAllsecNewService tmpPfAllsecNewService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpPfAllsecNewService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{securityId}")
    public R info(@PathVariable("securityId") String securityId){
		TmpPfAllsecNewEntity tmpPfAllsecNew = tmpPfAllsecNewService.getById(securityId);

        return R.ok().put("tmpPfAllsecNew", tmpPfAllsecNew);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpPfAllsecNewEntity tmpPfAllsecNew){
		tmpPfAllsecNewService.save(tmpPfAllsecNew);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpPfAllsecNewEntity tmpPfAllsecNew){
		tmpPfAllsecNewService.updateById(tmpPfAllsecNew);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] securityIds){
		tmpPfAllsecNewService.removeByIds(Arrays.asList(securityIds));

        return R.ok();
    }

}
