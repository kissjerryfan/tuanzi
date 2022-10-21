package com.ruoyi.task.mapper;

import java.util.List;
import com.ruoyi.task.domain.SysTask;

/**
 * 作业布置Mapper接口
 *
 * @author ssy
 * @date 2022-07-08
 */
public interface SysTaskMapper
{
    /**
     * 查询作业布置
     *
     * @param taskId 作业布置主键
     * @return 作业布置
     */
    public SysTask selectSysTaskByTaskId(Long taskId);

    /**
     * 查询作业布置列表
     *
     * @param sysTask 作业布置
     * @return 作业布置集合
     */
    public List<SysTask> selectSysTaskList(SysTask sysTask);

    /**
     * 新增作业布置
     *
     * @param sysTask 作业布置
     * @return 结果
     */
    public int insertSysTask(SysTask sysTask);

    /**
     * 修改作业布置
     *
     * @param sysTask 作业布置
     * @return 结果
     */
    public int updateSysTask(SysTask sysTask);

    /**
     * 删除作业布置
     *
     * @param taskId 作业布置主键
     * @return 结果
     */
    public int deleteSysTaskByTaskId(Long taskId);

    /**
     * 批量删除作业布置
     *
     * @param taskIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysTaskByTaskIds(Long[] taskIds);
}
