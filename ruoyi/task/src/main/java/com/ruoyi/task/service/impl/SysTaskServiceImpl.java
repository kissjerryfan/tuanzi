package com.ruoyi.task.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.task.mapper.SysTaskMapper;
import com.ruoyi.task.domain.SysTask;
import com.ruoyi.task.service.ISysTaskService;

/**
 * 作业布置Service业务层处理
 *
 * @author ssy
 * @date 2022-07-08
 */
@Service
public class SysTaskServiceImpl implements ISysTaskService
{
    @Autowired
    private SysTaskMapper sysTaskMapper;

    /**
     * 查询作业布置
     *
     * @param taskId 作业布置主键
     * @return 作业布置
     */
    @Override
    public SysTask selectSysTaskByTaskId(Long taskId)
    {
        return sysTaskMapper.selectSysTaskByTaskId(taskId);
    }

    /**
     * 查询作业布置列表
     *
     * @param sysTask 作业布置
     * @return 作业布置
     */
    @Override
    public List<SysTask> selectSysTaskList(SysTask sysTask)
    {
        return sysTaskMapper.selectSysTaskList(sysTask);
    }

    /**
     * 新增作业布置
     *
     * @param sysTask 作业布置
     * @return 结果
     */
    @Override
    public int insertSysTask(SysTask sysTask)
    {
        return sysTaskMapper.insertSysTask(sysTask);
    }

    /**
     * 修改作业布置
     *
     * @param sysTask 作业布置
     * @return 结果
     */
    @Override
    public int updateSysTask(SysTask sysTask)
    {
        return sysTaskMapper.updateSysTask(sysTask);
    }

    /**
     * 批量删除作业布置
     *
     * @param taskIds 需要删除的作业布置主键
     * @return 结果
     */
    @Override
    public int deleteSysTaskByTaskIds(Long[] taskIds)
    {
        return sysTaskMapper.deleteSysTaskByTaskIds(taskIds);
    }

    /**
     * 删除作业布置信息
     *
     * @param taskId 作业布置主键
     * @return 结果
     */
    @Override
    public int deleteSysTaskByTaskId(Long taskId)
    {
        return sysTaskMapper.deleteSysTaskByTaskId(taskId);
    }
}
