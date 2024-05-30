package com.example.it_cubick_mao;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewAssertion;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ProfileUiTest {

    @Test
    public void TestProfileScreenShows() {
        onView(withId(R.id.profileFragment)).perform(click());
        onView(withId(R.id.placeholder)).check(matches(withText("неа, это профиль")));
    }
    @Test
    public void TestScheduleScreenShows(){
        onView(withId(R.id.scheduleFragment)).perform(click());
        onView(withId(R.id.placeholder)).check(matches(withText("ну это шедуль")));
    }

    @Test
    public void TestDictionaryleScreenShows(){
        onView(withId(R.id.dictionaryFragment)).perform(click());
        onView(withId(R.id.placeholder)).check(matches(withText("лох, это диктионари")));
    }
    @Test
    public void TestKrShows(){
        onView(withId(R.id.krFragment)).perform(click());
        onView(withId(R.id.placeholder)).check(matches(withText("это контрольные, мазила")));
    }
}
