package com.kmm.abs.clazz.demo

import shared.NativeAbsClass
import shared.NativeClass

// 1.Unsupported: actual NativeAbsClass is NOT abstract class but except CommonAbsClass is abstract class
// actual typealias CommonAbsClass = NativeAbsClass


// 2.Compile error: Non-final Kotlin subclasses of Objective-C classes are not yet supported
// See:https://kotlinlang.org/docs/native-objc-interop.html#subclassing-swift-objective-c-classes-and-protocols-from-kotlin
//actual typealias CommonAbsClass = NativeAbsClassWrapper
//abstract class NativeAbsClassWrapper : NativeAbsClass()

// 3.workaround
actual object PlatformUtil {
    actual fun isJvm(): Boolean = false
    actual fun isNative(): Boolean = true
}

actual abstract class CommonAbsJvmClass {
    // empty implement
}
actual class CommonSubJvmClass : CommonAbsJvmClass() {
    // empty implement
}
actual typealias CommonAbsNativeClass = NativeAbsClass

actual typealias CommonClass = NativeClass

actual var CommonClass.abstractJvmList: List<CommonAbsJvmClass>
    get() = throw UnsupportedOperationException()
    set(value) {
        throw UnsupportedOperationException()
    }

actual var CommonClass.abstractNativeList: List<CommonAbsNativeClass>
    get() = this.absList() as? List<CommonAbsNativeClass> ?: emptyList()
    set(value) {
        this.setAbsList(value)
    }
