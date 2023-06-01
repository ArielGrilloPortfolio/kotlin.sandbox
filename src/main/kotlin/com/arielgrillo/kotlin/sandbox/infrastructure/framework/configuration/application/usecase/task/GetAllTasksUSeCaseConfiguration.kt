package com.arielgrillo.kotlin.sandbox.infrastructure.framework.configuration.application.usecase.task

import com.arielgrillo.kotlin.sandbox.application.usaecase.task.GetAllTasksUseCase
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
  fun createUseCase(service: TasksService): GetAllTasksUseCase = GetAllTasksUseCase(service)
}