package com.acadEvalSys.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [HttpModule::class,DatabaseModule::class])
interface AppComponent {
}