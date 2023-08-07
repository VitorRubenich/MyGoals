package dev.rubenichvitor.mygoals.helper;

import android.app.Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import dev.rubenichvitor.mygoals.R;

public class    FragmentHelper {
    private FragmentHelper(){

    }

    public static void callNextFragment(Activity activity, Fragment fragment, int containerToReplace){
        FragmentManager fragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .addToBackStack("TAG")
                .replace(containerToReplace, fragment)
                .commit();
    }

    public static void callNextFragment(Activity activity, Fragment fragment){
        FragmentManager fragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .addToBackStack("TAG")
                .replace(R.id.fragment_container_view_tag, fragment)
                .commit();
    }

}
