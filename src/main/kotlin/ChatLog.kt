class ChatLog { //dient zur Aufnahme und Kontextspeicherung des User-Inputs und Bot-Response. Vorraussichtlich wird User "U:" und Bot "B:" sein.
    var chatLog = """"""

    fun writeToHistory(questionOrAnswer: String, userOrBot: Char) {
        chatLog += "$userOrBot: $questionOrAnswer"
    }
}