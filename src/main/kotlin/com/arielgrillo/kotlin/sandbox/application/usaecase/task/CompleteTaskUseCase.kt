package com.arielgrillo.kotlin.sandbox.application.usaecase.task

import com.arielgrillo.kotlin.sandbox.domain.service.tasks.TasksService

class CompleteTaskUseCase(
  private val service: TasksService
) {
  fun execute(id: Int) {
    return service.markAsDone(id)
  }
}