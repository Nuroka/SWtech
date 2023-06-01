package com.example.wordbook.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.wordbook.database.Group.class, com.example.wordbook.database.GroupWord.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/wordbook/database/GroupListDatabase;", "Landroidx/room/RoomDatabase;", "()V", "groupDao", "Lcom/example/wordbook/database/GroupDao;", "getGroupDao", "()Lcom/example/wordbook/database/GroupDao;", "groupwordDao", "Lcom/example/wordbook/database/GroupWordDao;", "getGroupwordDao", "()Lcom/example/wordbook/database/GroupWordDao;", "app_debug"})
public abstract class GroupListDatabase extends androidx.room.RoomDatabase {
    
    public GroupListDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.wordbook.database.GroupDao getGroupDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.wordbook.database.GroupWordDao getGroupwordDao();
}