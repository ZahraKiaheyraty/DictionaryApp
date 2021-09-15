package com.example.dic_assest.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dic_assest.data.db.entity.Dictionary


@Database(entities = arrayOf(Dictionary::class) , version = 1, exportSchema = true )
abstract class MyDataBase : RoomDatabase() {
    abstract fun getDao(): WordDao

}