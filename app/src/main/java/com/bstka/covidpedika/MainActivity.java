package com.bstka.covidpedika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
        * ! NOTE: Assign Button to Local Variable
        * ? Declaring local scope variable
        * */
        Button infoButton = (Button) findViewById(R.id.InfoButton);
        Button lifeStyleButton = (Button) findViewById(R.id.LifeStyleButton);
        Button ppkmButton = (Button) findViewById(R.id.PpkmButton);
        Button symptomsButton = (Button) findViewById(R.id.SymptomsButton);

        /**
        * ! NOTE: Adding click listener to every button
        * ? Every Button had behavior to starting new Activity or changing page
        * */

        infoButton.setOnClickListener(this.InfoButtonClickHandler);
        lifeStyleButton.setOnClickListener(this.LifeStyleButtonClickHandler);
        ppkmButton.setOnClickListener(this.PpkmButtonClickHandler);
        symptomsButton.setOnClickListener(this.SymtomsButtonClickHandler);
    };

    /**
     * ! NOTE: Information Button Handler
    * */
    private final OnClickListener InfoButtonClickHandler = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("MAIN BUTTON", "onClick: Info CLicked");
            Intent InfoActivities = new Intent(getApplicationContext(), InformationActivity.class);
            startActivity(InfoActivities);
        }
    };

    /**
     * ! NOTE: Lifestyle Button Handler
    * */
    private final OnClickListener LifeStyleButtonClickHandler = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("MAIN BUTTON", "onClick: LifeStyle CLicked");
            Intent LifeStyleActivities = new Intent(getApplicationContext(), LifeStyleActivity.class);
            startActivity(LifeStyleActivities);
        }
    };

    /**
     * ! NOTE: PPKM Button Handler
     * */
    private final OnClickListener PpkmButtonClickHandler = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("MAIN BUTTON", "onClick: Ppkm CLicked");
            Intent PpkmActivities = new Intent(getApplicationContext(), PpkmActivity.class);
            startActivity(PpkmActivities);
        }
    };

    /**
     * ! NOTE: Symtoms Button Handler
     * */
    private final OnClickListener SymtomsButtonClickHandler = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("MAIN BUTTON", "onClick: Symtoms CLicked");
            Intent SymtomsActivities = new Intent(getApplicationContext(), SymtomActivity.class);
            startActivity(SymtomsActivities);
        }
    };
}