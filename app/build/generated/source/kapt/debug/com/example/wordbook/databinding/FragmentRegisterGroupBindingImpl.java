package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterGroupBindingImpl extends FragmentRegisterGroupBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.registerGroupBtn, 2);
        sViewsWithIds.put(R.id.textView2, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterGroupBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterGroupBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.inputGroupTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.grouptitle == variableId) {
            setGrouptitle((com.example.wordbook.database.Group) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGrouptitle(@Nullable com.example.wordbook.database.Group Grouptitle) {
        this.mGrouptitle = Grouptitle;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.grouptitle);
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
        java.lang.String grouptitleGrouptitle = null;
        com.example.wordbook.database.Group grouptitle = mGrouptitle;

        if ((dirtyFlags & 0x3L) != 0) {



                if (grouptitle != null) {
                    // read grouptitle.grouptitle
                    grouptitleGrouptitle = grouptitle.getGrouptitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.inputGroupTitle, grouptitleGrouptitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): grouptitle
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}