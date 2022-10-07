package com.example.composetutorial

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.tutorial.SampleData
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun Conversation(messages: List<Message>) {

    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewConversation() {
    ComposeTutorialTheme {
        Conversation(SampleData.conversationSample)
    }
}