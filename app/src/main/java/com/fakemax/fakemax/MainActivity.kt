package com.fakemax.fakemax

import android.content.Intent
import android.net.Uri
import android.net.Uri.*
import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pm = this.packageManager
        val intent = Intent()
        val telegram = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://t.me/")
        ) //where 1111111111 - telegram userId
        telegram.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        telegram.setPackage("org.telegram.messenger")
        startActivity(telegram)
        finishAffinity()
    }
}