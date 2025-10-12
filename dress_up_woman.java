package com.example.dress_up_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class dress_up_woman extends AppCompatActivity {

    private String SelectedOutfit= null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.dress_up_woman);

        Button continue_button = findViewById(R.id.continue_button_dress_up);

        //choice skin COLOR
        ImageButton white_skin_button = findViewById(R.id.body_color_white);
        ImageButton lightskin_button = findViewById(R.id.body_color_lightskin);
        ImageButton brown_skin_button = findViewById(R.id.body_color_brown);
        ImageButton dark_skin_button = findViewById(R.id.body_color_black);


        //COLOR bodies image
        ImageView white_woman_body = findViewById(R.id.white_woman_body);
        ImageView lightskin_woman_body = findViewById(R.id.lightskin_woman_body);
        ImageView brown_woman_body = findViewById(R.id.brown_woman_body);
        ImageView dark_woman_body = findViewById(R.id.dark_woman_body);

        //scroll image outfit
        ImageButton cute_outfit = findViewById(R.id.cute_outfit) ;
        ImageButton chill_outfit = findViewById(R.id.chill_outfit);
        ImageButton bossy_outfit = findViewById(R.id.bossy_outfit) ;
        ImageButton adventurous_outfit = findViewById(R.id.adventurous_outfit);
        ImageButton fun_outfit = findViewById(R.id.fun_outfit) ;
        ImageButton rational_outfit = findViewById(R.id.rational_outfit) ;
        ImageButton charismatic_outfit = findViewById(R.id.charismatic_outfit);

        //zoomed outfit on persona
        ImageView cute_outfit_body = findViewById(R.id.cute_outfit_woman_zoom);
        ImageView chill_outfit_body = findViewById(R.id.chill_outfit_woman_zoom) ;
        ImageView rational_outfit_body = findViewById(R.id.rational_outfit_woman_zoom);
        ImageView bossy_outfit_body = findViewById(R.id.bossy_outfit_woman_zoom);
        ImageView adventurous_outfit_body = findViewById(R.id.adventurous_outfit_woman_zoom);
        ImageView charismatic_outfit_body = findViewById(R.id.charismatic_outfit_woman_zoom) ;
        ImageView fun_outfit_body = findViewById(R.id.fun_outfit_woman_zoom);

        //changing the color of the body

        white_skin_button.setOnClickListener( v->{
            white_woman_body.setVisibility(View.VISIBLE);

            lightskin_woman_body.setVisibility(View.INVISIBLE);
            brown_woman_body.setVisibility(View.INVISIBLE);
            dark_woman_body.setVisibility(View.INVISIBLE);
        });

        lightskin_button.setOnClickListener( v-> {
            lightskin_woman_body.setVisibility(View.VISIBLE);

            white_woman_body.setVisibility(View.INVISIBLE);
            brown_woman_body.setVisibility(View.INVISIBLE);
        });

        brown_skin_button.setOnClickListener( v-> {
            brown_woman_body.setVisibility(View.VISIBLE);

            white_woman_body.setVisibility(View.INVISIBLE);
            lightskin_woman_body.setVisibility(View.INVISIBLE);
            dark_woman_body.setVisibility(View.INVISIBLE);
        });

        dark_skin_button.setOnClickListener( v-> {
            dark_woman_body.setVisibility(View.VISIBLE);

            white_woman_body.setVisibility(View.INVISIBLE);
            lightskin_woman_body.setVisibility(View.INVISIBLE);
            brown_woman_body.setVisibility(View.INVISIBLE);
        });


        //all the event of the outfit image buttons
        //cute body outfit
        cute_outfit.setOnClickListener(v -> {
            SelectedOutfit = "cute" ;
            cute_outfit_body.setVisibility(View.VISIBLE);

            // Hide all other overlays
            chill_outfit_body.setVisibility(View.GONE);
            bossy_outfit_body.setVisibility(View.GONE);
            adventurous_outfit_body.setVisibility(View.GONE);
            fun_outfit_body.setVisibility(View.GONE);
            rational_outfit_body.setVisibility(View.GONE);
            charismatic_outfit_body.setVisibility(View.GONE);
        });


        //charismatic body outfit
        charismatic_outfit.setOnClickListener(v -> {
            charismatic_outfit_body.setVisibility(View.VISIBLE);
            SelectedOutfit = "charismatic" ;

            // Hide all other overlays
            cute_outfit_body.setVisibility(View.GONE);
            chill_outfit_body.setVisibility(View.GONE);
            bossy_outfit_body.setVisibility(View.GONE);
            adventurous_outfit_body.setVisibility(View.GONE);
            fun_outfit_body.setVisibility(View.GONE);
            rational_outfit_body.setVisibility(View.GONE);
        });


        //adventurous outfit body
        adventurous_outfit.setOnClickListener(v -> {
            adventurous_outfit_body.setVisibility(View.VISIBLE);
            SelectedOutfit = "adventurous" ;
            // Hide all other overlays
            charismatic_outfit_body.setVisibility(View.GONE);
            cute_outfit_body.setVisibility(View.GONE);
            chill_outfit_body.setVisibility(View.GONE);
            bossy_outfit_body.setVisibility(View.GONE);
            fun_outfit_body.setVisibility(View.GONE);
            rational_outfit_body.setVisibility(View.GONE);
        });

        //chill body outfit
        chill_outfit.setOnClickListener(v -> {
            chill_outfit_body.setVisibility(View.VISIBLE);
            SelectedOutfit = "chill" ;

            charismatic_outfit_body.setVisibility(View.GONE);
            bossy_outfit_body.setVisibility(View.GONE) ;
            rational_outfit_body.setVisibility(View.GONE) ;
            fun_outfit_body.setVisibility(View.GONE) ;
            cute_outfit_body.setVisibility(View.GONE) ;
            adventurous_outfit_body.setVisibility(View.GONE) ;
        });

        //rational body outfit
        rational_outfit.setOnClickListener(v ->{
            rational_outfit_body.setVisibility(View.VISIBLE);
            SelectedOutfit = "rational" ;

            charismatic_outfit_body.setVisibility(View.GONE);
            bossy_outfit_body.setVisibility(View.GONE) ;
            chill_outfit_body.setVisibility(View.GONE) ;
            fun_outfit_body.setVisibility(View.GONE) ;
            cute_outfit_body.setVisibility(View.GONE) ;
            adventurous_outfit_body.setVisibility(View.GONE) ;
        });


        //fun body outfit
        fun_outfit.setOnClickListener(v ->{
            fun_outfit_body.setVisibility(View.VISIBLE) ;
            SelectedOutfit= "fun" ;

            rational_outfit_body.setVisibility(View.GONE);
            charismatic_outfit_body.setVisibility(View.GONE);
            bossy_outfit_body.setVisibility(View.GONE) ;
            chill_outfit_body.setVisibility(View.GONE) ;
            cute_outfit_body.setVisibility(View.GONE) ;
            adventurous_outfit_body.setVisibility(View.GONE) ;
        });

        // bossy body outfit
        bossy_outfit.setOnClickListener(v ->{
            bossy_outfit_body.setVisibility(View.VISIBLE) ;
            SelectedOutfit = "bossy" ;

            rational_outfit_body.setVisibility(View.GONE);
            charismatic_outfit_body.setVisibility(View.GONE);
            chill_outfit_body.setVisibility(View.GONE) ;
            fun_outfit_body.setVisibility(View.GONE) ;
            cute_outfit_body.setVisibility(View.GONE) ;
            adventurous_outfit_body.setVisibility(View.GONE) ;
        });


        continue_button.setOnClickListener(v ->{
            if ( SelectedOutfit != null ){
                Toast.makeText(this ,"You selected the " + SelectedOutfit, Toast.LENGTH_SHORT).show() ;
                Intent intent = new Intent(dress_up_woman.this, dress_up_man.class);
                startActivity(intent);
            }else {
                Toast.makeText(this,"You need to select an outfit !!! ",Toast.LENGTH_SHORT).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
