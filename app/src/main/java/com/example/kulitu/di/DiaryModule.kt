package com.example.kulitu.di

import com.example.kulitu.model.Contact
import com.example.kulitu.model.Diary
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn 
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DiaryModule {

    @Provides
    fun createType():String{
        return "friends"
    }

    @Provides
    fun providesDiary(contacts:List<Contact>): Diary {
        return Diary("friends", contacts )
    }

    @Provides
    fun createContacts():List<Contact>{
        return listOf(
            Contact("cal","234"),
            Contact("calvin","234"),
            Contact("gemrna","234"),
            Contact("hary","234"),
            Contact("poter","234")
        )
    }

}