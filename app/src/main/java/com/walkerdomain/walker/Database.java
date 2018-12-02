package com.walkerdomain.walker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class Database {
    public static class DBHelper extends SQLiteOpenHelper{


        public DBHelper(@androidx.annotation.Nullable @Nullable Context context, @androidx.annotation.Nullable @Nullable String name, @androidx.annotation.Nullable @Nullable SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
