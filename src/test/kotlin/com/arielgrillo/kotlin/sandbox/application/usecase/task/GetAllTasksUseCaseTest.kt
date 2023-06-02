package com.arielgrillo.kotlin.sandbox.application.usecase.task

import com.arielgrillo.kotlin.sandbox.application.usaecase.task.GetAllTasksUseCase
import com.arielgrillo.kotlin.sandbox.domain.model.TaskModel
import com.arielgrillo.kotlin.sandbox.domain.service.tasks.TasksService
import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito

internal class GetAllTasksUseCaseTest {

    @Test
    fun `get all tasks should return ok`(){
        val service = Mockito.mock(TasksService::class.java)
        val useCase = GetAllTasksUseCase(service)

        val tasksFixture = listOf(TaskModel(id = 1,title = "Title", description = "Some desc"))

        Mockito.`when`(service.getAll()).thenReturn(tasksFixture)
        val actual = useCase.execute()

        assertIterableEquals(actual, tasksFixture)
    }

}