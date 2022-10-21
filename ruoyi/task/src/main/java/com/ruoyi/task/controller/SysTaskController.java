package com.ruoyi.task.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.task.domain.SysTask;
import com.ruoyi.task.service.ISysTaskService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 作业布置Controller
 *
 * @author ssy
 * @date 2022-07-08
 */
@RestController
@RequestMapping("/task")
public class SysTaskController extends BaseController
{
    @Autowired
    private ISysTaskService sysTaskService;

    /**
     * 查询作业布置列表
     */
    @RequiresPermissions("push:task:list")
    @GetMapping("/list")
    public TableDataInfo list(SysTask sysTask)
    {
        startPage();
        List<SysTask> list = sysTaskService.selectSysTaskList(sysTask);
        return getDataTable(list);
    }

    /**
     * 导出作业布置列表
     */
    @RequiresPermissions("push:task:export")
    @Log(title = "作业布置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysTask sysTask)
    {
        List<SysTask> list = sysTaskService.selectSysTaskList(sysTask);
        ExcelUtil<SysTask> util = new ExcelUtil<SysTask>(SysTask.class);
        util.exportExcel(response, list, "作业布置数据");
    }

    /**
     * 获取作业布置详细信息
     */
    @RequiresPermissions("push:task:query")
    @GetMapping(value = "/{taskId}")
    public AjaxResult getInfo(@PathVariable("taskId") Long taskId)
    {
        return AjaxResult.success(sysTaskService.selectSysTaskByTaskId(taskId));
    }

    /**
     * 新增作业布置
     */
    @RequiresPermissions("push:task:add")
    @Log(title = "作业布置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysTask sysTask)
    {
        return toAjax(sysTaskService.insertSysTask(sysTask));
    }

    /**
     * 修改作业布置
     */
    @RequiresPermissions("push:task:edit")
    @Log(title = "作业布置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysTask sysTask)
    {
        return toAjax(sysTaskService.updateSysTask(sysTask));
    }

    /**
     * 删除作业布置
     */
    @RequiresPermissions("push:task:remove")
    @Log(title = "作业布置", businessType = BusinessType.DELETE)
    @DeleteMapping("/{taskIds}")
    public AjaxResult remove(@PathVariable Long[] taskIds)
    {
        return toAjax(sysTaskService.deleteSysTaskByTaskIds(taskIds));
    }
}
