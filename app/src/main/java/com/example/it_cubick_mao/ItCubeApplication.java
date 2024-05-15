package com.example.it_cubick_mao;

import android.app.Application;

import androidx.room.Room;

import com.example.it_cubick_mao.data.db.AppDatabase;

public class ItCubeApplication extends Application {

    private static ItCubeApplication INSTANCE;
    private AppDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        appDatabase = Room.databaseBuilder(this, AppDatabase.class, "app_database.sqlite").allowMainThreadQueries().build();
    }

    public static ItCubeApplication getINSTANCE() {
        return INSTANCE;
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }
}
