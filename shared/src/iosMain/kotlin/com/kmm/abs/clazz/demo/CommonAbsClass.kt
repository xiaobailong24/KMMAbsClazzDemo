package com.kmm.abs.clazz.demo

import shared.ObjcAbsClass
import shared.ObjcClass

// 1.Unsupported: actual ObjcAbsClass is NOT abstract class but except CommonAbsClass is abstract class
// actual typealias CommonAbsClass = ObjcAbsClass


// 2.Compile error: Non-final Kotlin subclasses of Objective-C classes are not yet supported
// See:https://kotlinlang.org/docs/native-objc-interop.html#subclassing-swift-objective-c-classes-and-protocols-from-kotlin
actual typealias CommonAbsClass = ObjcAbsClassWrapper
abstract class ObjcAbsClassWrapper : ObjcAbsClass()


actual typealias CommonClass = ObjcClass

actual var CommonClass.abstractList: List<CommonAbsClass>
    get() = this.absList()  //Error: Type mismatch.
    set(value) {
        this.setAbsList(value)
    }