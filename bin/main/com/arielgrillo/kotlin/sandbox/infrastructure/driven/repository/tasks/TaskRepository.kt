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

  override fun get(id: Int): TaskModel {
    return TaskMapper.mapper(jpaRepository.findById(id).get())
  }

  override fun create(task: TaskModel) {
    val jpaEntity = TaskMapper.mapper(task)
    jpaRepository.save(jpaEntity)
  }

  override fun markAsDone(id: Int) {
    var jpaEntity = jpaRepository.findById(id).get()
    jpaEntity.isDone = true
    jpaRepository.save(jpaEntity)
  }
}