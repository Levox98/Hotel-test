package com.hoteltest

import android.app.Application
import com.hoteltest.api.ApiModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface ApplicationComponent {
}

class HotelApp : Application() {
}