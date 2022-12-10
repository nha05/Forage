package com.example.forage.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.forage.model.Forageable;
import java.lang.Class;
import java.lang.Exception;
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
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ForageableDao_Impl implements ForageableDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Forageable> __insertionAdapterOfForageable;

  private final EntityDeletionOrUpdateAdapter<Forageable> __deletionAdapterOfForageable;

  private final EntityDeletionOrUpdateAdapter<Forageable> __updateAdapterOfForageable;

  public ForageableDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfForageable = new EntityInsertionAdapter<Forageable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `forageable_database` (`id`,`name`,`address`,`in_season`,`notes`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Forageable value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        final int _tmp;
        _tmp = value.getInSeason() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getNotes() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNotes());
        }
      }
    };
    this.__deletionAdapterOfForageable = new EntityDeletionOrUpdateAdapter<Forageable>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `forageable_database` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Forageable value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfForageable = new EntityDeletionOrUpdateAdapter<Forageable>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `forageable_database` SET `id` = ?,`name` = ?,`address` = ?,`in_season` = ?,`notes` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Forageable value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        final int _tmp;
        _tmp = value.getInSeason() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getNotes() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNotes());
        }
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Forageable forageable, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfForageable.insert(forageable);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Forageable forageable, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfForageable.handle(forageable);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Forageable forageable, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfForageable.handle(forageable);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Forageable>> getForageables() {
    final String _sql = "SELECT * FROM forageable_database ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"forageable_database"}, new Callable<List<Forageable>>() {
      @Override
      public List<Forageable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfInSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "in_season");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final List<Forageable> _result = new ArrayList<Forageable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Forageable _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final boolean _tmpInSeason;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfInSeason);
            _tmpInSeason = _tmp != 0;
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            _item = new Forageable(_tmpId,_tmpName,_tmpAddress,_tmpInSeason,_tmpNotes);
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
  public Flow<Forageable> getForageable(final long id) {
    final String _sql = "SELECT * FROM forageable_database WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"forageable_database"}, new Callable<Forageable>() {
      @Override
      public Forageable call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfInSeason = CursorUtil.getColumnIndexOrThrow(_cursor, "in_season");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final Forageable _result;
          if(_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final boolean _tmpInSeason;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfInSeason);
            _tmpInSeason = _tmp != 0;
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            _result = new Forageable(_tmpId,_tmpName,_tmpAddress,_tmpInSeason,_tmpNotes);
          } else {
            _result = null;
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
