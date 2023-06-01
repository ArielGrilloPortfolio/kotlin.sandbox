package com.arielgrillo.kotlin.sandbox.infrastructure.driver.rest

import com.arielgrillo.kotlin.sandbox.application.usaecase.task.GetAllTasksUseCase
import com.arielgrillo.kotlin.sandbox.domain.model.TaskModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v{version}/tasks")
class TasksController(
  private val getAllTasksUseCase: GetAllTasksUseCase
) {
  @GetMapping("/")
  fun getAll():ResponseEntity<List<TaskModel>>
  {
    return ResponseEntity.ok(getAllTasksUseCase.execute())
  }
}