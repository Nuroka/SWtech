package com.example.wordbook.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GroupListDatabase_Impl extends GroupListDatabase {
  private volatile GroupDao _groupDao;

  private volatile GroupWordDao _groupWordDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `groups` (`groupid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `grouptitle` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `groupwords` (`word_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `groupid_base_groupword` INTEGER NOT NULL, `groupWordEnglish` TEXT NOT NULL, `groupWordMeans` TEXT NOT NULL, FOREIGN KEY(`groupid_base_groupword`) REFERENCES `groups`(`groupid`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dab0006b5eed835905435d55d9f227fc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `groups`");
        _db.execSQL("DROP TABLE IF EXISTS `groupwords`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsGroups = new HashMap<String, TableInfo.Column>(2);
        _columnsGroups.put("groupid", new TableInfo.Column("groupid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroups.put("grouptitle", new TableInfo.Column("grouptitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGroups = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGroups = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGroups = new TableInfo("groups", _columnsGroups, _foreignKeysGroups, _indicesGroups);
        final TableInfo _existingGroups = TableInfo.read(_db, "groups");
        if (! _infoGroups.equals(_existingGroups)) {
          return new RoomOpenHelper.ValidationResult(false, "groups(com.example.wordbook.database.Group).\n"
                  + " Expected:\n" + _infoGroups + "\n"
                  + " Found:\n" + _existingGroups);
        }
        final HashMap<String, TableInfo.Column> _columnsGroupwords = new HashMap<String, TableInfo.Column>(4);
        _columnsGroupwords.put("word_id", new TableInfo.Column("word_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupwords.put("groupid_base_groupword", new TableInfo.Column("groupid_base_groupword", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupwords.put("groupWordEnglish", new TableInfo.Column("groupWordEnglish", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGroupwords.put("groupWordMeans", new TableInfo.Column("groupWordMeans", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGroupwords = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysGroupwords.add(new TableInfo.ForeignKey("groups", "CASCADE", "NO ACTION",Arrays.asList("groupid_base_groupword"), Arrays.asList("groupid")));
        final HashSet<TableInfo.Index> _indicesGroupwords = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGroupwords = new TableInfo("groupwords", _columnsGroupwords, _foreignKeysGroupwords, _indicesGroupwords);
        final TableInfo _existingGroupwords = TableInfo.read(_db, "groupwords");
        if (! _infoGroupwords.equals(_existingGroupwords)) {
          return new RoomOpenHelper.ValidationResult(false, "groupwords(com.example.wordbook.database.GroupWord).\n"
                  + " Expected:\n" + _infoGroupwords + "\n"
                  + " Found:\n" + _existingGroupwords);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "dab0006b5eed835905435d55d9f227fc", "302471d849bc0ad7f40c98a8283be1fd");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "groups","groupwords");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `groups`");
      _db.execSQL("DELETE FROM `groupwords`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(GroupDao.class, GroupDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GroupWordDao.class, GroupWordDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public GroupDao getGroupDao() {
    if (_groupDao != null) {
      return _groupDao;
    } else {
      synchronized(this) {
        if(_groupDao == null) {
          _groupDao = new GroupDao_Impl(this);
        }
        return _groupDao;
      }
    }
  }

  @Override
  public GroupWordDao getGroupwordDao() {
    if (_groupWordDao != null) {
      return _groupWordDao;
    } else {
      synchronized(this) {
        if(_groupWordDao == null) {
          _groupWordDao = new GroupWordDao_Impl(this);
        }
        return _groupWordDao;
      }
    }
  }
}
