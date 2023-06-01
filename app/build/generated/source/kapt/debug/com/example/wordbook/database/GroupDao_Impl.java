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
public final class GroupDao_Impl implements GroupDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Group> __insertionAdapterOfGroup;

  private final EntityDeletionOrUpdateAdapter<Group> __deletionAdapterOfGroup;

  public GroupDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGroup = new EntityInsertionAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `groups` (`groupid`,`grouptitle`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        stmt.bindLong(1, value.getGroupid());
        if (value.getGrouptitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getGrouptitle());
        }
      }
    };
    this.__deletionAdapterOfGroup = new EntityDeletionOrUpdateAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `groups` WHERE `groupid` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        stmt.bindLong(1, value.getGroupid());
      }
    };
  }

  @Override
  public Object insertgroup(final Group group, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfGroup.insertAndReturnId(group);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deletegroup(final Group group, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGroup.handle(group);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public List<Group> selectAllGroup() {
    final String _sql = "select * from groups";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfGroupid = CursorUtil.getColumnIndexOrThrow(_cursor, "groupid");
      final int _cursorIndexOfGrouptitle = CursorUtil.getColumnIndexOrThrow(_cursor, "grouptitle");
      final List<Group> _result = new ArrayList<Group>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Group _item;
        final int _tmpGroupid;
        _tmpGroupid = _cursor.getInt(_cursorIndexOfGroupid);
        final String _tmpGrouptitle;
        if (_cursor.isNull(_cursorIndexOfGrouptitle)) {
          _tmpGrouptitle = null;
        } else {
          _tmpGrouptitle = _cursor.getString(_cursorIndexOfGrouptitle);
        }
        _item = new Group(_tmpGroupid,_tmpGrouptitle);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Group>> getAllGroup() {
    final String _sql = "select * from groups";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"groups"}, false, new Callable<List<Group>>() {
      @Override
      public List<Group> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfGroupid = CursorUtil.getColumnIndexOrThrow(_cursor, "groupid");
          final int _cursorIndexOfGrouptitle = CursorUtil.getColumnIndexOrThrow(_cursor, "grouptitle");
          final List<Group> _result = new ArrayList<Group>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Group _item;
            final int _tmpGroupid;
            _tmpGroupid = _cursor.getInt(_cursorIndexOfGroupid);
            final String _tmpGrouptitle;
            if (_cursor.isNull(_cursorIndexOfGrouptitle)) {
              _tmpGrouptitle = null;
            } else {
              _tmpGrouptitle = _cursor.getString(_cursorIndexOfGrouptitle);
            }
            _item = new Group(_tmpGroupid,_tmpGrouptitle);
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
  public Object findById(final int id, final Continuation<? super Group> continuation) {
    final String _sql = "select * from groups WHERE groupid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Group>() {
      @Override
      public Group call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfGroupid = CursorUtil.getColumnIndexOrThrow(_cursor, "groupid");
          final int _cursorIndexOfGrouptitle = CursorUtil.getColumnIndexOrThrow(_cursor, "grouptitle");
          final Group _result;
          if(_cursor.moveToFirst()) {
            final int _tmpGroupid;
            _tmpGroupid = _cursor.getInt(_cursorIndexOfGroupid);
            final String _tmpGrouptitle;
            if (_cursor.isNull(_cursorIndexOfGrouptitle)) {
              _tmpGrouptitle = null;
            } else {
              _tmpGrouptitle = _cursor.getString(_cursorIndexOfGrouptitle);
            }
            _result = new Group(_tmpGroupid,_tmpGrouptitle);
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
  public Object countGroupNum(final Continuation<? super Integer> continuation) {
    final String _sql = "select count(*) from groups";
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
