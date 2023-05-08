package com.example.wordbook.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [Group::class], version = 1)
abstract class GroupDatabase: RoomDatabase(){
    abstract val groupDao: GroupDao
}

private const val DATABASE_NAME = "groups.db"
private lateinit var INSTANCE: GroupDatabase

fun getDatabaseGroup(context: Context): GroupDatabase {
    synchronized(GroupDatabase::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(context.applicationContext,
                GroupDatabase::class.java, DATABASE_NAME)
                .addCallback(object : RoomDatabase.Callback(){
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        fillInDb(context.applicationContext)
                    }
                })
                .build()
        }
    }
    return INSTANCE
}
