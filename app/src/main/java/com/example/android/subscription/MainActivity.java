package com.example.android.subscription;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.category, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);


    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_textView);
        quantityTextView.setText("" + number);

    }


    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if (quantity > 1)
            quantity = quantity - 1;
        display(quantity);
    }
}
