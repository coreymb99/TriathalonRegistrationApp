package com.example.triathalonregistrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //variables

    int costPerPerson = 725;
    int numberOfPeople;
    int totalCost;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText people = (EditText) findViewById(R.id.txtNumberOf);
        final Spinner locations = (Spinner) findViewById(R.id.spnLocations);

        //time to instantiate the button widget to the Button Control

        Button btnCost = (Button) findViewById(R.id.btnCost);
        btnCost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.txtResult));

            @Override
            public void onClick(View v) {
                numberOfPeople = Integer.parseInt(people.getText().toString());
                totalCost = costPerPerson * numberOfPeople;
                DecimalFormat currency = new DecimalFormat("$###,###.00");
                location = locations.getSelectedItem().toString();
                result.setText("Cost for " + location + " is " + currency.format(totalCost));

            }
        });




    } // end of OnCreate
} // end of Main Activity
