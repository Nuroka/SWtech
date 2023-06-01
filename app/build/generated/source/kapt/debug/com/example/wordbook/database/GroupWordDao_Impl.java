package com.example.wordbook.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GroupWordDao_Impl implements GroupWordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GroupWord> __insertionAdapterOfGroupWord;

  private final EntityDeletionOrUpdateAdapter<GroupWord> __deletionAdapterOfGroupWord;

  public GroupWordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGroupWord = new EntityInsertionAdapter<GroupWord>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `groupwords` (`word_id`,`groupid_base_groupword`,`groupWordEnglish`,`groupWordMeans`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GroupWord value) {
        stmt.bindLong(1, value.getWord_id());
        stmt.bindLong(2, value.getGroupid_base_groupword());
        if (value.getGroupWordEnglish() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getGroupWordEnglish());
        }
        if (value.getGroupWordMeans() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getGroupWordMeans());
        }
      }
    };
    this.__deletionAdapterOfGroupWord = new EntityDeletionOrUpdateAdapter<GroupWord>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `groupwords` WHERE `word_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GroupWord value) {
        stmt.bindLong(1, value.getWord_id());
      }
    };
  }

  @Override
  public Object insertGroupWord(final GroupWord word,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfGroupWord.insertAndReturnId(word);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteGroupWord(final GroupWord word,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGroupWord.handle(word);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object selectAllGroupWordList(final int groupid,
      final Continuation<? super List<GroupWord>> continuation) {
    final String _sql = "select * from groupwords WHERE groupid_base_groupword = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupid);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<GroupWord>>() {
      @Override
      public List<GroupWord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWordId = CursorUtil.getColumnIndexOrThrow(_cursor, "word_id");
          final int _cursorIndexOfGroupidBaseGroupword = CursorUtil.getColumnIndexOrThrow(_cursor, "groupid_base_groupword");
          final int _cursorIndexOfGroupWordEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "groupWordEnglish");
          final int _cursorIndexOfGroupWordMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "groupWordMeans");
          final List<GroupWord> _result = new ArrayList<GroupWord>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GroupWord _item;
            final int _tmpWord_id;
            _tmpWord_id = _cursor.getInt(_cursorIndexOfWordId);
            final int _tmpGroupid_base_groupword;
            _tmpGroupid_base_groupword = _cursor.getInt(_cursorIndexOfGroupidBaseGroupword);
            final String _tmpGroupWordEnglish;
            if (_cursor.isNull(_cursorIndexOfGroupWordEnglish)) {
              _tmpGroupWordEnglish = null;
            } else {
              _tmpGroupWordEnglish = _cursor.getString(_cursorIndexOfGroupWordEnglish);
            }
            final String _tmpGroupWordMeans;
            if (_cursor.isNull(_cursorIndexOfGroupWordMeans)) {
              _tmpGroupWordMeans = null;
            } else {
              _tmpGroupWordMeans = _cursor.getString(_cursorIndexOfGroupWordMeans);
            }
            _item = new GroupWord(_tmpWord_id,_tmpGroupid_base_groupword,_tmpGroupWordEnglish,_tmpGroupWordMeans);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<GroupWord>> getAllGroupWordList(final int groupid) {
    final String _sql = "select * from groupwords WHERE groupid_base_groupword = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupid);
    return __db.getInvalidationTracker().createLiveData(new String[]{"groupwords"}, false, new Callable<List<GroupWord>>() {
      @Override
      public List<GroupWord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWordId = CursorUtil.getColumnIndexOrThrow(_cursor, "word_id");
          final int _cursorIndexOfGroupidBaseGroupword = CursorUtil.getColumnIndexOrThrow(_cursor, "groupid_base_groupword");
          final int _cursorIndexOfGroupWordEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "groupWordEnglish");
          final int _cursorIndexOfGroupWordMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "groupWordMeans");
          final List<GroupWord> _result = new ArrayList<GroupWord>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GroupWord _item;
            final int _tmpWord_id;
            _tmpWord_id = _cursor.getInt(_cursorIndexOfWordId);
            final int _tmpGroupid_base_groupword;
            _tmpGroupid_base_groupword = _cursor.getInt(_cursorIndexOfGroupidBaseGroupword);
            final String _tmpGroupWordEnglish;
            if (_cursor.isNull(_cursorIndexOfGroupWordEnglish)) {
              _tmpGroupWordEnglish = null;
            } else {
              _tmpGroupWordEnglish = _cursor.getString(_cursorIndexOfGroupWordEnglish);
            }
            final String _tmpGroupWordMeans;
            if (_cursor.isNull(_cursorIndexOfGroupWordMeans)) {
              _tmpGroupWordMeans = null;
            } else {
              _tmpGroupWordMeans = _cursor.getString(_cursorIndexOfGroupWordMeans);
            }
            _item = new GroupWord(_tmpWord_id,_tmpGroupid_base_groupword,_tmpGroupWordEnglish,_tmpGroupWordMeans);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public GroupWord findGroupWordbyId(final int word_id) {
    final String _sql = "select * from groupwords WHERE word_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, word_id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWordId = CursorUtil.getColumnIndexOrThrow(_cursor, "word_id");
      final int _cursorIndexOfGroupidBaseGroupword = CursorUtil.getColumnIndexOrThrow(_cursor, "groupid_base_groupword");
      final int _cursorIndexOfGroupWordEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "groupWordEnglish");
      final int _cursorIndexOfGroupWordMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "groupWordMeans");
      final GroupWord _result;
      if(_cursor.moveToFirst()) {
        final int _tmpWord_id;
        _tmpWord_id = _cursor.getInt(_cursorIndexOfWordId);
        final int _tmpGroupid_base_groupword;
        _tmpGroupid_base_groupword = _cursor.getInt(_cursorIndexOfGroupidBaseGroupword);
        final String _tmpGroupWordEnglish;
        if (_cursor.isNull(_cursorIndexOfGroupWordEnglish)) {
          _tmpGroupWordEnglish = null;
        } else {
          _tmpGroupWordEnglish = _cursor.getString(_cursorIndexOfGroupWordEnglish);
        }
        final String _tmpGroupWordMeans;
        if (_cursor.isNull(_cursorIndexOfGroupWordMeans)) {
          _tmpGroupWordMeans = null;
        } else {
          _tmpGroupWordMeans = _cursor.getString(_cursorIndexOfGroupWordMeans);
        }
        _result = new GroupWord(_tmpWord_id,_tmpGroupid_base_groupword,_tmpGroupWordEnglish,_tmpGroupWordMeans);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object searchWords(final String searchKeyword, final int groupid,
      final Continuation<? super List<GroupWord>> continuation) {
    final String _sql = "SELECT * FROM groupwords WHERE (groupWordEnglish LIKE '%' || ? || '%' OR groupWordMeans LIKE '%' || ? || '%') AND groupid_base_groupword = ?  ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (searchKeyword == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchKeyword);
    }
    _argIndex = 2;
    if (searchKeyword == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchKeyword);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, groupid);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<GroupWord>>() {
      @Override
      public List<GroupWord> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWordId = CursorUtil.getColumnIndexOrThrow(_cursor, "word_id");
          final int _cursorIndexOfGroupidBaseGroupword = CursorUtil.getColumnIndexOrThrow(_cursor, "groupid_base_groupword");
          final int _cursorIndexOfGroupWordEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "groupWordEnglish");
          final int _cursorIndexOfGroupWordMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "groupWordMeans");
          final List<GroupWord> _result = new ArrayList<GroupWord>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GroupWord _item;
            final int _tmpWord_id;
            _tmpWord_id = _cursor.getInt(_cursorIndexOfWordId);
            final int _tmpGroupid_base_groupword;
            _tmpGroupid_base_groupword = _cursor.getInt(_cursorIndexOfGroupidBaseGroupword);
            final String _tmpGroupWordEnglish;
            if (_cursor.isNull(_cursorIndexOfGroupWordEnglish)) {
              _tmpGroupWordEnglish = null;
            } else {
              _tmpGroupWordEnglish = _cursor.getString(_cursorIndexOfGroupWordEnglish);
            }
            final String _tmpGroupWordMeans;
            if (_cursor.isNull(_cursorIndexOfGroupWordMeans)) {
              _tmpGroupWordMeans = null;
            } else {
              _tmpGroupWordMeans = _cursor.getString(_cursorIndexOfGroupWordMeans);
            }
            _item = new GroupWord(_tmpWord_id,_tmpGroupid_base_groupword,_tmpGroupWordEnglish,_tmpGroupWordMeans);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getGroupWordEnglishList(final int groupid,
      final Continuation<? super List<String>> continuation) {
    final String _sql = "SELECT groupWordEnglish FROM groupwords WHERE groupid_base_groupword = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupid);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getString(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
