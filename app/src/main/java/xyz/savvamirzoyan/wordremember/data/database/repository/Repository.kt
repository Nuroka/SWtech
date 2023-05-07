package xyz.savvamirzoyan.wordremember.data.database.repository

import xyz.savvamirzoyan.wordremember.data.database.AppDatabase

abstract class Repository {

    val db = AppDatabase.getInstance()
}