package com.walkerdomain.walker;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;


public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(final Bundle b) {
        super.onCreate(b);
        startService(new Intent(this, SensorListener.class));\
        if(b ==null )
        {
            Fragment newFragment= new Fragment_Overview();
            FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();

            transaction.replace(android.R.id.content,newFragment);
            transaction.commit();
        }
      setContentView(R.layout.activity_main);
    }
};

