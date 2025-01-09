package com.example.przekazanieintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextSurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextSurname = findViewById(R.id.editTextSurname);
        Button buttonSendData = findViewById(R.id.buttonSendData);


        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String surname = editTextSurname.getText().toString();

                // Tworzenie Intentu i przekazywanie danych
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("surname", surname);


                startActivity(intent);
            }
        });
    }
}
