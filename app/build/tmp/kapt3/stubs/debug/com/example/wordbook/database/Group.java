package com.example.wordbook.database;

import java.lang.System;

@androidx.room.Entity(tableName = "groups")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/wordbook/database/Group;", "", "groupid", "", "grouptitle", "", "(ILjava/lang/String;)V", "getGroupid", "()I", "getGrouptitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_debug"})
public final class Group {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int groupid = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String grouptitle = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.wordbook.database.Group.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.wordbook.database.Group copy(int groupid, @org.jetbrains.annotations.NotNull
    java.lang.String grouptitle) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Group(int groupid, @org.jetbrains.annotations.NotNull
    java.lang.String grouptitle) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getGroupid() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGrouptitle() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/wordbook/database/Group$Companion;", "", "()V", "make", "Lcom/example/wordbook/database/Group;", "id", "", "title", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.database.Group make(int id, @org.jetbrains.annotations.NotNull
        java.lang.String title) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.database.Group make(@org.jetbrains.annotations.NotNull
        java.lang.String title) {
            return null;
        }
    }
}