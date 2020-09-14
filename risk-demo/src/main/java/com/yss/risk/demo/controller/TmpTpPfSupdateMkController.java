package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpTpPfSupdateMkEntity;
import com.yss.risk.demo.service.TmpTpPfSupdateMkService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:36
 */
@RestController
@RequestMapping("demo/tmptppfsupdatemk")
public class TmpTpPfSupdateMkController {
    @Autowired
    private TmpTpPfSupdateMkService tmpTpPfSupdateMkService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpTpPfSupdateMkService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{pfId}")
    public R info(@PathVariable("pfId") String pfId){
		TmpTpPfSupdateMkEntity tmpTpPfSupdateMk = tmpTpPfSupdateMkService.getById(pfId);

        return R.ok().put("tmpTpPfSupdateMk", tmpTpPfSupdateMk);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpTpPfSupdateMkEntity tmpTpPfSupdateMk){
		tmpTpPfSupdateMkService.save(tmpTpPfSupdateMk);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpTpPfSupdateMkEntity tmpTpPfSupdateMk){
		tmpTpPfSupdateMkService.updateById(tmpTpPfSupdateMk);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] pfIds){
		tmpTpPfSupdateMkService.removeByIds(Arrays.asList(pfIds));

        return R.ok();
    }

}
