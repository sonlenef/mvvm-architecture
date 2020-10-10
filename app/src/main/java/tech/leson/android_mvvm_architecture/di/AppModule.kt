package tech.leson.android_mvvm_architecture.di

import org.koin.dsl.module
import tech.leson.android_mvvm_architecture.ViewModelProviderFactory
import tech.leson.android_mvvm_architecture.data.AppDataManager
import tech.leson.android_mvvm_architecture.data.DataManager
import tech.leson.android_mvvm_architecture.data.local.db.AppDbHelper
import tech.leson.android_mvvm_architecture.data.local.db.DbHelper
import tech.leson.android_mvvm_architecture.data.local.prefs.AppPreferencesHelper
import tech.leson.android_mvvm_architecture.data.local.prefs.PreferencesHelper
import tech.leson.android_mvvm_architecture.data.remote.ApiHelper
import tech.leson.android_mvvm_architecture.data.remote.AppApiHelper
import tech.leson.android_mvvm_architecture.utils.rx.AppSchedulerProvider
import tech.leson.android_mvvm_architecture.utils.rx.SchedulerProvider

val appModule = module {
    single<DbHelper> { AppDbHelper() }
    single<PreferencesHelper> { AppPreferencesHelper() }
    single<ApiHelper> { AppApiHelper() }
    single<DataManager> { AppDataManager() }
    single<SchedulerProvider> { AppSchedulerProvider() }

    factory { ViewModelProviderFactory(dataManager = get(), schedulerProvider = get()) }
}
