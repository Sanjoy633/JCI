


package com.surflex.jci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void marketArrivalData(View view) {
        Intent i = new Intent(getApplicationContext(), MarketArrivalActivity.class);
        startActivity(i);
    }
}
