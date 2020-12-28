package com.example.poundstoeuro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void currencyConverter(View view){

        Log.i("info", "button was pressed");

        EditText editText = (EditText) findViewById(R.id.enterAmount);

        String amountInLitai = editText.getText().toString();
        double amountInLitaiDouble =Double.parseDouble(amountInLitai);
        double amountInEurosDouble = amountInLitaiDouble / 3.45;

        String amountInEurosString = String.format("%.2f",amountInEurosDouble);

        Log.i("Amount in Euros", amountInEurosString);

        Toast.makeText(this, amountInLitai + "LT litai" + " is €" +amountInEurosString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}