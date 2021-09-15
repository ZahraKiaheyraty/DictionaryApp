package com.example.dic_assest.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dic_assest.data.db.entity.Word
import com.example.dic_assest.data.db.Converter


@Database(entities = arrayOf(Word::class) , version = 3, exportSchema = true )
@TypeConverters(value = arrayOf(Converter::class))
abstract class MyDataBase : RoomDatabase() {
    abstract fun getDao(): WordDao

}