package com.arielgrillo.kotlin.sandbox.infrastructure.driven.repository

import org.hibernate.dialect.PostgreSQLDialect

class CustomPostgreSQLDialect : PostgreSQLDialect() {
  init {
//    registerHibernateType(Types.OTHER, StringArrayType::class.java.name)
//    registerHibernateType(Types.OTHER, IntArrayType::class.java.name)
//    registerHibernateType(Types.OTHER, JsonStringType::class.java.name)
//    registerHibernateType(Types.OTHER, JsonBinaryType::class.java.name)
//    registerHibernateType(Types.OTHER, JsonNodeBinaryType::class.java.name)
//    registerHibernateType(Types.OTHER, JsonNodeStringType::class.java.name)
  }
}
