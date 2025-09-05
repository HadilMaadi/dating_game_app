package com.example.anew;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.anew.Person;
import com.example.anew.DataBaseID;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class Matches extends AppCompatActivity {

    private int lastClickedButton = 0;
    private String CatForDressUp = "";
    private String CatForText = "";
    private String GenreForText = "";
    private String NameForText = "";


    private String person1Cat = "";
    private String person2Cat = "";
    private String person3Cat = "";

    private String person1Category = "";
    private String person2Category = "";
    private String person3Category = "";

    private String person1Name = "";
    private String person2Name = "";
    private String person3Name = "";

    private String person1Genre = "";
    private String person2Genre = "";
    private String person3Genre = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_matches);

        Intent intent = getIntent();
        String gender = intent.getStringExtra("gender");
        Log.d("final","gender" + gender);
        String genderAttractedTo = intent.getStringExtra("genderAttractedTo");
        Log.d("final","genderA" + genderAttractedTo);
        String MBTI1 = intent.getStringExtra("MBTI1");
        Log.d("final","MBT1" + MBTI1);
        String MBTI2 = intent.getStringExtra("MBTI2");
        Log.d("final","MBT2" + MBTI2);
        String MBTI3 = intent.getStringExtra("MBTI3");
        Log.d("final","MBT3" + MBTI3);

        ArrayList<Integer> score = intent.getIntegerArrayListExtra("score");

        String categoryAttractedTo = intent.getStringExtra("categoryAttractedTo");
        Log.d("final","categoryAttractedTo" + categoryAttractedTo);


        DataBaseID dbHelper = new DataBaseID(this);
        List<Person> allpeople = dbHelper.getAllPeople();

        List<Person> possibleMatches = new ArrayList<>();

        List<Person> possibleMatchesRound2 = new ArrayList<>();
        List<Person> possibleMatchesFinalRound = new ArrayList<>();


        Log.d("check", "Everyone =" + allpeople.toString());


        for (Person p : allpeople) {
            if ("female".equals(gender)) {
                if ("female".equals(genderAttractedTo)) {
                    if (("female".equals(p.genderAttractedTo) || "both".equals(p.genderAttractedTo)) &&
                            "female".equals(p.gender)) {
                        possibleMatches.add(p); //gender F and attracted to F
                        Log.d("check", "check" + possibleMatches.toString());
                    }
                } else if ("male".equals(genderAttractedTo)) {
                    if (("female".equals(p.genderAttractedTo) || "both".equals(p.genderAttractedTo)) &&
                            "male".equals(p.gender)) {
                        possibleMatches.add(p); //gender F and attracted to M
                        Log.d("check", "check" + possibleMatches.toString());
                    }
                } else if ("both".equals(genderAttractedTo)) {
                    if (("female".equals(p.genderAttractedTo) || "both".equals(p.genderAttractedTo)) &&
                            ("male".equals(p.gender) ||  "female".equals(p.gender)) ) {
                        possibleMatches.add(p); //gender F and attracted to M and F
                        Log.d("check", "check" + possibleMatches.toString());
                    }
                }
            } else if ("male".equals(gender)) {
                if ("female".equals(genderAttractedTo)) {
                    if (("male".equals(p.genderAttractedTo) || "both".equals(p.genderAttractedTo)) &&
                            "female".equals(p.gender)) {
                        possibleMatches.add(p); //gender M and attracted to F
                        Log.d("check", "check" + possibleMatches.toString());
                    }
                } else if ("male".equals(genderAttractedTo)) {
                    if (("male".equals(p.genderAttractedTo) || "both".equals(p.genderAttractedTo)) &&
                            "male".equals(p.gender)) {
                        possibleMatches.add(p); //gender M and attracted to M
                        Log.d("check", "check" + possibleMatches.toString());
                    }
                } else if ("both".equals(genderAttractedTo)) {
                    if (("male".equals(p.genderAttractedTo) || "both".equals(p.genderAttractedTo)) &&
                            ("male".equals(p.gender) ||  "female".equals(p.gender)) ) {
                        possibleMatches.add(p); //gender M and attracted to M and F
                        Log.d("check", "check" + possibleMatches.toString());
                    }
                }
            }
        }


        List<String> categories = Arrays.asList("cute", "bossy", "rational", "fun", "charismatic", "adventurous", "chill");

        // Créer une map pour associer les indices à des catégories
        Map<Integer, String> indexToCategory = new HashMap<>();
        for (int i = 0; i < categories.size(); i++) {
            indexToCategory.put(i, categories.get(i)); // associer l'index à la catégorie
        }

        // Trouver le score maximum
        int maxScore = Collections.max(score);

        // Trouver l'index du score maximum
        int maxIndex = score.indexOf(maxScore);

        // Trouver la catégorie associée à cet index
        String category = indexToCategory.get(maxIndex);
        Log.d("check", "categorieFinal" + category);

        //à quel index est le max pour qu'on sache ça corespond à quel catégorie

        for (Person c : possibleMatches) {
            if (category.equals(c.categoryToDate) || categoryAttractedTo.equals(c.category)){
                possibleMatchesRound2.add(c);
                Log.d("check", "Our match  : " + possibleMatchesRound2.toString());
            }
        }

        //rajouter des points extra à score MBTI pour les gens qui ont leur catsouhaiéA = catB ET catsouhaitéB = catA ?



        List<ScoredPerson> scoredMatches = new ArrayList<>();

        for (Person d : possibleMatchesRound2) {
            int scoreMBTI;
            if (MBTI1.equals(d.mbti)) {
                scoreMBTI = 50;
            } else if (MBTI2.equals(d.mbti)) {
                scoreMBTI = 41;
            } else if (MBTI3.equals(d.mbti)) {
                scoreMBTI = 32;
            } else {
                scoreMBTI = 22;
            }

            scoredMatches.add(new ScoredPerson(d, scoreMBTI));
            Log.d("check", "Our nearly final match  : " + scoredMatches.toString());
        }
        Collections.sort(scoredMatches, (a, b) -> Integer.compare(b.scoreMBTI, a.scoreMBTI));
        List<ScoredPerson> top3Matches = scoredMatches.subList(0, Math.min(3, scoredMatches.size()));
        Log.d("check", "Our nearly final match  : " + scoredMatches.toString());
        Log.d("check", "Top 3 match  : " + top3Matches.toString());

        //Recup les id dans le xml
        TextView name_person1 = findViewById(R.id.name_person1);
        TextView compatibility_person1 = findViewById(R.id.pourcentage_person1);
        TextView quote_person1 = findViewById(R.id.quote_person1);

        TextView name_person2 = findViewById(R.id.name_person2);
        TextView compatibility_person2 = findViewById(R.id.pourcentage_person2);
        TextView quote_person2 = findViewById(R.id.quote_person2);

        TextView name_person3 = findViewById(R.id.name_person3);
        TextView compatibility_person3 = findViewById(R.id.pourcentage_person3);
        TextView quote_person3 = findViewById(R.id.quote_person3);

        //Recup les id des photo dans me xlm
        ImageButton person1Button = findViewById(R.id.person1);
        ImageButton person2Button = findViewById(R.id.person2);
        ImageButton person3Button = findViewById(R.id.person3);




        if (top3Matches.size() > 0) {
            ScoredPerson p1 = top3Matches.get(0);
            name_person1.setText(p1.person.name);
            int compatibility =  p1.scoreMBTI + maxScore;
            compatibility_person1.setText("Compatibility: " + compatibility + "%");
            quote_person1.setText("\"" + p1.person.quote + "\"");

            //Put the photo of people in the placeholder
            int resId1 = getResources().getIdentifier(top3Matches.get(0).person.photo, "drawable", getPackageName());
            person1Button.setImageResource(resId1);
        }

        if (top3Matches.size() > 1) {
            ScoredPerson p2 = top3Matches.get(1);
            name_person2.setText(p2.person.name);
            int compatibility =  p2.scoreMBTI + maxScore;
            compatibility_person2.setText("Compatibility: " + compatibility + "%");
            quote_person2.setText("\"" + p2.person.quote + "\"");

            //Put the photo of people in the placeholder
            int resId2 = getResources().getIdentifier(top3Matches.get(1).person.photo, "drawable", getPackageName());
            person1Button.setImageResource(resId2);
        }

        if (top3Matches.size() > 2) {
            ScoredPerson p3 = top3Matches.get(2);
            name_person3.setText(p3.person.name);
            int compatibility =  p3.scoreMBTI + maxScore;
            compatibility_person3.setText("Compatibility: " + compatibility + "%");
            quote_person3.setText("\"" + p3.person.quote + "\"");

            //Put the photo of people in the placeholder
            int resId3 = getResources().getIdentifier(top3Matches.get(2).person.photo, "drawable", getPackageName());
            person1Button.setImageResource(resId3);
        }

        // Récupérer les images, les noms, les compatibilités et les citations de chaque personne
        for (int i = 0; i < top3Matches.size(); i++) {
            // Récupère la personne actuelle dans la liste
            ScoredPerson scoredPerson = top3Matches.get(i);

            // Récupère le nom de l'image depuis la base de données pour chaque personne
            String imageName = scoredPerson.person.photo; // Exemple : "person1"

            // Calcul de la compatibilité
            int compatibility = scoredPerson.scoreMBTI + maxScore;

            // Récupérer l'ID de la ressource drawable correspondante
            int imageResId = getResources().getIdentifier(imageName, "drawable", getPackageName());

            // Selon l'indice (i), mettre à jour l'image et les informations correspondantes
            switch (i) {
                case 0:
                    // Mise à jour pour la première personne
                    person1Button.setImageResource(imageResId);

                    //recuperer la catégorie de la personne
                    person1Button.setTag(scoredPerson.person.categoryToDate);
                    person1Cat = (String) person1Button.getTag();
                    Log.d("check", "catégorie qu'elle aime de la personne cliquée" + person1Cat);

                    person1Button.setTag(scoredPerson.person.name);
                    person1Name = (String) person1Button.getTag();
                    Log.d("check", "nom de la personne cliquée" + person1Name);

                    person1Button.setTag(scoredPerson.person.category);
                    person1Category = (String) person1Button.getTag();
                    Log.d("check", "catégory de la personne cliquée" + person1Category);

                    person1Button.setTag(scoredPerson.person.gender);
                    person1Genre = (String) person1Button.getTag();
                    Log.d("check", "genre de la personne cliquée" + person1Genre);


                    name_person1.setText(scoredPerson.person.name);
                    compatibility_person1.setText("Compatibility: " + compatibility + "%");
                    quote_person1.setText(scoredPerson.person.quote);
                    break;
                case 1:
                    // Mise à jour pour la deuxième personne
                    person2Button.setImageResource(imageResId);
                    name_person2.setText(scoredPerson.person.name);

                    person2Button.setTag(scoredPerson.person.categoryToDate);
                    person2Cat = (String) person2Button.getTag();
                    Log.d("check", "catégorie qu'elle aime de la personne cliquée" + person2Cat);

                    person2Button.setTag(scoredPerson.person.name);
                    person2Name = (String) person2Button.getTag();
                    Log.d("check", "nom de la personne cliquée" + person2Name);

                    person2Button.setTag(scoredPerson.person.category);
                    person2Category = (String) person2Button.getTag();
                    Log.d("check", "catégory de la personne cliquée" + person2Category);

                    person2Button.setTag(scoredPerson.person.gender);
                    person2Genre = (String) person2Button.getTag();
                    Log.d("check", "genre de la personne cliquée" + person2Genre);

                    compatibility_person2.setText("Compatibility: " + compatibility + "%");
                    quote_person2.setText(scoredPerson.person.quote);
                    break;
                case 2:
                    // Mise à jour pour la troisième personne
                    person3Button.setImageResource(imageResId);
                    name_person3.setText(scoredPerson.person.name);

                    person3Button.setTag(scoredPerson.person.categoryToDate);
                    person3Cat = (String) person3Button.getTag();
                    Log.d("check", "catégorie qu'elle aime de la personne cliquée" + person3Cat);

                    person3Button.setTag(scoredPerson.person.name);
                    person3Name = (String) person3Button.getTag();
                    Log.d("check", "nom de la personne cliquée" + person3Name);

                    person3Button.setTag(scoredPerson.person.category);
                    person3Category = (String) person3Button.getTag();
                    Log.d("check", "catégory de la personne cliquée" + person3Category);

                    person3Button.setTag(scoredPerson.person.gender);
                    person3Genre = (String) person3Button.getTag();
                    Log.d("check", "genre de la personne cliquée" + person3Genre);

                    compatibility_person3.setText("Compatibility: " + compatibility + "%");
                    quote_person3.setText(scoredPerson.person.quote);
                    break;

            }

        }
        //check quel bouton a été cliqué avec un boolean ?
        Button buttonContinue = findViewById(R.id.button_continue);


        person1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastClickedButton = 1;

                CatForDressUp = person1Cat;
                CatForText = person1Category;
                GenreForText = person1Genre;
                NameForText = person1Name;

                Log.d("check", "Person 1 sélectionné" + CatForDressUp);

                buttonContinue.setText("You chose : " +person1Name);


            }
        });

        person2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastClickedButton = 2;
                CatForDressUp = person2Cat;
                CatForText = person2Category;
                GenreForText = person2Genre;
                NameForText = person2Name;
                Log.d("check", "Person 2 sélectionné" + CatForDressUp);

                buttonContinue.setText("You chose : " +person2Name);
            }
        });

        person3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastClickedButton = 3;
                CatForDressUp = person3Cat;
                CatForText = person3Category;
                GenreForText = person3Genre;
                NameForText = person3Name;
                Log.d("check", "Person 3 sélectionné:  " + CatForDressUp);

                buttonContinue.setText("You chose : " +person3Name);
            }
        });

        //on peut ajouter un carré rouge derrière chaque image qui est invisible et quand on clique le carré devient visible comme ça on sait sur qui on a cliqué




        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences prefs = getSharedPreferences("userPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();

                editor.putString("CatForDressUp", CatForDressUp);
                editor.putString("CatForText", CatForText);
                editor.putString("GenreForText", GenreForText);
                editor.putString("NameForText", NameForText);


                editor.apply();

                //passer la catfordressup je suis même pas sur qu'on ait besoin du lastclicked button prcq catfordressup change à chaque fois qu'on clique sur un bouton
                Intent intent = new Intent(Matches.this, Transition.class);
                intent.putExtra("CatForDressUp", CatForDressUp);
                startActivity(intent);
            }
        });







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //on ajoute le scoreMBTI
    public class ScoredPerson {
        public Person person;
        public int scoreMBTI;

        public ScoredPerson(Person person, int scoreMBTI) {
            this.person = person;
            this.scoreMBTI = scoreMBTI;
        }

        @Override
        public String toString() {
            return "ScoredPerson{" +
                    "id=" + person.id +
                    "quote" + person.quote +
                    "name=" + person.name +
                    ", mbti=" + person.mbti +
                    ", scoreMBTI=" + scoreMBTI +
                    '}';
        }
    }

}
