package com.wewow.projectwithluis.data.source.local;

import android.provider.BaseColumns;

/**
 * Created by eleroy on 5/10/2017.
 */

public final class MarvelPersistenceContract {

    private MarvelPersistenceContract() {}

    public static abstract class CharacterEntry implements BaseColumns {
        // TODO implement remaining fields
        public static final String TABLE_NAME = "character";
    }
}
