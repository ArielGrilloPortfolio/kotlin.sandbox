package com.arielgrillo.kotlin.sandbox.application.usaecase.task

import com.arielgrillo.kotlin.sandbox.domain.model.TaskModel
import com.arielgrillo.kotlin.sandbox.domain.service.tasks.TasksService

class GetAllTasksUseCase(
  private val service: TasksService
) {
  fun execute(): List<TaskModel>{
    return service.getAll()
  }
}