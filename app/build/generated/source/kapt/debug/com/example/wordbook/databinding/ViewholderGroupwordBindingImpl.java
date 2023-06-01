package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewholderGroupwordBindingImpl extends ViewholderGroupwordBinding implements com.example.wordbook.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.wordbox_show, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewholderGroupwordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ViewholderGroupwordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[4]
            );
        this.deleteGroupWord.setTag(null);
        this.englishgroupword.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.meansgroupword.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.example.wordbook.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.groupword == variableId) {
            setGroupword((com.example.wordbook.database.GroupWord) variable);
        }
        else if (BR.onClickDeleteGroupWord == variableId) {
            setOnClickDeleteGroupWord((com.example.wordbook.groupword.GroupWordAdapter.DeleteWordClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGroupword(@Nullable com.example.wordbook.database.GroupWord Groupword) {
        this.mGroupword = Groupword;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.groupword);
        super.requestRebind();
    }
    public void setOnClickDeleteGroupWord(@Nullable com.example.wordbook.groupword.GroupWordAdapter.DeleteWordClickListener OnClickDeleteGroupWord) {
        this.mOnClickDeleteGroupWord = OnClickDeleteGroupWord;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.onClickDeleteGroupWord);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.wordbook.database.GroupWord groupword = mGroupword;
        com.example.wordbook.groupword.GroupWordAdapter.DeleteWordClickListener onClickDeleteGroupWord = mOnClickDeleteGroupWord;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.deleteGroupWord.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.example.wordbook.util.BindingAdaptersKt.setEnglishgroupword(this.englishgroupword, groupword);
            com.example.wordbook.util.BindingAdaptersKt.setMeansgroupword(this.meansgroupword, groupword);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // groupword
        com.example.wordbook.database.GroupWord groupword = mGroupword;
        // onClickDeleteGroupWord != null
        boolean onClickDeleteGroupWordJavaLangObjectNull = false;
        // onClickDeleteGroupWord
        com.example.wordbook.groupword.GroupWordAdapter.DeleteWordClickListener onClickDeleteGroupWord = mOnClickDeleteGroupWord;



        onClickDeleteGroupWordJavaLangObjectNull = (onClickDeleteGroupWord) != (null);
        if (onClickDeleteGroupWordJavaLangObjectNull) {



            onClickDeleteGroupWord.onDeleteGroupWordClick(groupword);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): groupword
        flag 1 (0x2L): onClickDeleteGroupWord
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}