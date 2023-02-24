package com.saushkin.myapplication.data;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.saushkin.myapplication.data.Models.Notes;

//База данных для хранения заметок

@Database(entities = Notes.class, version = 1, exportSchema = false)
public abstract class RoomDB extends RoomDatabase {


    private static RoomDB database;
    private static String DATABASE_NAME = "NoteApp";

    public synchronized static RoomDB getInstance(Context context) {
        if (database == null){
            database = Room.databaseBuilder(context.getApplicationContext(),
            RoomDB.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return database;
    }

public abstract MainDAO mainDao();
}
