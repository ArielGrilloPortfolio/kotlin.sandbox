package com.arielgrillo.kotlin.sandbox.infrastructure.framework.configuration.application.usecase.task

import com.arielgrillo.kotlin.sandbox.application.usaecase.task.CompleteTaskUseCase
import com.arielgrillo.kotlin.sandbox.application.usaecase.task.CreateTaskUseCase
import com.arielgrillo.kotlin.sandbox.application.usaecase.task.GetAllTasksUseCase
import com.arielgrillo.kotlin.sandbox.application.usaecase.task.GetTaskUseCase
import com.arielgrillo.kotlin.sandbox.domain.service.tasks.TasksService
import com.arielgrillo.kotlin.sandbox.infrastructure.driven.repository.tasks.TaskRepository
import com.arielgrillo.kotlin.sandbox.infrastructure.driven.repository.tasks.TasksJpaRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GetAllTasksUSeCaseConfiguration {

  @Bean
  fun createRepository(jpaRepository: TasksJpaRepository): TaskRepository = TaskRepository(jpaRepository)

  @Bean
  fun createGetAllUseCase(service: TasksService): GetAllTasksUseCase = GetAllTasksUseCase(service)

  @Bean
  fun createCreateUseCase(service: TasksService): CreateTaskUseCase = CreateTaskUseCase(service)

  @Bean
  fun createGetTaskUseCase(service: TasksService): GetTaskUseCase = GetTaskUseCase(service)

  @Bean
  fun createCompleteTaskUseCase(service: TasksService): CompleteTaskUseCase = CompleteTaskUseCase(service)

}