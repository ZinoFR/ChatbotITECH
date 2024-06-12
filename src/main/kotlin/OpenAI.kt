package org.example

import com.aallam.openai.api.http.Timeout
import com.aallam.openai.client.OpenAI
import com.aallam.openai.client.OpenAIConfig
import kotlin.time.Duration.Companion.seconds

val apiKey = "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"


class OpenAI {

    val config = OpenAIConfig(
        token = apiKey,
        timeout = Timeout(socket = 60.seconds),

        )

    val openAI = OpenAI(config)
}