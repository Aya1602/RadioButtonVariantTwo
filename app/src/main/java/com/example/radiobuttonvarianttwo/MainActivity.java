package com.example.radiobuttonvarianttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // получаем объект RadioGroup
        RadioGroup radGrp = (RadioGroup)findViewById(R.id.radios);
        // обработка переключения состояния переключателя
        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup arg0, int id) {
                TextView selection = (TextView) findViewById(R.id.selection);
                switch(id) {
                    case R.id.java:
                        selection.setText("Выбрана Java");
                        break;
                    case R.id.kotlin:
                        selection.setText("Выбран Kotlin");
                        break;
                    default:
                        break;
                }
            }});
    }
}