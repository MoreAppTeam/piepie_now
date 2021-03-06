package com.xappteam.launcher.launcherclient

import android.content.Context

class LauncherClientProxyConnection(
        private val context: Context,
        private val proxyPackage: String = "com.xappteam.launcher.launcherclientproxy",
        private val overlayEnabled: Boolean) {


    companion object {
        const val SERVICE_DISCONNECTED = 0
        const val SERVICE_CONNECTED = 1
        const val SERVICE_CONNECTING = 2
    }
}