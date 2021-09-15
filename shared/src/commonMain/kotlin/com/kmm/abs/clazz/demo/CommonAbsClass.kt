package com.kmm.abs.clazz.demo

expect object PlatformUtil {
    fun isJvm(): Boolean
    fun isNative(): Boolean
}

expect abstract class CommonAbsJvmClass
expect class CommonSubJvmClass() : CommonAbsJvmClass

expect class CommonAbsNativeClass()

expect class CommonClass()

expect var CommonClass.abstractJvmList: List<CommonAbsJvmClass>


expect var CommonClass.abstractNativeList: List<CommonAbsNativeClass>
