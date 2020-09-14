package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpGlCodeEntity;
import com.yss.risk.demo.service.TmpGlCodeService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:40
 */
@RestController
@RequestMapping("demo/tmpglcode")
public class TmpGlCodeController {
    @Autowired
    private TmpGlCodeService tmpGlCodeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpGlCodeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{symbolId}")
    public R info(@PathVariable("symbolId") String symbolId){
		TmpGlCodeEntity tmpGlCode = tmpGlCodeService.getById(symbolId);

        return R.ok().put("tmpGlCode", tmpGlCode);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpGlCodeEntity tmpGlCode){
		tmpGlCodeService.save(tmpGlCode);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpGlCodeEntity tmpGlCode){
		tmpGlCodeService.updateById(tmpGlCode);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] symbolIds){
		tmpGlCodeService.removeByIds(Arrays.asList(symbolIds));

        return R.ok();
    }

}
