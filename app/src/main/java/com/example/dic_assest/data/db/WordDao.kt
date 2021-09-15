package com.example.dic_assest.data.db

import androidx.room.Dao
import androidx.room.Query
import com.example.dic_assest.data.db.entity.Word
import kotlinx.coroutines.flow.Flow


@Dao
interface WordDao {
    @Query("SELECT * FROM word_tb")
    fun getDefaultWord(): Flow<List<Word>>
}