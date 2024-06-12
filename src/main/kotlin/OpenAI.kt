package org.example

import com.aallam.openai.api.http.Timeout
import com.aallam.openai.client.OpenAI
import com.aallam.openai.client.OpenAIConfig
import kotlin.time.Duration.Companion.seconds


class OpenAI {
    val LogOfInstance = ChatLog()

    val apiKey = "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"

    val config = OpenAIConfig(
        token = apiKey,
        timeout = Timeout(socket = 60.seconds),
    )
    val openAI = OpenAI(config) // OpenAI Objekt erstellen

    fun genResponse(question: String) {
        LogOfInstance.writeToHistory(question, 'U')
        val responsePlacehoder = "12345"
        LogOfInstance.writeToHistory(responsePlacehoder, 'B')
        return
    }
}