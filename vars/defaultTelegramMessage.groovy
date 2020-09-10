#!/usr/bin/env groovy

String call(String message, String botToken, String chatId) {
    print 'Call Start'
    encodedMessage = URLEncoder.encode(message, 'UTF-8')

    response = new URL("https://api.telegram.org/bot$botToken/sendMessage?chat_id=$chatId&text=$encodedMessage").text

    print 'Call before return'
    print response

    return response
}
