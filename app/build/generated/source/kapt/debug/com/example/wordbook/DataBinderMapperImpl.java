package com.example.wordbook;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.wordbook.databinding.FragmentAddGroupWordBindingImpl;
import com.example.wordbook.databinding.FragmentAddWordInfoBindingImpl;
import com.example.wordbook.databinding.FragmentEditVocaBindingImpl;
import com.example.wordbook.databinding.FragmentFirstTestBindingImpl;
import com.example.wordbook.databinding.FragmentFirstTestResultBindingImpl;
import com.example.wordbook.databinding.FragmentGroupListBindingImpl;
import com.example.wordbook.databinding.FragmentGroupWordBindingImpl;
import com.example.wordbook.databinding.FragmentMainBindingImpl;
import com.example.wordbook.databinding.FragmentRegisterGroupBindingImpl;
import com.example.wordbook.databinding.FragmentRegisterVocaBindingImpl;
import com.example.wordbook.databinding.FragmentStudyBindingImpl;
import com.example.wordbook.databinding.FragmentStudyDateBindingImpl;
import com.example.wordbook.databinding.FragmentTestBindingImpl;
import com.example.wordbook.databinding.FragmentTestDateBindingImpl;
import com.example.wordbook.databinding.FragmentTestResultBindingImpl;
import com.example.wordbook.databinding.FragmentTestWordGoalBindingImpl;
import com.example.wordbook.databinding.FragmentVocaListBindingImpl;
import com.example.wordbook.databinding.ViewholderAddGroupwordBindingImpl;
import com.example.wordbook.databinding.ViewholderGroupBindingImpl;
import com.example.wordbook.databinding.ViewholderGroupwordBindingImpl;
import com.example.wordbook.databinding.ViewholderVocaBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTADDGROUPWORD = 1;

  private static final int LAYOUT_FRAGMENTADDWORDINFO = 2;

  private static final int LAYOUT_FRAGMENTEDITVOCA = 3;

  private static final int LAYOUT_FRAGMENTFIRSTTEST = 4;

  private static final int LAYOUT_FRAGMENTFIRSTTESTRESULT = 5;

  private static final int LAYOUT_FRAGMENTGROUPLIST = 6;

  private static final int LAYOUT_FRAGMENTGROUPWORD = 7;

  private static final int LAYOUT_FRAGMENTMAIN = 8;

  private static final int LAYOUT_FRAGMENTREGISTERGROUP = 9;

  private static final int LAYOUT_FRAGMENTREGISTERVOCA = 10;

  private static final int LAYOUT_FRAGMENTSTUDY = 11;

  private static final int LAYOUT_FRAGMENTSTUDYDATE = 12;

  private static final int LAYOUT_FRAGMENTTEST = 13;

  private static final int LAYOUT_FRAGMENTTESTDATE = 14;

  private static final int LAYOUT_FRAGMENTTESTRESULT = 15;

  private static final int LAYOUT_FRAGMENTTESTWORDGOAL = 16;

  private static final int LAYOUT_FRAGMENTVOCALIST = 17;

  private static final int LAYOUT_VIEWHOLDERADDGROUPWORD = 18;

  private static final int LAYOUT_VIEWHOLDERGROUP = 19;

  private static final int LAYOUT_VIEWHOLDERGROUPWORD = 20;

  private static final int LAYOUT_VIEWHOLDERVOCA = 21;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(21);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_add_group_word, LAYOUT_FRAGMENTADDGROUPWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_add_word_info, LAYOUT_FRAGMENTADDWORDINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_edit_voca, LAYOUT_FRAGMENTEDITVOCA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_first_test, LAYOUT_FRAGMENTFIRSTTEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_first_test_result, LAYOUT_FRAGMENTFIRSTTESTRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_group_list, LAYOUT_FRAGMENTGROUPLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_group_word, LAYOUT_FRAGMENTGROUPWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_register_group, LAYOUT_FRAGMENTREGISTERGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_register_voca, LAYOUT_FRAGMENTREGISTERVOCA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_study, LAYOUT_FRAGMENTSTUDY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_study_date, LAYOUT_FRAGMENTSTUDYDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_test, LAYOUT_FRAGMENTTEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_test_date, LAYOUT_FRAGMENTTESTDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_test_result, LAYOUT_FRAGMENTTESTRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_test_word_goal, LAYOUT_FRAGMENTTESTWORDGOAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.fragment_voca_list, LAYOUT_FRAGMENTVOCALIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.viewholder_add_groupword, LAYOUT_VIEWHOLDERADDGROUPWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.viewholder_group, LAYOUT_VIEWHOLDERGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.viewholder_groupword, LAYOUT_VIEWHOLDERGROUPWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.wordbook.R.layout.viewholder_voca, LAYOUT_VIEWHOLDERVOCA);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTADDGROUPWORD: {
          if ("layout/fragment_add_group_word_0".equals(tag)) {
            return new FragmentAddGroupWordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_group_word is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDWORDINFO: {
          if ("layout/fragment_add_word_info_0".equals(tag)) {
            return new FragmentAddWordInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_word_info is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITVOCA: {
          if ("layout/fragment_edit_voca_0".equals(tag)) {
            return new FragmentEditVocaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_voca is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFIRSTTEST: {
          if ("layout/fragment_first_test_0".equals(tag)) {
            return new FragmentFirstTestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_first_test is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFIRSTTESTRESULT: {
          if ("layout/fragment_first_test_result_0".equals(tag)) {
            return new FragmentFirstTestResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_first_test_result is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGROUPLIST: {
          if ("layout/fragment_group_list_0".equals(tag)) {
            return new FragmentGroupListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_group_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGROUPWORD: {
          if ("layout/fragment_group_word_0".equals(tag)) {
            return new FragmentGroupWordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_group_word is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERGROUP: {
          if ("layout/fragment_register_group_0".equals(tag)) {
            return new FragmentRegisterGroupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_group is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTERVOCA: {
          if ("layout/fragment_register_voca_0".equals(tag)) {
            return new FragmentRegisterVocaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register_voca is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTUDY: {
          if ("layout/fragment_study_0".equals(tag)) {
            return new FragmentStudyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_study is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTUDYDATE: {
          if ("layout/fragment_study_date_0".equals(tag)) {
            return new FragmentStudyDateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_study_date is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEST: {
          if ("layout/fragment_test_0".equals(tag)) {
            return new FragmentTestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTESTDATE: {
          if ("layout/fragment_test_date_0".equals(tag)) {
            return new FragmentTestDateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test_date is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTESTRESULT: {
          if ("layout/fragment_test_result_0".equals(tag)) {
            return new FragmentTestResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test_result is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTESTWORDGOAL: {
          if ("layout/fragment_test_word_goal_0".equals(tag)) {
            return new FragmentTestWordGoalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test_word_goal is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVOCALIST: {
          if ("layout/fragment_voca_list_0".equals(tag)) {
            return new FragmentVocaListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_voca_list is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERADDGROUPWORD: {
          if ("layout/viewholder_add_groupword_0".equals(tag)) {
            return new ViewholderAddGroupwordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for viewholder_add_groupword is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERGROUP: {
          if ("layout/viewholder_group_0".equals(tag)) {
            return new ViewholderGroupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for viewholder_group is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERGROUPWORD: {
          if ("layout/viewholder_groupword_0".equals(tag)) {
            return new ViewholderGroupwordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for viewholder_groupword is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERVOCA: {
          if ("layout/viewholder_voca_0".equals(tag)) {
            return new ViewholderVocaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for viewholder_voca is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(11);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "grouptitle");
      sKeys.put(2, "groupword");
      sKeys.put(3, "onClick");
      sKeys.put(4, "onClickAddWord");
      sKeys.put(5, "onClickDeleteGroup");
      sKeys.put(6, "onClickDeleteGroupWord");
      sKeys.put(7, "onClickGroup");
      sKeys.put(8, "viewModel");
      sKeys.put(9, "word");
      sKeys.put(10, "wordInfo");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(21);

    static {
      sKeys.put("layout/fragment_add_group_word_0", com.example.wordbook.R.layout.fragment_add_group_word);
      sKeys.put("layout/fragment_add_word_info_0", com.example.wordbook.R.layout.fragment_add_word_info);
      sKeys.put("layout/fragment_edit_voca_0", com.example.wordbook.R.layout.fragment_edit_voca);
      sKeys.put("layout/fragment_first_test_0", com.example.wordbook.R.layout.fragment_first_test);
      sKeys.put("layout/fragment_first_test_result_0", com.example.wordbook.R.layout.fragment_first_test_result);
      sKeys.put("layout/fragment_group_list_0", com.example.wordbook.R.layout.fragment_group_list);
      sKeys.put("layout/fragment_group_word_0", com.example.wordbook.R.layout.fragment_group_word);
      sKeys.put("layout/fragment_main_0", com.example.wordbook.R.layout.fragment_main);
      sKeys.put("layout/fragment_register_group_0", com.example.wordbook.R.layout.fragment_register_group);
      sKeys.put("layout/fragment_register_voca_0", com.example.wordbook.R.layout.fragment_register_voca);
      sKeys.put("layout/fragment_study_0", com.example.wordbook.R.layout.fragment_study);
      sKeys.put("layout/fragment_study_date_0", com.example.wordbook.R.layout.fragment_study_date);
      sKeys.put("layout/fragment_test_0", com.example.wordbook.R.layout.fragment_test);
      sKeys.put("layout/fragment_test_date_0", com.example.wordbook.R.layout.fragment_test_date);
      sKeys.put("layout/fragment_test_result_0", com.example.wordbook.R.layout.fragment_test_result);
      sKeys.put("layout/fragment_test_word_goal_0", com.example.wordbook.R.layout.fragment_test_word_goal);
      sKeys.put("layout/fragment_voca_list_0", com.example.wordbook.R.layout.fragment_voca_list);
      sKeys.put("layout/viewholder_add_groupword_0", com.example.wordbook.R.layout.viewholder_add_groupword);
      sKeys.put("layout/viewholder_group_0", com.example.wordbook.R.layout.viewholder_group);
      sKeys.put("layout/viewholder_groupword_0", com.example.wordbook.R.layout.viewholder_groupword);
      sKeys.put("layout/viewholder_voca_0", com.example.wordbook.R.layout.viewholder_voca);
    }
  }
}
