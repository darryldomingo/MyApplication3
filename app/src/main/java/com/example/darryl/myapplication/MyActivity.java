package com.example.darryl.myapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;



public class MyActivity extends ActionBarActivity {

    TextView out;
    Button ok;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        out = (TextView) findViewById(R.id.tvOut);
        ok = (Button) findViewById(R.id.btnOk);
        cancel = (Button) findViewById(R.id.btnCancel);

        OnClickListener oclbtnok = new OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText("OK Button was clicked");
            }
        };

        ok.setOnClickListener(oclbtnok);

        OnClickListener oclBtnCancel = new OnClickListener() {
            @Override
            public void onClick(View v) {
                out.setText("Cancel Button was clicked");
            }
        };

        cancel.setOnClickListener(oclBtnCancel);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }

    }


}
