package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TkTaskDetailLogEntity;
import com.yss.risk.demo.service.TkTaskDetailLogService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 任务计算日志详情
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:41
 */
@Api(tags = "任务计算日志详情")
@RestController
@RequestMapping("demo/tktaskdetaillog")
public class TkTaskDetailLogController {
    @Autowired
    private TkTaskDetailLogService tkTaskDetailLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tkTaskDetailLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
		TkTaskDetailLogEntity tkTaskDetailLog = tkTaskDetailLogService.getById(id);

        return R.ok().put("tkTaskDetailLog", tkTaskDetailLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TkTaskDetailLogEntity tkTaskDetailLog){
		tkTaskDetailLogService.save(tkTaskDetailLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TkTaskDetailLogEntity tkTaskDetailLog){
		tkTaskDetailLogService.updateById(tkTaskDetailLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ids){
		tkTaskDetailLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
