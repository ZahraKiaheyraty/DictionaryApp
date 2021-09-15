package com.example.dic_assest.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dic_assest.data.db.entity.Fa2ar


@Database(entities = arrayOf(Fa2ar::class) , version = 1, exportSchema = true )
abstract class MyDataBase : RoomDatabase() {
    abstract fun getDao(): WordDao

}