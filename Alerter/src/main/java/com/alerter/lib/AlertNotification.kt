package com.alerter.lib

import android.app.Activity
import com.tapadoo.alerter.Alerter

object AlertNotification {
    fun showMessage(activity: Activity, title: String, message: String) {
        Alerter.create(activity)
            .setTitle(title)
            .setText(message)
            .show()
    }
}