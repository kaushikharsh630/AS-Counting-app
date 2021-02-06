package com.example.simplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){
        int number_of_orders = 7;
        display(number_of_orders);
    }
     int quantity=0;
    public void increment(View view){
        //int quantity=0;
        quantity++;
        display(quantity);
    }
    public void decrement(View view){
        //int quantity = 0;
        quantity--;
        display(quantity);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}