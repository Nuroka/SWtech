package com.example.wordbook.addgroupword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0015\u0016\u0017B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/wordbook/addgroupword/AddGroupWordAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/wordbook/database/Word;", "Lcom/example/wordbook/addgroupword/AddGroupWordAdapter$AddGroupWordViewHolder;", "onMoveToWordInfo", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "word", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnMoveToWordInfo", "()Lkotlin/jvm/functions/Function1;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AddGroupWordClickListener", "AddGroupWordDiffCallback", "AddGroupWordViewHolder", "app_debug"})
public final class AddGroupWordAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.wordbook.database.Word, com.example.wordbook.addgroupword.AddGroupWordAdapter.AddGroupWordViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.wordbook.database.Word, kotlin.Unit> onMoveToWordInfo = null;
    
    public AddGroupWordAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.wordbook.database.Word, kotlin.Unit> onMoveToWordInfo) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.example.wordbook.database.Word, kotlin.Unit> getOnMoveToWordInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.wordbook.addgroupword.AddGroupWordAdapter.AddGroupWordViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.wordbook.addgroupword.AddGroupWordAdapter.AddGroupWordViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/wordbook/addgroupword/AddGroupWordAdapter$AddGroupWordDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/wordbook/database/Word;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class AddGroupWordDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.wordbook.database.Word> {
        
        public AddGroupWordDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Word oldItem, @org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Word newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Word oldItem, @org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Word newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/wordbook/addgroupword/AddGroupWordAdapter$AddGroupWordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/wordbook/databinding/ViewholderAddGroupwordBinding;", "(Lcom/example/wordbook/databinding/ViewholderAddGroupwordBinding;)V", "getBinding", "()Lcom/example/wordbook/databinding/ViewholderAddGroupwordBinding;", "Companion", "app_debug"})
    public static final class AddGroupWordViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.wordbook.databinding.ViewholderAddGroupwordBinding binding = null;
        @org.jetbrains.annotations.NotNull
        public static final com.example.wordbook.addgroupword.AddGroupWordAdapter.AddGroupWordViewHolder.Companion Companion = null;
        
        private AddGroupWordViewHolder(com.example.wordbook.databinding.ViewholderAddGroupwordBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.databinding.ViewholderAddGroupwordBinding getBinding() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/wordbook/addgroupword/AddGroupWordAdapter$AddGroupWordViewHolder$Companion;", "", "()V", "from", "Lcom/example/wordbook/addgroupword/AddGroupWordAdapter$AddGroupWordViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.wordbook.addgroupword.AddGroupWordAdapter.AddGroupWordViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/wordbook/addgroupword/AddGroupWordAdapter$AddGroupWordClickListener;", "", "onMoveToWordInfo", "Lkotlin/Function1;", "Lcom/example/wordbook/database/Word;", "Lkotlin/ParameterName;", "name", "word", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnMoveToWordInfo", "()Lkotlin/jvm/functions/Function1;", "onAddGroupWordClick", "app_debug"})
    public static final class AddGroupWordClickListener {
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<com.example.wordbook.database.Word, kotlin.Unit> onMoveToWordInfo = null;
        
        public AddGroupWordClickListener(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.wordbook.database.Word, kotlin.Unit> onMoveToWordInfo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<com.example.wordbook.database.Word, kotlin.Unit> getOnMoveToWordInfo() {
            return null;
        }
        
        public final void onAddGroupWordClick(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Word word) {
        }
    }
}