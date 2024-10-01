package org.example.AnalyticsClient

import com.sun.security.ntlm.Client

class modelView(private val analyticsClient: AnalyticsClient) {
    fun submitClick(){
        analyticsClient.track("submit-click")
    }
}