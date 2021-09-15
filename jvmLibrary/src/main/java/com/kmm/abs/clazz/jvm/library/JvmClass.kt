package com.kmm.abs.clazz.jvm.library

abstract class JvmAbsClass
class JvmSubClass: JvmAbsClass()

class JvmClass {
    var absList: List<JvmAbsClass> = listOf()
}