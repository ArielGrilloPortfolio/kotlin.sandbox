package com.arielgrillo.kotlin.sandbox.infrastructure.driven.repository.tasks

import com.arielgrillo.kotlin.sandbox.domain.model.TaskModel
import com.arielgrillo.kotlin.sandbox.domain.service.tasks.TasksService

class TaskRepository(
  private val jpaRepository: TasksJpaRepository
): TasksService {
  override fun getAll():List<TaskModel> {
    val tasks = jpaRepository.findAll()
    return tasks.map { TaskMapper.mapper(it) }
  }

  override fun get(id: Int) {
    TODO("Not yet implemented")
  }

  override fun create(task: TaskModel) {
    TODO("Not yet implemented")
  }

  override fun markAsDone(id: Int) {
    TODO("Not yet implemented")
  }
}