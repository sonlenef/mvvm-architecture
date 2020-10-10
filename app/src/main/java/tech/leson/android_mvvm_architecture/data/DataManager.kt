package tech.leson.android_mvvm_architecture.data

import tech.leson.android_mvvm_architecture.data.local.db.DbHelper
import tech.leson.android_mvvm_architecture.data.local.prefs.PreferencesHelper
import tech.leson.android_mvvm_architecture.data.remote.ApiHelper

interface DataManager : ApiHelper, PreferencesHelper, DbHelper {
}
