package com.example.registeruserapplication.register.data.post

import com.google.gson.annotations.SerializedName

data class PostResponse(
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("post")
    val post: PostResult? = null
)
