package com.example.alamsyah.crudmysql.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DataItem : Serializable{

    @field:SerializedName("staff_name")
    val staffName: String? = null

    @field:SerializedName("staff_id")
    val staffId: String? = null

    @field:SerializedName("staff_hp")
    val staffHp: String? = null

    @field:SerializedName("staff_alamat")
    val staffAlamat: String? = null
}