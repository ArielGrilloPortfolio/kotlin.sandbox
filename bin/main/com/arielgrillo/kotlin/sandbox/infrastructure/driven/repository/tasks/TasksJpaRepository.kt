package com.arielgrillo.kotlin.sandbox.infrastructure.driven.repository.tasks

import org.springframework.data.repository.CrudRepository

interface TasksJpaRepository: CrudRepository<JpaTasksEntity,Int>