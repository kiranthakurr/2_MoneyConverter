package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    public static final DecimalFormat df = new DecimalFormat("0.00");
    public void find(View view){
        EditText  dollar =(EditText) findViewById(R.id.dollar);
        String dollars = dollar.getText().toString();
        Double dodouble= Double.parseDouble(dollars);
        Double inr = 70.71* dodouble;

        String toastText = "= "+df.format(inr).toString()+" Rs";
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}