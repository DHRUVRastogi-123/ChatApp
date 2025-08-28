package com.example.chatapptemplate.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.chatapptemplate.data.Message

class ChatViewModel : ViewModel() {
    private val _messages = mutableStateListOf<Message>()
    val messages: List<Message> get() = _messages

    fun sendMessage(text: String) {
        if (text.isNotEmpty()) {
            _messages.add(Message(text, true))
            // Fake reply
            _messages.add(Message("Echo: $text", false))
        }
    }
}
