package org.example

import com.aallam.openai.api.http.Timeout
import com.aallam.openai.client.OpenAI
import com.aallam.openai.client.OpenAIConfig
import kotlin.time.Duration.Companion.seconds

val apiKey = "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"

class ChatLog { //dient zur Aufnahme und Kontextspeicherung des User-Inputs und Bot-Response. Vorraussichtlich wird User "U:" und Bot "B:" sein.
    var chatLog = """"""

    fun writeToHistory(questionOrAnswer: String, userOrBot: Char) {
        chatLog += "$userOrBot: $questionOrAnswer"
    }
}

class OpenAI {
    val LogOfInstance = ChatLog()

    val config = OpenAIConfig(
        token = apiKey,
        timeout = Timeout(socket = 60.seconds),
    )
    val openAI = OpenAI(config)

    fun genResponse(question: String) {
        LogOfInstance.writeToHistory(question, 'U')
        val responsePlacehoder = "12345"
        LogOfInstance.writeToHistory(responsePlacehoder, 'B')
        return
    }
}

fun main() {
    OpenAI()
}