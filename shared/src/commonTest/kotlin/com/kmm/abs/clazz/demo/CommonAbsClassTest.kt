package com.kmm.abs.clazz.demo

import kotlin.test.Test

class CommonAbsClassTest {

    @Test
    fun testAbs() {
        val common = CommonClass()
        if (PlatformUtil.isJvm()) {
            common.abstractJvmList = listOf(CommonSubJvmClass())
            common.abstractJvmList.forEach {
                println("Jvm:$it")
            }
        } else if (PlatformUtil.isNative()) {
            common.abstractNativeList = listOf(CommonAbsNativeClass())
            common.abstractNativeList.forEach {
                println("Native:$it")
            }
        }
    }
}
