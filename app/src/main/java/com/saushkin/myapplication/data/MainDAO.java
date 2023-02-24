package com.saushkin.myapplication.data;


import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.saushkin.myapplication.data.Models.Notes;

import java.util.List;

@Dao
public interface MainDAO {


    //метод вставления данных в таблицу
    @Insert(onConflict = REPLACE)
    void insert(Notes notes);

    // метод для получения данных из таблицы (с SQL-запросом)

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Notes> getAll();


    // метод для обновления данных в таблице при изменении
    @Query("UPDATE notes SET title = :title, notes = :notes WHERE ID = :id")
    void update(int id, String title, String notes);


    // удаление заметки
    @Delete
    void delete(Notes notes);

    // закрепление заметки
    @Query("UPDATE notes SET pinned = :pin WHERE ID = :id")
    void pin(int id, boolean pin);

}
