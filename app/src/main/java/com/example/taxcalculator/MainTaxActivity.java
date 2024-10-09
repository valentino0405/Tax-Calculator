package com.example.taxcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainTaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alltax);

        // Find the Buttons by their IDs
        Button incomeTaxButton = findViewById(R.id.incomeTaxButton);
        Button propertyTaxButton = findViewById(R.id.propertyTaxButton);
        Button capitalGainsTaxButton = findViewById(R.id.capitalGainsTaxButton);

        // Set click listeners for each button
        incomeTaxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch the MainActivity when Income Tax button is clicked
                Intent intent = new Intent(MainTaxActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        propertyTaxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch PropertyTaxActivity when Property Tax button is clicked
                Intent intent = new Intent(MainTaxActivity.this, PropertyTaxActivity.class);
                startActivity(intent);
            }
        });

        capitalGainsTaxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch CapitalGainsActivity when Capital Gains Tax button is clicked
                Intent intent = new Intent(MainTaxActivity.this, CapitalGainsActivity.class);
                startActivity(intent);
            }
        });
    }
}
