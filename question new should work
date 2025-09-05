package com.example.anew;




import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Questions extends AppCompatActivity {

    //category of each buttons --> List
    List<Button> attractionButtons = new ArrayList<>() ;
    List<Button> seasonButtons = new ArrayList<>() ;
    List <Button> animalButtons = new ArrayList<>() ;
    List <Button> typeButtons = new ArrayList<>() ;

    private String selectedMBTI = "";
    private String selectedZodiac = "";

    private int selectedSeasonId = -1;
    private int selectedAnimalId = -1;
    private int selectedAttractionId = -1;
    private int selectedTypeId = -1;

    private String Attraction="";
    private String Ideal="";

    private String MBTI1 = "";
    private String MBTI2 = "";
    private String MBTI3 = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_questions);

        //Get the gender
        Intent intent = getIntent();
        String gender = intent.getStringExtra("gender");
        Log.d("check", "gender : "+gender);

        //all the spinners
        Spinner zodiacspinner = findViewById(R.id.zodiac_spinner);

        Spinner mbtispinner = findViewById(R.id.mbti_spinner);

        //list of all MBTI

        String[] mbti = {
                "INTJ", "INTP", "ENTJ", "ENTP", "INFJ", "INFP", "ENFJ", "ENFP",
                "ISTJ", "ISFJ", "ESTJ", "ESFJ",
                "ISTP", "ISFP", "ESTP", "ESFP"};


        //list of all zodiac signs
        String[] zodiacSigns = {
                "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo",
                "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"
        };

        //create a bridge between the data and the spinner (so it can be display as a dropdown spinner/menu)
        //mbti using spinner
        ArrayAdapter<String> mbti_adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                mbti
        );
        mbtispinner.setAdapter(mbti_adapter);
        //zodiac sign using spinner

        ArrayAdapter<String> zodiac_adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                zodiacSigns
        );

        zodiacspinner.setAdapter(zodiac_adapter);


        //why does the adapter view not working ????
        //get the item selected in the MBTI spinner
        mbtispinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedMBTI = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Optional: do nothing or handle the case when nothing is selected
            }
        });

        //get the item selected in the Zodiac spinner
        zodiacspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedZodiac = parent.getItemAtPosition(position).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Optional: do nothing or handle the case when nothing is selected
            }

        });


        //calling all the buttons

        //gender attracted toward buttons
        Button women_attraction = findViewById(R.id.women_attraction_button);
        Button men_attraction = findViewById(R.id.men_attraction_button);
        Button bisexual = findViewById(R.id.bisexual_button);

        // favorite season buttons
        Button winter = findViewById(R.id.winter_button);
        Button summer = findViewById(R.id.summer_button);
        Button spring = findViewById(R.id.spring_button);
        Button autumn = findViewById(R.id.autumn_button);

        // favorite animal buttons
        Button cat = findViewById(R.id.cat_button);
        Button dog = findViewById(R.id.dog_button);
        Button horse = findViewById(R.id.horse_button);
        Button bird = findViewById(R.id.bird_button);
        Button i_am_animal = findViewById(R.id.own_animal_button);


        // your type button
        Button cute_type = findViewById(R.id.cute_type_button);
        Button bossy_type = findViewById(R.id.bossy_type_button);
        Button rational_type = findViewById(R.id.rational_type_button);
        Button fun_type = findViewById(R.id.fun_type_button);
        Button charismatic_type = findViewById(R.id.charismatic_type_button);
        Button adventurous_type = findViewById(R.id.adventurous_type_button);
        Button chill_type = findViewById(R.id.chill_type_button);

        // submit button
        Button submit_taste = findViewById(R.id.submit_perso_taste) ;

        //adding each button to each button category list

        //gender attraction button list
        attractionButtons.add(women_attraction) ;
        attractionButtons.add(men_attraction) ;
        attractionButtons.add(bisexual);

        //season button list
        seasonButtons.add(winter);
        seasonButtons.add(spring);
        seasonButtons.add(autumn) ;
        seasonButtons.add(summer);

        //animal button list
        animalButtons.add(cat);
        animalButtons.add(dog);
        animalButtons.add(horse);
        animalButtons.add(bird);
        animalButtons.add(i_am_animal);

        //my type button list
        typeButtons.add(cute_type);
        typeButtons.add(charismatic_type);
        typeButtons.add(chill_type) ;
        typeButtons.add(rational_type) ;
        typeButtons.add(fun_type);
        typeButtons.add(adventurous_type);
        typeButtons.add(bossy_type);

        //setting radio group + radio buttons for handle group decision
        RadioGroup handleDecision = findViewById(R.id.handle_decision);

        RadioButton with_the_flow = findViewById(R.id.with_the_flow);
        RadioButton take_lead = findViewById(R.id.take_lead);
        RadioButton charm_everyone = findViewById(R.id.charm_everyone);
        RadioButton energy_up = findViewById(R.id.energy_up);
        RadioButton follow_others = findViewById(R.id.follow_others);
        RadioButton logical_option = findViewById(R.id.logical_option);
        RadioButton something_new = findViewById(R.id.something_new);


        //setting radio group + radio buttons for weekend plan
        RadioGroup weekendPlan = findViewById(R.id.week_plan);

        RadioButton baking = findViewById(R.id.baking);
        RadioButton organizing_trip = findViewById(R.id.organizing_trip);
        RadioButton game_night = findViewById(R.id.game_night);
        RadioButton road_trip = findViewById(R.id.road_trip);
        RadioButton reading_book = findViewById(R.id.reading_book);
        RadioButton performing = findViewById(R.id.performing);
        RadioButton chilling_home = findViewById(R.id.chilling_home);


        //setting radio group + radio buttons for go to drink
        RadioGroup go_to_drink = findViewById(R.id.go_to_drink);

        RadioButton double_espresso = findViewById(R.id.doubles_epresso);
        RadioButton plain_black = findViewById(R.id.plain_black_coffee);
        RadioButton chocolate = findViewById(R.id.hot_chocolate);
        RadioButton caramel_macchiato = findViewById(R.id.caramel_macchiato);
        RadioButton seasonal_special = findViewById(R.id.seasonal_special);
        RadioButton green_tea = findViewById(R.id.green_tea);
        RadioButton iced_drink = findViewById(R.id.iced_drink);


        //setting radio group + radio buttons for asking a favor
        RadioGroup askFavor = findViewById(R.id.ask_favor);

        RadioButton puppy_eyes = findViewById(R.id.puppy_eyes);
        RadioButton win_win = findViewById(R.id.win_win_situation);
        RadioButton no_pressure = findViewById(R.id.no_pressure);
        RadioButton charm_your_way = findViewById(R.id.charm_your_way);
        RadioButton wild_quest = findViewById(R.id.wild_quest);


        // setting button listeners for all button groups --> method declared outside Oncreate ()

        setButtonGroupListener(attractionButtons);
        setButtonGroupListener(seasonButtons);
        setButtonGroupListener(animalButtons);
        setButtonGroupListener(typeButtons);

        ArrayList<Integer> score = new ArrayList<>(7);
        for (int i = 0; i < 7; i++) {
            score.add(0);
        }






        submit_taste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedSeasonId == R.id.summer_button) {
                    score.set(1, score.get(1) + 5);
                    score.set(2, score.get(2) + 5);
                    score.set(3, score.get(3) + 5);
                    score.set(5, score.get(5) + 5);
                    score.set(4, score.get(4) + 5);
                    Log.d("check", "Scores: " + score.toString());
                } else if (selectedSeasonId == R.id.winter_button) {
                    score.set(1, score.get(1) + 5);
                    score.set(6, score.get(6) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }
                else if (selectedSeasonId == R.id.autumn_button) {
                    score.set(0, score.get(0) + 5);
                    score.set(6, score.get(6) + 5);
                    score.set(2, score.get(2) + 5);
                    score.set(5, score.get(5) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }
                else if (selectedSeasonId == R.id.spring_button) {
                    score.set(0, score.get(0) + 5);
                    score.set(6, score.get(6) + 5);
                    score.set(4, score.get(4) + 5);
                    score.set(3, score.get(3) + 5);
                    score.set(2, score.get(2) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }
                if(selectedAnimalId == R.id.cat_button){
                    score.set(0, score.get(0) + 5);
                    score.set(6, score.get(6) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }
                else if(selectedAnimalId == R.id.dog_button){
                    score.set(4, score.get(4) + 5);
                    score.set(3, score.get(3) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }
                else if(selectedAnimalId == R.id.horse_button){
                    score.set(5, score.get(5) + 5);
                    score.set(4, score.get(4) + 5);
                    score.set(1, score.get(1) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }
                else if(selectedAnimalId == R.id.bird_button){
                    score.set(3, score.get(3) + 5);
                    score.set(2, score.get(2) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }
                else if(selectedAnimalId == R.id.own_animal_button){
                    score.set(5, score.get(5) + 5);
                    score.set(4, score.get(4) + 3);
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("INTJ")) {
                    score.set(2, score.get(2) + 5);
                    MBTI1="INTP";
                    MBTI2="INTJ";
                    MBTI3="ISTJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("INTP")) {
                    score.set(2, score.get(2) + 5);
                    score.set(4, score.get(4) + 5);
                    MBTI1="ENTP";
                    MBTI2="ENTJ";
                    MBTI3="ESTJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ENTJ")) {
                    score.set(1, score.get(1) + 12);
                    score.set(2, score.get(2) + 5);
                    score.set(5, score.get(5) + 4);
                    score.set(4, score.get(4) + 5);
                    MBTI1="ENTP";
                    MBTI2="ESTJ";
                    MBTI3="ENFJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ENTP")) {
                    score.set(4, score.get(4) + 6);
                    score.set(3, score.get(3) + 5);
                    score.set(5, score.get(5) + 5);
                    MBTI1="ENTP";
                    MBTI2="ENFP";
                    MBTI3="INFP";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("INFJ")) {
                    score.set(2, score.get(2) + 5);
                    score.set(4, score.get(4) + 5);
                    score.set(0, score.get(0) + 6);
                    MBTI1="ENFJ";
                    MBTI2="INFP";
                    MBTI3="INTJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("INFP")) {
                    score.set(6, score.get(6) + 5);
                    score.set(0, score.get(0) + 5);
                    MBTI1="INFJ";
                    MBTI2="ESFJ";
                    MBTI3="ENFJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ENFJ")) {
                    score.set(1, score.get(1) + 5);
                    score.set(4, score.get(4) + 3);
                    score.set(2, score.get(2) + 5);
                    MBTI1="INFJ";
                    MBTI2="INFP";
                    MBTI3="INTJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ENFP")) {
                    score.set(3, score.get(3) + 6);
                    score.set(0, score.get(0) + 3);
                    score.set(5, score.get(5) + 5);
                    score.set(4, score.get(4) + 2);
                    MBTI1="INFJ";
                    MBTI2="ENTP";
                    MBTI3="ENFJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ISTJ")) {
                    score.set(2, score.get(2) + 5);
                    MBTI1="ISFJ";
                    MBTI2="ESTP";
                    MBTI3="ESFP";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ISFJ")) {
                    score.set(6, score.get(6) + 5);
                    score.set(0, score.get(0) + 5);
                    MBTI1="ESTP";
                    MBTI2="ESFJ";
                    MBTI3="ESFP";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ESTJ")) {
                    score.set(1, score.get(1) + 5);
                    score.set(2, score.get(2) + 5);
                    score.set(4, score.get(4) + 5);
                    MBTI1="ESTP";
                    MBTI2="ESFJ";
                    MBTI3="ISTJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ESFJ")) {
                    score.set(0, score.get(0) + 5);
                    score.set(6, score.get(6) + 5);
                    score.set(4, score.get(4) + 5);
                    MBTI1="ESFP";
                    MBTI2="ISFJ";
                    MBTI3="ENFJ";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ISTP")) {
                    score.set(2, score.get(2) + 5);
                    MBTI1="ESTJ";
                    MBTI2="ENTJ";
                    MBTI3="ENTP";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ISFP")) {
                    score.set(0, score.get(0) + 5);
                    score.set(6, score.get(6) + 5);
                    MBTI1="ENFP";
                    MBTI2="INFP";
                    MBTI3="ISFP";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ESTP")) {
                    score.set(1, score.get(1) + 5);
                    score.set(2, score.get(2) + 5);
                    score.set(3, score.get(3) + 5);
                    MBTI1="INTP";
                    MBTI2="ESFP";
                    MBTI3="ENTP";
                    Log.d("check", "Scores: " + score.toString());
                }
                if (selectedMBTI.equals("ESTP")) {
                    score.set(0, score.get(0) + 5);
                    score.set(3, score.get(3) + 5);
                    score.set(4, score.get(4) + 5);
                    score.set(3, score.get(5) + 5);
                    score.set(6, score.get(6) + 5);
                    MBTI1="ESFJ";
                    MBTI2="ENFJ";
                    MBTI3="ENFP";
                    Log.d("check", "Scores: " + score.toString());
                }
                if(selectedZodiac.equals("Aries")){
                    score.set(1, score.get(1) + 5);
                    score.set(5, score.get(5) + 5);
                }
                if(selectedZodiac.equals("Taurus")){
                    score.set(6, score.get(6) + 5);
                }
                if(selectedZodiac.equals("Gemini")){
                    score.set(3, score.get(3) + 5);
                    score.set(4, score.get(4) + 5);
                }
                if(selectedZodiac.equals("Cancer")){
                    score.set(0, score.get(0) + 5);
                    score.set(6, score.get(6) + 5);
                }
                if(selectedZodiac.equals("Leo")){
                    score.set(1, score.get(1) + 5);
                    score.set(4, score.get(4) + 5);
                }
                if(selectedZodiac.equals("Virgo")){
                    score.set(2, score.get(2) + 5);
                }
                if(selectedZodiac.equals("Libra")){
                    score.set(0, score.get(0) + 5);
                }
                if(selectedZodiac.equals("Scorpio")){
                    score.set(2, score.get(2) + 5);
                    score.set(4, score.get(4) + 5);
                }
                if(selectedZodiac.equals("Sagittarius")){
                    score.set(3, score.get(3) + 5);
                    score.set(5, score.get(5) + 5);
                }
                if(selectedZodiac.equals("Capricorn")){
                    score.set(1, score.get(1) + 5);
                }
                if(selectedZodiac.equals("Aquarius")){
                    score.set(2, score.get(2) + 5);
                }
                if(selectedZodiac.equals("Pisces")){
                    score.set(0, score.get(0) + 5);
                    score.set(6, score.get(6) + 5);
                }

                //Mettre à jour les radio buttons
                int selectedIdDecision = handleDecision.getCheckedRadioButtonId();

                if (selectedIdDecision == with_the_flow.getId()) {
                    score.set(6, score.get(6) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDecision == charm_everyone.getId()) {
                    score.set(4, score.get(4) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDecision == energy_up.getId()) {
                    score.set(3, score.get(3) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDecision == follow_others.getId()) {
                    score.set(0, score.get(0) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDecision == logical_option.getId()) {
                    score.set(2, score.get(2) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDecision == something_new.getId()) {
                    score.set(5, score.get(5) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDecision == take_lead.getId()) {
                    score.set(1, score.get(1) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                //Mettre à jour les radio buttons
                int selectedIdWeekend = weekendPlan.getCheckedRadioButtonId();

                if (selectedIdWeekend == baking.getId()) {
                    score.set(0, score.get(0) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdWeekend == organizing_trip.getId()) {
                    score.set(1, score.get(1) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdWeekend == game_night.getId()) {
                    score.set(3, score.get(3) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdWeekend == road_trip.getId()) {
                    score.set(5, score.get(5) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdWeekend == reading_book.getId()) {
                    score.set(2, score.get(2) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdWeekend == performing.getId()) {
                    score.set(4, score.get(4) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdWeekend == chilling_home.getId()) {
                    score.set(6, score.get(6) + 10);
                    Log.d("check", "Scores: " + score.toString());
                }

                //Mettre à jou les radio buttons
                int selectedIdDrink = go_to_drink.getCheckedRadioButtonId();

                if (selectedIdDrink == double_espresso.getId()) {
                    score.set(0, score.get(0) + 7);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDrink == plain_black.getId()) {
                    score.set(1, score.get(1) + 4);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDrink == chocolate.getId()) {
                    score.set(3, score.get(3) + 4);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDrink == caramel_macchiato.getId()) {
                    score.set(4, score.get(4) + 9);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDrink == iced_drink.getId()) {
                    score.set(5, score.get(5) + 6);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDrink == green_tea.getId()) {
                    score.set(6, score.get(6) + 8);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdDrink == seasonal_special.getId()) {
                    score.set(2, score.get(2) + 9);
                    Log.d("check", "Scores: " + score.toString());
                }

                //Mettre à jour le radio button
                int selectedIdFavor = askFavor.getCheckedRadioButtonId();

                if (selectedIdFavor == puppy_eyes.getId()) {
                    score.set(0, score.get(0) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdFavor == win_win.getId()) {
                    score.set(2, score.get(2) + 5);
                    score.set(1, score.get(1) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdFavor == no_pressure.getId()) {
                    score.set(6, score.get(6) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdFavor == charm_your_way.getId()) {
                    score.set(4, score.get(4) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedIdFavor == wild_quest.getId()) {
                    score.set(3, score.get(3) + 5);
                    score.set(5, score.get(5) + 5);
                    Log.d("check", "Scores: " + score.toString());
                }

                if (selectedAttractionId == R.id.women_attraction_button){
                    Attraction = "female";
                }
                else if (selectedAttractionId == R.id.men_attraction_button) {
                    Attraction = "male";
                }
                else if (selectedAttractionId == R.id.bisexual_button) {
                    Attraction = "both";
                }

                if (selectedTypeId == R.id.cute_type_button) {
                    Ideal = "cute";
                }
                else if (selectedTypeId == R.id.bossy_type_button) {
                    Ideal = "bossy";
                }
                else if (selectedTypeId == R.id.fun_type_button) {
                    Ideal = "fun";
                }
                else if (selectedTypeId == R.id.charismatic_type_button) {
                    Ideal = "charismatic";
                }
                else if (selectedTypeId == R.id.adventurous_type_button) {
                    Ideal = "adventurous";
                }
                else if (selectedTypeId == R.id.chill_type_button) {
                    Ideal = "chill";
                }
                else if (selectedTypeId == R.id.rational_type_button) {
                    Ideal = "rational";
                }


                Log.d("check","ideal partner:" + Ideal);
                Log.d("check","gender qui love" + Attraction);
                Log.d("check", "Scores: " + score.toString());



                if (go_to_drink.getCheckedRadioButtonId() == -1 || weekendPlan.getCheckedRadioButtonId() == -1
                || handleDecision.getCheckedRadioButtonId() == -1 || askFavor.getCheckedRadioButtonId() == -1
                || selectedSeasonId == -1 || selectedAnimalId == -1 || selectedTypeId == -1 || selectedAnimalId == -1 ) {
                    Toast.makeText(Questions.this, "Please fill the questions",Toast.LENGTH_SHORT ).show();
                } else {
                    Intent intent = new Intent(Questions.this, Matches.class);
                    intent.putExtra("gender", gender);
                    intent.putExtra("genderAttractedTo", Attraction);
                    intent.putExtra("MBTI1", MBTI1);
                    intent.putExtra("MBTI2", MBTI2);
                    intent.putExtra("MBTI3", MBTI3);
                    intent.putExtra("score", score);
                    intent.putExtra("categoryAttractedTo", Ideal);
                    startActivity (intent);

                }


            }
        });




    } ;

    //setButtonGroupListener method
    private void setButtonGroupListener(List<Button> buttonGroup){
        for (Button button : buttonGroup){
            button.setOnClickListener(
                    v->{
                        for (Button b : buttonGroup) {
                            //default color for all buttons
                            b.setBackgroundColor(Color.WHITE);
                            b.setTextColor(Color.parseColor("#CF3453"));
                        }
                        button.setBackgroundColor(Color.parseColor("#CF3453"));
                        button.setTextColor(Color.WHITE);
                        //changing the color of the selected button

                        if (buttonGroup == seasonButtons) {
                            selectedSeasonId = button.getId();
                        } else if (buttonGroup == animalButtons) {
                            selectedAnimalId = button.getId();
                        } else if (buttonGroup == attractionButtons) {
                            selectedAttractionId = button.getId();
                        } else if (buttonGroup == typeButtons) {
                            selectedTypeId = button.getId();
                        }



                    });
        }
    }


} ;
