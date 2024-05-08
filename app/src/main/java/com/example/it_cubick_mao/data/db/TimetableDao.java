package com.example.it_cubick_mao.data.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TimetableDao {

    @Insert
    void insertNewTimetableItems(TimetableEntity... entities);

    @Delete
    void deleteNewTimetableItems(TimetableEntity... entities);
    @Update
    void updateNewTimetableItems(TimetableEntity... entities);

    @Query("SELECT * FROM timetableentity")
    LiveData<List<TimetableEntity>> getAllTimetable();
}
