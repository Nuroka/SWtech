package com.example.wordbook.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003\"#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001a\u001a\u00020\fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\fR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/wordbook/test/TestViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_mResultState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/wordbook/test/TestViewModel$ResultState;", "kotlin.jvm.PlatformType", "_mTestUnit", "Lcom/example/wordbook/test/TestViewModel$TestUnit;", "correctCount", "", "mResultState", "Landroidx/lifecycle/LiveData;", "getMResultState", "()Landroidx/lifecycle/LiveData;", "mTestUnit", "getMTestUnit", "numOfWords", "getNumOfWords", "()I", "setNumOfWords", "(I)V", "repository", "Lcom/example/wordbook/repository/WordRepository;", "getCorrectCount", "isCorrect", "", "candidateIdx", "onClickCandidate", "", "onClickDay", "day", "Companion", "ResultState", "TestUnit", "app_debug"})
public final class TestViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    public static final com.example.wordbook.test.TestViewModel.Companion Companion = null;
    private static final long DELAY_TIME_SHOWING_NEXT_TEST = 800L;
    private final com.example.wordbook.repository.WordRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.test.TestViewModel.TestUnit> _mTestUnit = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.test.TestViewModel.ResultState> _mResultState = null;
    private int numOfWords = 30;
    private int correctCount = 0;
    
    public TestViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.TestUnit> getMTestUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.wordbook.test.TestViewModel.ResultState> getMResultState() {
        return null;
    }
    
    public final int getNumOfWords() {
        return 0;
    }
    
    public final void setNumOfWords(int p0) {
    }
    
    public final void onClickCandidate(int candidateIdx) {
    }
    
    private final boolean isCorrect(int candidateIdx) {
        return false;
    }
    
    public final void onClickDay(int day) {
    }
    
    public final int getCorrectCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/example/wordbook/test/TestViewModel$TestUnit;", "", "day", "", "question", "Lcom/example/wordbook/database/Word;", "candidates", "", "(ILcom/example/wordbook/database/Word;Ljava/util/List;)V", "getCandidates", "()Ljava/util/List;", "getDay", "()I", "getQuestion", "()Lcom/example/wordbook/database/Word;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class TestUnit {
        private final int day = 0;
        @org.jetbrains.annotations.NotNull
        private final com.example.wordbook.database.Word question = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.example.wordbook.database.Word> candidates = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.test.TestViewModel.TestUnit copy(int day, @org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Word question, @org.jetbrains.annotations.NotNull
        java.util.List<com.example.wordbook.database.Word> candidates) {
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
        
        public TestUnit(int day, @org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Word question, @org.jetbrains.annotations.NotNull
        java.util.List<com.example.wordbook.database.Word> candidates) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getDay() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.database.Word component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.database.Word getQuestion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.wordbook.database.Word> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.example.wordbook.database.Word> getCandidates() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/wordbook/test/TestViewModel$ResultState;", "", "(Ljava/lang/String;I)V", "NONE", "CORRECT", "WRONG", "app_debug"})
    public static enum ResultState {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ CORRECT /* = new CORRECT() */,
        /*public static final*/ WRONG /* = new WRONG() */;
        
        ResultState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/wordbook/test/TestViewModel$Companion;", "", "()V", "DELAY_TIME_SHOWING_NEXT_TEST", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}