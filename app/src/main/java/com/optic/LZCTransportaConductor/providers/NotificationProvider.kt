package com.optic.LZCTransportaConductor.providers

import com.optic.LZCTransportaConductor.api.IFCMApi
import com.optic.LZCTransportaConductor.api.RetrofitClient
import com.optic.LZCTransportaConductor.models.FCMBody
import com.optic.LZCTransportaConductor.models.FCMResponse
import retrofit2.Call

class NotificationProvider {

    private val URL = "https://fcm.googleapis.com"

    fun sendNotification(body: FCMBody): Call<FCMResponse> {
        return RetrofitClient.getClient(URL).create(IFCMApi::class.java).send(body)
    }

}