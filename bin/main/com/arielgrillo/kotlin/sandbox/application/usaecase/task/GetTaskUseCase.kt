package com.arielgrillo.kotlin.sandbox.application.usaecase.task

import com.arielgrillo.kotlin.sandbox.domain.model.TaskModel
import com.arielgrillo.kotlin.sandbox.domain.service.tasks.TasksService

class GetTaskUseCase(
  private val service: TasksService
) {
  fun execute(id: Int): TaskModel {
    return service.get(id)
  }
}