package com.laioffer.tinnews.database;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RoomDatabase;

import com.facebook.stetho.inspector.database.SQLiteDatabaseCompat;
import com.laioffer.tinnews.model.Article;

import java.util.List;

@Dao
public interface ArticleDao {

    @Insert
    void saveArticle(Article news);

    @Query("SELECT * FROM article")
    LiveData<List<Article>> getAllArticles();

    @Delete
    void deleteArticle(Article... article);
}


