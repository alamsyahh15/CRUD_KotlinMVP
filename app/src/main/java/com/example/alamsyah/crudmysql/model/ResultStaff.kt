package com.example.alamsyah.crudmysql.model

import com.google.gson.annotations.SerializedName

data class ResultStaff (
    @field:SerializedName("pesan")
    val pesan: String? = null,

    @field:SerializedName("staff")
    val staff: List<DataItem>? = null,

    @field:SerializedName("status")
    val status: Int? = null
)