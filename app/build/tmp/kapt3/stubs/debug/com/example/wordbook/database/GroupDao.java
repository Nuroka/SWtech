package com.example.wordbook.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000eH\'J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/wordbook/database/GroupDao;", "", "countGroupNum", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletegroup", "", "group", "Lcom/example/wordbook/database/Group;", "(Lcom/example/wordbook/database/Group;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGroup", "Landroidx/lifecycle/LiveData;", "", "insertgroup", "", "selectAllGroup", "app_debug"})
public abstract interface GroupDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insertgroup(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Group group, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deletegroup(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Group group, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "select * from groups")
    public abstract java.util.List<com.example.wordbook.database.Group> selectAllGroup();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "select * from groups")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.wordbook.database.Group>> getAllGroup();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "select * from groups WHERE groupid = :id")
    public abstract java.lang.Object findById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wordbook.database.Group> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "select count(*) from groups")
    public abstract java.lang.Object countGroupNum(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
}