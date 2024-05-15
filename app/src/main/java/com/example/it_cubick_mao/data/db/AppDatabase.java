package com.example.it_cubick_mao.data.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.it_cubick_mao.data.db.TimetableDao;
import com.example.it_cubick_mao.data.db.TimetableEntity;

@Database(entities = {TimetableEntity.class}, version = 1)
abstract public class AppDatabase extends RoomDatabase {
    public abstract TimetableDao getTimetableDao();
}
