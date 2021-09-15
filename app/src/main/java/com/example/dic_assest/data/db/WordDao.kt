package com.example.dic_assest.data.db

import androidx.room.Dao
import androidx.room.Query
import com.example.dic_assest.data.db.entity.Fa2ar
import kotlinx.coroutines.flow.Flow


@Dao
interface WordDao {
    @Query("SELECT * FROM fa2ar")
    fun getDefaultWord(): Flow<List<Fa2ar>>
}