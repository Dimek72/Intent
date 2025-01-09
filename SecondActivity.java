package com.example.przekazanieintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewDisplayData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewDisplayData = findViewById(R.id.textViewDisplayData);
        Button buttonGoBack = findViewById(R.id.buttonGoBack);

        // Odbieranie danych przekazanych przez Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String surname = intent.getStringExtra("surname");

        // Wyświetlanie danych w TextView
        textViewDisplayData.setText("Imię: " + name + "\nNazwisko: " + surname);

        // Powrót do pierwszej aktywności
        buttonGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Zamyka drugą aktywność i wraca do pierwszej
            }
        });
    }
}
