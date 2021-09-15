package com.kmm.abs.clazz.demo

import com.kmm.abs.clazz.jvm.library.JvmAbsClass
import com.kmm.abs.clazz.jvm.library.JvmClass
import com.kmm.abs.clazz.jvm.library.JvmSubClass

actual object PlatformUtil {
    actual fun isJvm(): Boolean = true
    actual fun isNative(): Boolean = false
}


actual typealias CommonAbsJvmClass = JvmAbsClass
actual typealias CommonSubJvmClass = JvmSubClass

actual class CommonAbsNativeClass {
    // empty implement
}

actual typealias CommonClass = JvmClass

actual var CommonClass.abstractJvmList: List<CommonAbsJvmClass>
    get() = this.absList
    set(value) {
        this.absList = value
    }

actual var CommonClass.abstractNativeList: List<CommonAbsNativeClass>
    get() = throw UnsupportedOperationException()
    set(value) {
        throw UnsupportedOperationException()
    }
