package com.example.dic_assest.data.db.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
@Entity(tableName = "fa2ar")
data class Fa2ar constructor(@PrimaryKey(autoGenerate = true) var id: Int = 0
                             , @ColumnInfo(name = "onvan") var onvan: String = ""
                             , @ColumnInfo(name = "matn") var matn: String = ""
                             , @ColumnInfo(name = "fav") var fav: Int = 0
): Parcelable
