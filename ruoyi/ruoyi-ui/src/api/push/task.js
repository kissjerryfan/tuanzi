import request from '@/utils/request'

// 查询作业布置列表
export function listTask(query) {
  return request({
    url: '/push/task/list',
    method: 'get',
    params: query
  })
}

// 查询作业布置详细
export function getTask(taskId) {
  return request({
    url: '/push/task/' + taskId,
    method: 'get'
  })
}

// 新增作业布置
export function addTask(data) {
  return request({
    url: '/push/task',
    method: 'post',
    data: data
  })
}

// 修改作业布置
export function updateTask(data) {
  return request({
    url: '/push/task',
    method: 'put',
    data: data
  })
}

// 删除作业布置
export function delTask(taskId) {
  return request({
    url: '/push/task/' + taskId,
    method: 'delete'
  })
}
