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
import java.lang.Integer;
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
public final class WordDao_Impl implements WordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Word> __insertionAdapterOfWord;

  private final EntityDeletionOrUpdateAdapter<Word> __deletionAdapterOfWord;

  private final EntityDeletionOrUpdateAdapter<Word> __updateAdapterOfWord;

  public WordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWord = new EntityInsertionAdapter<Word>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `words` (`id`,`english`,`means`,`timestamp`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Word value) {
        stmt.bindLong(1, value.getId());
        if (value.getEnglish() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEnglish());
        }
        if (value.getMeans() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMeans());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimestamp());
        }
      }
    };
    this.__deletionAdapterOfWord = new EntityDeletionOrUpdateAdapter<Word>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `words` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Word value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfWord = new EntityDeletionOrUpdateAdapter<Word>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `words` SET `id` = ?,`english` = ?,`means` = ?,`timestamp` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Word value) {
        stmt.bindLong(1, value.getId());
        if (value.getEnglish() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getEnglish());
        }
        if (value.getMeans() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMeans());
        }
        if (value.getTimestamp() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTimestamp());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Word word, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfWord.insertAndReturnId(word);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAll(final List<Word> words, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWord.insert(words);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Word word, final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__deletionAdapterOfWord.handle(word);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Word word, final Continuation<? super Integer> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total +=__updateAdapterOfWord.handle(word);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<Word>> selectAllWithLiveData() {
    final String _sql = "select * from words";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"words"}, false, new Callable<List<Word>>() {
      @Override
      public List<Word> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "english");
          final int _cursorIndexOfMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "means");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<Word> _result = new ArrayList<Word>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Word _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpEnglish;
            if (_cursor.isNull(_cursorIndexOfEnglish)) {
              _tmpEnglish = null;
            } else {
              _tmpEnglish = _cursor.getString(_cursorIndexOfEnglish);
            }
            final String _tmpMeans;
            if (_cursor.isNull(_cursorIndexOfMeans)) {
              _tmpMeans = null;
            } else {
              _tmpMeans = _cursor.getString(_cursorIndexOfMeans);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _item = new Word(_tmpId,_tmpEnglish,_tmpMeans,_tmpTimestamp);
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
  public Object selectAll(final Continuation<? super List<Word>> continuation) {
    final String _sql = "select * from words";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Word>>() {
      @Override
      public List<Word> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "english");
          final int _cursorIndexOfMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "means");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<Word> _result = new ArrayList<Word>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Word _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpEnglish;
            if (_cursor.isNull(_cursorIndexOfEnglish)) {
              _tmpEnglish = null;
            } else {
              _tmpEnglish = _cursor.getString(_cursorIndexOfEnglish);
            }
            final String _tmpMeans;
            if (_cursor.isNull(_cursorIndexOfMeans)) {
              _tmpMeans = null;
            } else {
              _tmpMeans = _cursor.getString(_cursorIndexOfMeans);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _item = new Word(_tmpId,_tmpEnglish,_tmpMeans,_tmpTimestamp);
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
  public Object findById(final int id, final Continuation<? super Word> continuation) {
    final String _sql = "select * from words WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Word>() {
      @Override
      public Word call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "english");
          final int _cursorIndexOfMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "means");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final Word _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpEnglish;
            if (_cursor.isNull(_cursorIndexOfEnglish)) {
              _tmpEnglish = null;
            } else {
              _tmpEnglish = _cursor.getString(_cursorIndexOfEnglish);
            }
            final String _tmpMeans;
            if (_cursor.isNull(_cursorIndexOfMeans)) {
              _tmpMeans = null;
            } else {
              _tmpMeans = _cursor.getString(_cursorIndexOfMeans);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _result = new Word(_tmpId,_tmpEnglish,_tmpMeans,_tmpTimestamp);
          } else {
            _result = null;
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
  public Object searchWords(final String searchKeyword,
      final Continuation<? super List<Word>> continuation) {
    final String _sql = "SELECT * FROM words WHERE english LIKE '%' || ? || '%' OR means LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
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
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Word>>() {
      @Override
      public List<Word> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "english");
          final int _cursorIndexOfMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "means");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<Word> _result = new ArrayList<Word>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Word _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpEnglish;
            if (_cursor.isNull(_cursorIndexOfEnglish)) {
              _tmpEnglish = null;
            } else {
              _tmpEnglish = _cursor.getString(_cursorIndexOfEnglish);
            }
            final String _tmpMeans;
            if (_cursor.isNull(_cursorIndexOfMeans)) {
              _tmpMeans = null;
            } else {
              _tmpMeans = _cursor.getString(_cursorIndexOfMeans);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _item = new Word(_tmpId,_tmpEnglish,_tmpMeans,_tmpTimestamp);
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
  public Object getWordByEnglish(final String english,
      final Continuation<? super Word> continuation) {
    final String _sql = "SELECT * FROM words WHERE english = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (english == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, english);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Word>() {
      @Override
      public Word call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEnglish = CursorUtil.getColumnIndexOrThrow(_cursor, "english");
          final int _cursorIndexOfMeans = CursorUtil.getColumnIndexOrThrow(_cursor, "means");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final Word _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpEnglish;
            if (_cursor.isNull(_cursorIndexOfEnglish)) {
              _tmpEnglish = null;
            } else {
              _tmpEnglish = _cursor.getString(_cursorIndexOfEnglish);
            }
            final String _tmpMeans;
            if (_cursor.isNull(_cursorIndexOfMeans)) {
              _tmpMeans = null;
            } else {
              _tmpMeans = _cursor.getString(_cursorIndexOfMeans);
            }
            final String _tmpTimestamp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmpTimestamp = null;
            } else {
              _tmpTimestamp = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _result = new Word(_tmpId,_tmpEnglish,_tmpMeans,_tmpTimestamp);
          } else {
            _result = null;
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
  public Object getCount(final Continuation<? super Integer> continuation) {
    final String _sql = "select count(*) from words";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
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
