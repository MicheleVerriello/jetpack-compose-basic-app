package com.uniba.mv.sudokuapp.common

import kotlin.coroutines.CoroutineContext

interface DispatcherProvider {
    fun provideUIContext(): CoroutineContext
    fun provideIOContext(): CoroutineContext
}