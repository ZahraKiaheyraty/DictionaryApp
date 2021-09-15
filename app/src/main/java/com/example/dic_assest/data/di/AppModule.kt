package com.example.dic_assest.data.di

import android.content.Context
import androidx.room.Room
import com.example.dic_assest.data.db.MyDataBase
import com.example.dic_assest.data.db.WordDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMyDb(
        @ApplicationContext context: Context,
    ): MyDataBase {

        return Room
            .databaseBuilder(
                context,
                MyDataBase::class.java,
                "dic"
            )
            .fallbackToDestructiveMigration()
            .createFromAsset("dic")
            .build()
    }

    @Provides
    fun provideMyDAO(myDataBase: MyDataBase): WordDao {
        return myDataBase.getDao()
    }
}