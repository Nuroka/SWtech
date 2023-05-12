// Generated by view binder compiler. Do not edit!
package com.example.wordbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wordbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTestWordGoalBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonMoveTomain;

  @NonNull
  public final Button buttonWord30;

  @NonNull
  public final Button buttonWord50;

  @NonNull
  public final Button buttonWord70;

  private ActivityTestWordGoalBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonMoveTomain, @NonNull Button buttonWord30, @NonNull Button buttonWord50,
      @NonNull Button buttonWord70) {
    this.rootView = rootView;
    this.buttonMoveTomain = buttonMoveTomain;
    this.buttonWord30 = buttonWord30;
    this.buttonWord50 = buttonWord50;
    this.buttonWord70 = buttonWord70;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTestWordGoalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTestWordGoalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_test_word_goal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTestWordGoalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_moveTomain;
      Button buttonMoveTomain = ViewBindings.findChildViewById(rootView, id);
      if (buttonMoveTomain == null) {
        break missingId;
      }

      id = R.id.button_word30;
      Button buttonWord30 = ViewBindings.findChildViewById(rootView, id);
      if (buttonWord30 == null) {
        break missingId;
      }

      id = R.id.button_word50;
      Button buttonWord50 = ViewBindings.findChildViewById(rootView, id);
      if (buttonWord50 == null) {
        break missingId;
      }

      id = R.id.button_word70;
      Button buttonWord70 = ViewBindings.findChildViewById(rootView, id);
      if (buttonWord70 == null) {
        break missingId;
      }

      return new ActivityTestWordGoalBinding((ConstraintLayout) rootView, buttonMoveTomain,
          buttonWord30, buttonWord50, buttonWord70);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
