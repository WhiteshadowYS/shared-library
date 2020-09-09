#!/usr/bin/env groovy

def call(String message, String botToken, String chatId) {
    def encodedMessage = URLEncoder.encode(message, "UTF-8")

    def response = new URL("https://api.telegram.org/bot$botToken/sendMessage?chat_id=$chatId&text=$encodedMessage");
}