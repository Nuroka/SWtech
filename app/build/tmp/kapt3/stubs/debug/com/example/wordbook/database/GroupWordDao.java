package com.example.wordbook.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\u0006\u0010\r\u001a\u00020\tH\'J\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\r\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/wordbook/database/GroupWordDao;", "", "deleteGroupWord", "", "word", "Lcom/example/wordbook/database/GroupWord;", "(Lcom/example/wordbook/database/GroupWord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findGroupWordbyId", "word_id", "", "getAllGroupWordList", "Landroidx/lifecycle/LiveData;", "", "groupid", "getGroupWordEnglishList", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertGroupWord", "", "searchWords", "searchKeyword", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAllGroupWordList", "app_debug"})
public abstract interface GroupWordDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insertGroupWord(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.GroupWord word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteGroupWord(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.GroupWord word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "select * from groupwords WHERE groupid_base_groupword = :groupid")
    public abstract java.lang.Object selectAllGroupWordList(int groupid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.GroupWord>> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "select * from groupwords WHERE groupid_base_groupword = :groupid")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.wordbook.database.GroupWord>> getAllGroupWordList(int groupid);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "select * from groupwords WHERE word_id = :word_id")
    public abstract com.example.wordbook.database.GroupWord findGroupWordbyId(int word_id);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM groupwords WHERE (groupWordEnglish LIKE \'%\' || :searchKeyword || \'%\' OR groupWordMeans LIKE \'%\' || :searchKeyword || \'%\') AND groupid_base_groupword = :groupid  ")
    public abstract java.lang.Object searchWords(@org.jetbrains.annotations.NotNull
    java.lang.String searchKeyword, int groupid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.GroupWord>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT groupWordEnglish FROM groupwords WHERE groupid_base_groupword = :groupid")
    public abstract java.lang.Object getGroupWordEnglishList(int groupid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation);
}