package com.example.anew;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
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

public class dress_up_man extends AppCompatActivity {

    private int aura = 4;
    private String SelectedOutfit= null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dress_up_man);

        SharedPreferences prefs = getSharedPreferences("userPrefs", MODE_PRIVATE);
        String CatForDressUp = prefs.getString("CatForDressUp", "fun");

        Button continue_button = findViewById(R.id.continue_button_dress_up);

        //background image
        ImageView white_body = findViewById(R.id.white_man_body);
        ImageView lightskin_body = findViewById(R.id.lightskin_man_body);
        ImageView brown_skin_body = findViewById(R.id.brown_man_body);
        ImageView dark_skin_body = findViewById(R.id.dark_man_body);


        //button body color
        ImageButton white_skin_button = findViewById(R.id.body_color_white);
        ImageButton lightskin_button = findViewById(R.id.body_color_lightskin);
        ImageButton brownskin_button = findViewById(R.id.body_color_brown);
        ImageButton darkskin_button = findViewById(R.id.body_color_black);



        //changing the color of the body

        white_skin_button.setOnClickListener( v->{
            white_body.setVisibility(View.VISIBLE);

            lightskin_body.setVisibility(View.INVISIBLE);
            brown_skin_body.setVisibility(View.INVISIBLE);
            dark_skin_body.setVisibility(View.INVISIBLE);
        });

        lightskin_button.setOnClickListener( v-> {
            lightskin_body.setVisibility(View.VISIBLE);

            white_body.setVisibility(View.INVISIBLE);
            brown_skin_body.setVisibility(View.INVISIBLE);
            dark_skin_body.setVisibility(View.INVISIBLE);
        });

        brownskin_button.setOnClickListener( v-> {
            brown_skin_body.setVisibility(View.VISIBLE);

            white_body.setVisibility(View.INVISIBLE);
            lightskin_body.setVisibility(View.INVISIBLE);
            dark_skin_body.setVisibility(View.INVISIBLE);
        });

        darkskin_button.setOnClickListener( v-> {
            dark_skin_body.setVisibility(View.VISIBLE);

            white_body.setVisibility(View.INVISIBLE);
            lightskin_body.setVisibility(View.INVISIBLE);
            brown_skin_body.setVisibility(View.INVISIBLE);
        });



        //scroll image outfit
        ImageButton cute_outfit = findViewById(R.id.cute_outfit) ;
        ImageButton chill_outfit = findViewById(R.id.chill_outfit);
        ImageButton bossy_outfit = findViewById(R.id.bossy_outfit) ;
        ImageButton adventurous_outfit = findViewById(R.id.adventurous_outfit);
        ImageButton fun_outfit = findViewById(R.id.fun_outfit) ;
        ImageButton rational_outfit = findViewById(R.id.rational_outfit) ;
        ImageButton charismatic_outfit = findViewById(R.id.charismatic_outfit);

        //zoomed outfit on persona
        ImageView cute_outfit_body = findViewById(R.id.cute_outfit_man_zoom);
        ImageView chill_outfit_body = findViewById(R.id.chill_outfit_man_zoom) ;
        ImageView rational_outfit_body = findViewById(R.id.rational_outfit_man_zoom);
        ImageView bossy_outfit_body = findViewById(R.id.bossy_outfit_man_zoom);
        ImageView adventurous_outfit_body = findViewById(R.id.adventurous_outfit_man_zoom);
        ImageView charismatic_outfit_body = findViewById(R.id.charismatic_outfit_man_zoom) ;
        ImageView fun_outfit_body = findViewById(R.id.fun_outfit_man_zoom);


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


        continue_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (SelectedOutfit.equals(CatForDressUp)){
                    aura += 1;

                }else{
                    aura-=1;
                }

                SharedPreferences prefs = getSharedPreferences("userPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();

                editor.putInt("aura", aura);



                editor.apply();


                Intent intent = new Intent(dress_up_man.this, Date.class);
                startActivity(intent);
                Log.d("check","aura : " + aura);
            }



        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
