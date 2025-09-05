package com.example.anew;



import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private String gender="";
    private Button button1;
    private Button button2;
    private int selectedButton = 0; // 0 = aucun, 1 = bouton1, 2 = bouton2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.ButtonFemale);
        button2 = findViewById(R.id.ButtonMale);

        button1.setOnClickListener(v -> selectButton(1));
        button2.setOnClickListener(v -> selectButton(2));
        Button buttonContinue = findViewById(R.id.ButtonContinue);

        EditText InputName = findViewById(R.id.InputName);




        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = InputName.getText().toString();

                SharedPreferences prefs = getSharedPreferences("userPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("username", username);
                editor.putString("gender", gender);
                editor.apply();
                Log.d("check", "username: " + username);



                if (username.isEmpty() || selectedButton == 0 ) {
                    Toast.makeText(MainActivity.this, "Please fill your name and your gender",Toast.LENGTH_SHORT ).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, Questions.class);
                    intent.putExtra("gender", gender);
                    startActivity(intent);

                }

            }
        });

    }

    private void selectButton(int buttonId) {
        if (buttonId == 1) {
            selectedButton = 1;
            button1.setBackgroundColor(Color.parseColor("#CF3453"));
            button1.setTextColor(Color.WHITE);

            button2.setBackgroundColor(Color.WHITE);
            button2.setTextColor(Color.parseColor("#CF3453"));

            gender ="female";
        } else if (buttonId == 2) {
            selectedButton = 2;
            button2.setBackgroundColor(Color.parseColor("#CF3453"));
            button2.setTextColor(Color.WHITE);

            button1.setBackgroundColor(Color.WHITE);
            button1.setTextColor(Color.parseColor("#CF3453"));
            gender="male";
        }
    }
}
