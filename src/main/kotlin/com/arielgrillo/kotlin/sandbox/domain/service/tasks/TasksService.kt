package com.arielgrillo.kotlin.sandbox.domain.service.tasks

import com.arielgrillo.kotlin.sandbox.domain.model.TaskModel

interface TasksService {
  fun getAll(): List<TaskModel>
  fun get(id: Int)
  fun create(task: TaskModel)
  fun markAsDone(id:Int)
}