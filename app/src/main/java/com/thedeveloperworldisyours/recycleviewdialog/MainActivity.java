package com.thedeveloperworldisyours.recycleviewdialog;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements InteractionListener {


    private final static int MAIN_FRAGMENT = 1;
    private final static int DIALOG_FRAGMENT = 2;
    Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectFragment(MAIN_FRAGMENT);
    }


    public void selectFragment(int fragment) {

        switch (fragment) {
            case MAIN_FRAGMENT:
                mFragment = MainFragment.newInstance();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_content, mFragment)
                        .commit();
                break;

            case DIALOG_FRAGMENT:
                mFragment = MyDialogFragment.newInstance();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_content, mFragment)
                        .addToBackStack(null)
                        .commit();
                break;
        }

    }

    @Override
    public void onFragmentInteraction(int fragment) {
        selectFragment(fragment);
    }
}
