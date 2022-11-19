package com.firebase.mediumclient.models

import android.media.Image
import java.util.Date

data class Article (
        var image: Image,
        val title: String ="",
        val publishDate: Date = Date(),
        val content: String="",
        val abstract: String ="",
        val writer: User = User(),
        val minRead: Int = 0,
        val topics: Topic = Topic()
        )