package com.example.dic_assest.data.db

import androidx.room.Dao
import androidx.room.Query
import com.example.dic_assest.data.db.entity.Dictionary
import kotlinx.coroutines.flow.Flow


@Dao
interface WordDao {
    @Query("SELECT * FROM dictionary")
    fun getDefaultWord(): Flow<List<Dictionary>>
}