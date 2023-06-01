package com.arielgrillo.kotlin.sandbox.infrastructure.driven.repository.tasks

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "tasks", schema = "parsonaladmin")
data class JpaTasksEntity(
  @Id @Column(name = "id", updatable = false, nullable = false) @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int,
  @Column(name = "title") val title: String,
  @Column(name = "description") val description: String,
  @Column(name="isDone") val isDone: Boolean = false
)
