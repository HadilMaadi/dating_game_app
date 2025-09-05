package com.example.anew;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Transition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transition);

        Intent intent = getIntent();
        String CatForDressUp = intent.getStringExtra("CatForDressUp");
        Log.d("check", "CatForDressUp : "+CatForDressUp);

        SharedPreferences prefs = getSharedPreferences("userPrefs", MODE_PRIVATE);
        String gender = prefs.getString("gender", "male");

        Button buttonGoDress = findViewById(R.id.buttonGoDress);

        buttonGoDress.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if ("female".equals(gender)){
                    Intent intent = new Intent(Transition.this, dress_up_woman.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(Transition.this, dress_up_man.class);
                    startActivity(intent);
                }
            }


        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
