package org.example

import okhttp3.OkHttpClient
import okhttp3.Request

class OkHttp {
    fun attemptRequest() {
        val client = OkHttpClient()
        val openAiUrl = ""
        val request = Request.Builder().url(openAiUrl).build()
        val response = client.newCall(request).execute()
        val responseBody = response.body?.string()

        if (response.isSuccessful && !responseBody.isNullOrEmpty()) {


        } else {
            println("Error: ${response.message}")
        }
    }
}
