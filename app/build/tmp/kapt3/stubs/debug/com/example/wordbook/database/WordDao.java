package com.example.wordbook.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0018\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00150\u001bH\'J\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/wordbook/database/WordDao;", "", "delete", "", "word", "Lcom/example/wordbook/database/Word;", "(Lcom/example/wordbook/database/Word;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordByEnglish", "english", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "insertAll", "", "words", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchWords", "searchKeyword", "selectAll", "selectAllWithLiveData", "Landroidx/lifecycle/LiveData;", "update", "app_debug"})
public abstract interface WordDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Word word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.wordbook.database.Word> words, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Word word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "select * from words")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.wordbook.database.Word>> selectAllWithLiveData();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "select * from words")
    public abstract java.lang.Object selectAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.Word>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "select * from words WHERE id = :id")
    public abstract java.lang.Object findById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wordbook.database.Word> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM words WHERE english LIKE \'%\' || :searchKeyword || \'%\' OR means LIKE \'%\' || :searchKeyword || \'%\'")
    public abstract java.lang.Object searchWords(@org.jetbrains.annotations.NotNull
    java.lang.String searchKeyword, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.Word>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM words WHERE english = :english")
    public abstract java.lang.Object getWordByEnglish(@org.jetbrains.annotations.NotNull
    java.lang.String english, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wordbook.database.Word> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "select count(*) from words")
    public abstract java.lang.Object getCount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Word word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
}