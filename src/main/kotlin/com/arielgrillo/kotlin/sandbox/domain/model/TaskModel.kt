package com.arielgrillo.kotlin.sandbox.domain.model

data class TaskModel(
  val id: Int,
  val title: String,
  val description: String,
  val isDone: Boolean = false
)
