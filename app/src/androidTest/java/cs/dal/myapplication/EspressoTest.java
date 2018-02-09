package cs.dal.myapplication;

/**
 * Created by denghaohai on 08/02/2018.
 */
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.After;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)

public class EspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void changeText_Activity1() {
        onView(withId(R.id.editText)).perform(typeText("password"), closeSoftKeyboard());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Not strong enough")));
    }
    @Test
    public void changeText_Activity2() {
        onView(withId(R.id.editText)).perform(typeText("jkj"), closeSoftKeyboard());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Not strong enough")));
    }
    @Test
    public void changeText_Activity3() {
        onView(withId(R.id.editText)).perform(typeText("bhjefvjhFBfjbjkAF%"), closeSoftKeyboard());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Strong password")));
    }
    @Test
    public void changeText_Activity4() {
        onView(withId(R.id.editText)).perform(typeText("sfafafhgvfghasvfhjasHVJK"), closeSoftKeyboard());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Not strong enough")));
    }
    @Test
    public void changeText_Activity5() {
        onView(withId(R.id.editText)).perform(typeText("abjghasgbsakjd"), closeSoftKeyboard());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Not strong enough")));
    }
}
