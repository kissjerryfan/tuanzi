package com.ruoyi.task.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 作业布置对象 sys_task
 *
 * @author ssy
 * @date 2022-07-08
 */
public class SysTask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 作业ID */
    private Long taskId;

    /** 所属班级 */
    @Excel(name = "所属班级")
    private String taskClass;

    /** 作业内容 */
    @Excel(name = "作业内容")
    private String taskContent;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date taskStarttime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date taskEndtime;

    /** 备注 */
    @Excel(name = "备注")
    private String taskRemark;

    public void setTaskId(Long taskId)
    {
        this.taskId = taskId;
    }

    public Long getTaskId()
    {
        return taskId;
    }
    public void setTaskClass(String taskClass)
    {
        this.taskClass = taskClass;
    }

    public String getTaskClass()
    {
        return taskClass;
    }
    public void setTaskContent(String taskContent)
    {
        this.taskContent = taskContent;
    }

    public String getTaskContent()
    {
        return taskContent;
    }
    public void setTaskStarttime(Date taskStarttime)
    {
        this.taskStarttime = taskStarttime;
    }

    public Date getTaskStarttime()
    {
        return taskStarttime;
    }
    public void setTaskEndtime(Date taskEndtime)
    {
        this.taskEndtime = taskEndtime;
    }

    public Date getTaskEndtime()
    {
        return taskEndtime;
    }
    public void setTaskRemark(String taskRemark)
    {
        this.taskRemark = taskRemark;
    }

    public String getTaskRemark()
    {
        return taskRemark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("taskId", getTaskId())
                .append("taskClass", getTaskClass())
                .append("taskContent", getTaskContent())
                .append("taskStarttime", getTaskStarttime())
                .append("taskEndtime", getTaskEndtime())
                .append("taskRemark", getTaskRemark())
                .toString();
    }
}
