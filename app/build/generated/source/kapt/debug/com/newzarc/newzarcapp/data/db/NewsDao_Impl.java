package com.newzarc.newzarcapp.data.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.newzarc.newzarcapp.data.model.NewsEntity;
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

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsEntity> __insertionAdapterOfNewsEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteNews;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsEntity = new EntityInsertionAdapter<NewsEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `NewsEntity` (`id_news`,`content`,`description`,`image_url`,`link`,`pubDate`,`title`,`video_url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsEntity value) {
        stmt.bindLong(1, value.getId_news());
        if (value.getContent() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContent());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getImage_url() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImage_url());
        }
        if (value.getLink() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getLink());
        }
        if (value.getPubDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPubDate());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
        if (value.getVideo_url() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getVideo_url());
        }
      }
    };
    this.__preparedStmtOfDeleteNews = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM NewsEntity";
        return _query;
      }
    };
  }

  @Override
  public Object saveNews(final List<NewsEntity> news,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsEntity.insert(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteNews(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteNews.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteNews.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllNews(final Continuation<? super List<NewsEntity>> continuation) {
    final String _sql = "SELECT * FROM NewsEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<NewsEntity>>() {
      @Override
      public List<NewsEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdNews = CursorUtil.getColumnIndexOrThrow(_cursor, "id_news");
          final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfLink = CursorUtil.getColumnIndexOrThrow(_cursor, "link");
          final int _cursorIndexOfPubDate = CursorUtil.getColumnIndexOrThrow(_cursor, "pubDate");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfVideoUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "video_url");
          final List<NewsEntity> _result = new ArrayList<NewsEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final NewsEntity _item;
            final int _tmpId_news;
            _tmpId_news = _cursor.getInt(_cursorIndexOfIdNews);
            final String _tmpContent;
            if (_cursor.isNull(_cursorIndexOfContent)) {
              _tmpContent = null;
            } else {
              _tmpContent = _cursor.getString(_cursorIndexOfContent);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpImage_url;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImage_url = null;
            } else {
              _tmpImage_url = _cursor.getString(_cursorIndexOfImageUrl);
            }
            final String _tmpLink;
            if (_cursor.isNull(_cursorIndexOfLink)) {
              _tmpLink = null;
            } else {
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
            }
            final String _tmpPubDate;
            if (_cursor.isNull(_cursorIndexOfPubDate)) {
              _tmpPubDate = null;
            } else {
              _tmpPubDate = _cursor.getString(_cursorIndexOfPubDate);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpVideo_url;
            if (_cursor.isNull(_cursorIndexOfVideoUrl)) {
              _tmpVideo_url = null;
            } else {
              _tmpVideo_url = _cursor.getString(_cursorIndexOfVideoUrl);
            }
            _item = new NewsEntity(_tmpId_news,_tmpContent,_tmpDescription,_tmpImage_url,_tmpLink,_tmpPubDate,_tmpTitle,_tmpVideo_url);
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
