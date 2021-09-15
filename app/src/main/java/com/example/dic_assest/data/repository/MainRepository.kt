package com.example.dic_assest.data.repository

import com.example.dic_assest.data.db.WordDao
import com.example.dic_assest.data.db.entity.Dictionary
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainRepository @Inject constructor(var db:WordDao) {
    fun getAllDetails(): Flow<List<Dictionary>> {
        return db.getDefaultWord()
    }
}