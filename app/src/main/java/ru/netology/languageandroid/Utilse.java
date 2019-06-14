package ru.netology.languageandroid;

import android.app.Activity;
import android.content.Intent;

public class Utilse {
    private static int sTheme;

    public final static int THEME_Small = 0;
    public final static int THEME_Middle = 1;
    public final static int THEME_Big = 2;


    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_Small:
                activity.setTheme(R.style.Margin_first);
                break;
            case THEME_Middle:
                activity.setTheme(R.style.Margin_second);
                break;
            case THEME_Big:
                activity.setTheme(R.style.Margin_third);
                break;
        }
    }
}
