package com.example.it_cubick_mao.data.db;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TimetableEntity {
    public TimetableEntity() {}

    public TimetableEntity(int timetableId, String lessonName, String day, String time) {
        TimetableId = timetableId;
        this.lessonName = lessonName;
        this.day = day;
        this.time = time;
    }

    public int getTimetableId() {
        return TimetableId;
    }

    public void setTimetableId(int timetableId) {
        TimetableId = timetableId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @PrimaryKey(autoGenerate = true)
    public int TimetableId = 0;

    @ColumnInfo(name="lessonName")
    public String lessonName;

    @ColumnInfo(name = "day")
    public String day;

    @ColumnInfo(name = "time")
    public String time;
}
