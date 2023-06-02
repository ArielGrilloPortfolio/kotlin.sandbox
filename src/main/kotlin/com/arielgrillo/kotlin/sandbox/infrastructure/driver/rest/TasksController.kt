package com.arielgrillo.kotlin.sandbox.infrastructure.driver.rest

import com.arielgrillo.kotlin.sandbox.application.usaecase.task.CompleteTaskUseCase
import com.arielgrillo.kotlin.sandbox.application.usaecase.task.CreateTaskUseCase
import com.arielgrillo.kotlin.sandbox.application.usaecase.task.GetAllTasksUseCase
import com.arielgrillo.kotlin.sandbox.application.usaecase.task.GetTaskUseCase
import com.arielgrillo.kotlin.sandbox.domain.model.TaskModel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v{version}/tasks")
class TasksController(
  private val getAllTasksUseCase: GetAllTasksUseCase,
  private val getTaskUseCase: GetTaskUseCase,
  private val createTaskUseCase: CreateTaskUseCase,
  private val completeTaskUseCase: CompleteTaskUseCase
) {
  @GetMapping("/")
  fun getAll():ResponseEntity<List<TaskModel>>
  {
    return ResponseEntity.ok(getAllTasksUseCase.execute())
  }

  @PostMapping("/")
  fun createTask(@RequestBody task: TaskModel){
    createTaskUseCase.execute(task)
  }

  @GetMapping("/{id}")
  fun getById(@PathVariable id: String):ResponseEntity<TaskModel>
  {
    return ResponseEntity.ok(getTaskUseCase.execute(id.toInt()))
  }

  @PutMapping("/{id}/complete-task")
  fun completeTask(@PathVariable id:Int)
  {
    completeTaskUseCase.execute(id.toInt())
  }

}