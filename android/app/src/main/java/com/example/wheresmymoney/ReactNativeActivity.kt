package com.example.wheresmymoney

import android.content.Intent
import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate

class ReactNativeActivity : ReactActivity() {   

    override fun getMainComponentName(): String = "ReactNativeApp"

    override fun createReactActivityDelegate(): ReactActivityDelegate {
        return object : ReactActivityDelegate(this, mainComponentName) {
            override fun getLaunchOptions(): Bundle {
                val intent: Intent = getIntent()
                val componentName: String? = intent.getStringExtra("componentName")
                val initialProperties = Bundle()
                initialProperties.putString("componentName", componentName ?: "")
                return initialProperties
            }
        }
    }
}