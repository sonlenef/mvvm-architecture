package tech.leson.android_mvvm_architecture.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tech.leson.android_mvvm_architecture.R

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}