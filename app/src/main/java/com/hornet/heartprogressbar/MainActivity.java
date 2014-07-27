package com.hornet.heartprogressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    HeartProgressBar heartProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heartProgressBar = (HeartProgressBar) findViewById(R.id.progressBar);
    }

    public void onClick(View view) {
        if(heartProgressBar.isStopped()) {
            ((Button)view).setText("Stop");
            heartProgressBar.start();
        } else {
            ((Button)view).setText("Start");
            heartProgressBar.dismiss();
        }
    }

}
