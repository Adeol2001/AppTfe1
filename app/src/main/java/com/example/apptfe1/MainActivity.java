package com.example.apptfe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Déclaration

    private EditText editName,editFirstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editFirstName = findViewById(R.id.editFirstName);
    }

    // Action a faire 
    public void btnEnter(View view) {
    }
}