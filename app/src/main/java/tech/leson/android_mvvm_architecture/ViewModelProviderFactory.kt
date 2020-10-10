package tech.leson.android_mvvm_architecture

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import tech.leson.android_mvvm_architecture.data.DataManager
import tech.leson.android_mvvm_architecture.utils.rx.SchedulerProvider

class ViewModelProviderFactory (
    dataManager: DataManager,
    schedulerProvider: SchedulerProvider,
) : ViewModelProvider.NewInstanceFactory() {

    private val mDataManager: DataManager = dataManager
    private val mSchedulerProvider: SchedulerProvider = schedulerProvider

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}
