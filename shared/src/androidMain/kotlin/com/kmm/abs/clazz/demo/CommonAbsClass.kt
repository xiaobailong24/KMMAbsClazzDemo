package com.kmm.abs.clazz.demo

import com.kmm.abs.clazz.jvm.library.JavaAbsClass
import com.kmm.abs.clazz.jvm.library.JavaClass

actual typealias CommonAbsClass = JavaAbsClass

actual typealias CommonClass = JavaClass

actual var CommonClass.abstractList: List<CommonAbsClass>
    get() = this.absList
    set(value) {
        this.absList = value
    }