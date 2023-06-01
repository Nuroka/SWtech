package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ViewholderGroupBindingImpl extends ViewholderGroupBinding implements com.example.wordbook.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ViewholderGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ViewholderGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[1]
            );
        this.groupname.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.view.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new com.example.wordbook.generated.callback.OnClickListener(this, 1);
        mCallback17 = new com.example.wordbook.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.onClickDeleteGroup == variableId) {
            setOnClickDeleteGroup((com.example.wordbook.grouplist.GroupListAdapter.DeleteClickListener) variable);
        }
        else if (BR.grouptitle == variableId) {
            setGrouptitle((com.example.wordbook.database.Group) variable);
        }
        else if (BR.onClickGroup == variableId) {
            setOnClickGroup((com.example.wordbook.grouplist.GroupListAdapter.GroupClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOnClickDeleteGroup(@Nullable com.example.wordbook.grouplist.GroupListAdapter.DeleteClickListener OnClickDeleteGroup) {
        this.mOnClickDeleteGroup = OnClickDeleteGroup;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.onClickDeleteGroup);
        super.requestRebind();
    }
    public void setGrouptitle(@Nullable com.example.wordbook.database.Group Grouptitle) {
        this.mGrouptitle = Grouptitle;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.grouptitle);
        super.requestRebind();
    }
    public void setOnClickGroup(@Nullable com.example.wordbook.grouplist.GroupListAdapter.GroupClickListener OnClickGroup) {
        this.mOnClickGroup = OnClickGroup;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.onClickGroup);
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
        com.example.wordbook.grouplist.GroupListAdapter.DeleteClickListener onClickDeleteGroup = mOnClickDeleteGroup;
        com.example.wordbook.database.Group grouptitle = mGrouptitle;
        com.example.wordbook.grouplist.GroupListAdapter.GroupClickListener onClickGroup = mOnClickGroup;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            com.example.wordbook.util.BindingAdaptersKt.setGroupTitle(this.groupname, grouptitle);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback17);
            this.view.setOnClickListener(mCallback16);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // onClickGroup != null
                boolean onClickGroupJavaLangObjectNull = false;
                // grouptitle
                com.example.wordbook.database.Group grouptitle = mGrouptitle;
                // onClickGroup
                com.example.wordbook.grouplist.GroupListAdapter.GroupClickListener onClickGroup = mOnClickGroup;



                onClickGroupJavaLangObjectNull = (onClickGroup) != (null);
                if (onClickGroupJavaLangObjectNull) {



                    onClickGroup.onGroupClick(grouptitle);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // onClickDeleteGroup
                com.example.wordbook.grouplist.GroupListAdapter.DeleteClickListener onClickDeleteGroup = mOnClickDeleteGroup;
                // grouptitle
                com.example.wordbook.database.Group grouptitle = mGrouptitle;
                // onClickDeleteGroup != null
                boolean onClickDeleteGroupJavaLangObjectNull = false;



                onClickDeleteGroupJavaLangObjectNull = (onClickDeleteGroup) != (null);
                if (onClickDeleteGroupJavaLangObjectNull) {



                    onClickDeleteGroup.onDeleteClick(grouptitle);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): onClickDeleteGroup
        flag 1 (0x2L): grouptitle
        flag 2 (0x3L): onClickGroup
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}