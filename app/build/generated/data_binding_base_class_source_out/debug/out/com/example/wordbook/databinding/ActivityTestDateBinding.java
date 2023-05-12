// Generated by view binder compiler. Do not edit!
package com.example.wordbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wordbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTestDateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonDay1;

  @NonNull
  public final Button buttonDay10;

  @NonNull
  public final Button buttonDay11;

  @NonNull
  public final Button buttonDay12;

  @NonNull
  public final Button buttonDay2;

  @NonNull
  public final Button buttonDay3;

  @NonNull
  public final Button buttonDay4;

  @NonNull
  public final Button buttonDay5;

  @NonNull
  public final Button buttonDay6;

  @NonNull
  public final Button buttonDay7;

  @NonNull
  public final Button buttonDay8;

  @NonNull
  public final Button buttonDay9;

  @NonNull
  public final ImageView imageView;

  private ActivityTestDateBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonDay1,
      @NonNull Button buttonDay10, @NonNull Button buttonDay11, @NonNull Button buttonDay12,
      @NonNull Button buttonDay2, @NonNull Button buttonDay3, @NonNull Button buttonDay4,
      @NonNull Button buttonDay5, @NonNull Button buttonDay6, @NonNull Button buttonDay7,
      @NonNull Button buttonDay8, @NonNull Button buttonDay9, @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.buttonDay1 = buttonDay1;
    this.buttonDay10 = buttonDay10;
    this.buttonDay11 = buttonDay11;
    this.buttonDay12 = buttonDay12;
    this.buttonDay2 = buttonDay2;
    this.buttonDay3 = buttonDay3;
    this.buttonDay4 = buttonDay4;
    this.buttonDay5 = buttonDay5;
    this.buttonDay6 = buttonDay6;
    this.buttonDay7 = buttonDay7;
    this.buttonDay8 = buttonDay8;
    this.buttonDay9 = buttonDay9;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTestDateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTestDateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_test_date, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTestDateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_day1;
      Button buttonDay1 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay1 == null) {
        break missingId;
      }

      id = R.id.button_day10;
      Button buttonDay10 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay10 == null) {
        break missingId;
      }

      id = R.id.button_day11;
      Button buttonDay11 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay11 == null) {
        break missingId;
      }

      id = R.id.button_day12;
      Button buttonDay12 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay12 == null) {
        break missingId;
      }

      id = R.id.button_day2;
      Button buttonDay2 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay2 == null) {
        break missingId;
      }

      id = R.id.button_day3;
      Button buttonDay3 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay3 == null) {
        break missingId;
      }

      id = R.id.button_day4;
      Button buttonDay4 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay4 == null) {
        break missingId;
      }

      id = R.id.button_day5;
      Button buttonDay5 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay5 == null) {
        break missingId;
      }

      id = R.id.button_day6;
      Button buttonDay6 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay6 == null) {
        break missingId;
      }

      id = R.id.button_day7;
      Button buttonDay7 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay7 == null) {
        break missingId;
      }

      id = R.id.button_day8;
      Button buttonDay8 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay8 == null) {
        break missingId;
      }

      id = R.id.button_day9;
      Button buttonDay9 = ViewBindings.findChildViewById(rootView, id);
      if (buttonDay9 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      return new ActivityTestDateBinding((ConstraintLayout) rootView, buttonDay1, buttonDay10,
          buttonDay11, buttonDay12, buttonDay2, buttonDay3, buttonDay4, buttonDay5, buttonDay6,
          buttonDay7, buttonDay8, buttonDay9, imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
