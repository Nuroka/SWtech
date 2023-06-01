package com.example.wordbook.database;

import java.lang.System;

@androidx.room.Entity(tableName = "groupwords", foreignKeys = {@androidx.room.ForeignKey(entity = com.example.wordbook.database.Group.class, childColumns = {"groupid_base_groupword"}, onDelete = 5, parentColumns = {"groupid"})})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/example/wordbook/database/GroupWord;", "", "word_id", "", "groupid_base_groupword", "groupWordEnglish", "", "groupWordMeans", "(IILjava/lang/String;Ljava/lang/String;)V", "getGroupWordEnglish", "()Ljava/lang/String;", "setGroupWordEnglish", "(Ljava/lang/String;)V", "getGroupWordMeans", "setGroupWordMeans", "getGroupid_base_groupword", "()I", "setGroupid_base_groupword", "(I)V", "getWord_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_debug"})
public final class GroupWord {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int word_id = 0;
    private int groupid_base_groupword;
    @org.jetbrains.annotations.NotNull
    private java.lang.String groupWordEnglish;
    @org.jetbrains.annotations.NotNull
    private java.lang.String groupWordMeans;
    @org.jetbrains.annotations.NotNull
    public static final com.example.wordbook.database.GroupWord.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.wordbook.database.GroupWord copy(int word_id, int groupid_base_groupword, @org.jetbrains.annotations.NotNull
    java.lang.String groupWordEnglish, @org.jetbrains.annotations.NotNull
    java.lang.String groupWordMeans) {
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
    
    public GroupWord(int word_id, int groupid_base_groupword, @org.jetbrains.annotations.NotNull
    java.lang.String groupWordEnglish, @org.jetbrains.annotations.NotNull
    java.lang.String groupWordMeans) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getWord_id() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getGroupid_base_groupword() {
        return 0;
    }
    
    public final void setGroupid_base_groupword(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGroupWordEnglish() {
        return null;
    }
    
    public final void setGroupWordEnglish(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGroupWordMeans() {
        return null;
    }
    
    public final void setGroupWordMeans(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t\u00a8\u0006\u000b"}, d2 = {"Lcom/example/wordbook/database/GroupWord$Companion;", "", "()V", "make", "Lcom/example/wordbook/database/GroupWord;", "word_id", "", "groupid_base_groupword", "groupWordEnglish", "", "groupWordMeans", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.database.GroupWord make(int word_id, int groupid_base_groupword, @org.jetbrains.annotations.NotNull
        java.lang.String groupWordEnglish, @org.jetbrains.annotations.NotNull
        java.lang.String groupWordMeans) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.database.GroupWord make(int groupid_base_groupword, @org.jetbrains.annotations.NotNull
        java.lang.String groupWordEnglish, @org.jetbrains.annotations.NotNull
        java.lang.String groupWordMeans) {
            return null;
        }
    }
}