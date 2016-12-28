package com.example.android.subscription;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
