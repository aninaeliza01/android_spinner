package com.example.android_spinner.;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner sp;
    TextView tv;
    String []days={"1","2","3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        sp = findViewById(R.id.spinners);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_dropdown_item_1line, days);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView temp = (TextView) view;
        tv.setText("You clicked " + temp.getText().toString() + " at position " + position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        tv.setText("Choose anything");

    }
}
