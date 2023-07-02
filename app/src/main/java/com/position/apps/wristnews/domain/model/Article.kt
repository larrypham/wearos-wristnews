package com.position.apps.wristnews.domain.model

import com.position.apps.wristnews.utils.K
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class Article(
    val id: String = UUID.randomUUID().toString(),
    val title: String = K.EMPTY_VALUE,
    val description: String = K.EMPTY_VALUE,
    val author: String = K.EMPTY_VALUE,
    val link: String = K.EMPTY_VALUE,
    val imageLink: String = K.EMPTY_VALUE,
    val publishedAt: String = K.EMPTY_VALUE,
    val content: String = K.EMPTY_VALUE
)