package com.arielgrillo.kotlin.sandbox.infrastructure.driven.repository.tasks

import com.arielgrillo.kotlin.sandbox.domain.model.TaskModel

object TaskMapper {
  fun mapper(source: JpaTasksEntity): TaskModel {
    return TaskModel(
      id = source.id,
      title = source.title,
      description = source.description,
      isDone = source.isDone
    )
  }
}