package com.wewow.projectwithluis.data.source.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by eleroy on 5/10/2017.
 */

public class MarvelDBHelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "Marvel.db";

    public static final String TEXT_TYPE = "TEXT";
    public static final String BOOLEAN_TYPE = "INTEGER"; // Favorite

    public static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE " +
            MarvelPersistenceContract.CharacterEntry.TABLE_NAME;

    public MarvelDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // not required
    }
}
