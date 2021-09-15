package com.example.dic_assest.data.db.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "dictionary")
data class Dictionary constructor(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name = "word") var word: String = "",
    @ColumnInfo(name = "mean") var mean: String = "",
    @ColumnInfo(name = "ara") var ara: String = "",
    @ColumnInfo(name = "fav") var fav: Int = 0

) : Parcelable
