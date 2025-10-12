package com.example.anew;



import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



public class ArriveDate_Fragement extends Fragment {

    //Pour l'instant temporaire
    private String gender ="female";
    private String date_categorie = "chill";

    //Making final string variable for the context text of the date since it depends on the category you match

    //Male-----------------------------------------------------------------------------------------------------------------------------------------------------------
    private final String contextDate_Chill_Male =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "He is waiting for you in front of the castle, looking at his phone.\n" +
                    "\n" +
                    "“Hey, sorry for being late… Bus problem, you know…” you say with a friendly tone, as you look at your date.\n";

    private final String contextDate_Bossy_Male =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "He is waiting for you in front of the castle, looking at his phone.\n" +
                    "\n" +
                    "“Hey, sorry for being late… Bus problem, you know…” you say with a friendly tone, as you look at your date.\n";

    private final String contextDate_Rational_Male =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "He is waiting for you in front of the castle, reading a book.\n" +
                    "\n" +
                    "“Hey, sorry for being late… Bus problem, you know…” you say with a friendly tone, as you look at your date.\n";

    private final String contextDate_Cute_Male =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "He is waiting for you in front of the castle, fixing his outfit.\n" +
                    "\n" +
                    "“Hey, sorry for being late… Bus problem, you know…” you say with a friendly tone, as you look at your date.\n";

    private final String contextDate_Fun_Male =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "You’ve texted him about your “bus problem” and he replied, “Yeah, me too, dw ;)”\n" +
                    "\n" +
                    "You hop off the bus, only to notice a good-looking stranger also stepping down right behind you. You both start walking in the same direction — a little awkward, but maybe it’s just a coincidence.\n" +
                    "\n" +
                    "Except… it's not.\n";

    private final String contextDate_Adventurous_Male =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "You arrive in front of the castle. He’s not here yet. You decide to check your phone while waiting.\n" +
                    "\n" +
                    "You glance up just in time to see someone intentionally trip over a cobblestone, catch himself with a dramatic spin, and strike a pose.\n" +
                    "\n" +
                    "That’s your date…\n" +
                    "\n" +
                    "You sure about this one ? Maybe you should’ve just gone home.\n";
    private final String contextDate_Charismatic_Male =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "You arrive in front of the castle. He’s not here yet.\n";

    //Female------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private final String contextDate_Chill_Female =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "She is waiting for you in front of the castle, looking at her phone.\n" +
                    "\n" +
                    "“Hey, sorry for being late… Bus problem, you know…” you say with a friendly tone, as you look at your date.\n";

    private final String contextDate_Bossy_Female =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "She is waiting for you in front of the castle, looking at her phone.\n" +
                    "\n" +
                    "“Hey, sorry for being late… Bus problem, you know…” you say with a friendly tone, as you look at your date.\n";

    private final String contextDate_Rational_Female =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "She is waiting for you in front of the castle, reading a book.\n" +
                    "\n" +
                    "“Hey, sorry for being late… Bus problem, you know…” you say with a friendly tone, as you look at your date.\n";

    private final String contextDate_Cute_Female =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "She is waiting for you in front of the castle, fixing her outfit.\n" +
                    "\n" +
                    "“Hey, sorry for being late… Bus problem, you know…” you say with a friendly tone, as you look at your date.\n";

    private final String contextDate_Fun_Female =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "You’ve texted her about your “bus problem” and she replied, “Yeah, me too, dw ;)”\n" +
                    "\n" +
                    "You hop off the bus, only to notice a good-looking stranger also stepping down right behind you. You both start walking in the same direction — a little awkward, but maybe it’s just a coincidence.\n" +
                    "\n" +
                    "Except… it's not.\n";

    private final String contextDate_Adventurous_Female =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "You arrive in front of the castle. She’s not here yet. You decide to check your phone while waiting.\n" +
                    "\n" +
                    "You glance up just in time to see someone intentionally trip over a cobblestone, catch herself with a dramatic spin, and strike a pose.\n" +
                    "\n" +
                    "That’s your date…\n" +
                    "\n" +
                    "You sure about this one ? Maybe you should’ve just gone home.\n";
    private final String contextDate_Charismatic_Female =
            "Getting ready makes you arrive a bit late to the date, but at least you slay.\n" +
                    "\n" +
                    "You arrive in front of the castle. She’s not here yet.\n";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        SharedPreferences prefs = requireActivity().getSharedPreferences("userPrefs", Context.MODE_PRIVATE);
        String gender = prefs.getString("GenreForText", "na");
        String date_categorie = prefs.getString("CatForText", "na");


        //Getting the button
        View view = inflater.inflate(R.layout.fragment_arrive_date__fragement, container, false);

        Button next = view.findViewById(R.id.buttonNext);
        TextView context = view.findViewById(R.id.text_contextDate);



        //Set le text selon la catégorie de la personne + son gender

        if (date_categorie.equals("charismatic")) {
            if (gender.equals("female")) {
                context.setText(contextDate_Charismatic_Female);
            } else if (gender.equals("male")) {
                context.setText(contextDate_Charismatic_Male);
            }
        }

        if (date_categorie.equals("cute")) {
            if (gender.equals("female")) {
                context.setText(contextDate_Cute_Female);
            } else if (gender.equals("male")) {
                context.setText(contextDate_Cute_Male);
            }
        }

        if (date_categorie.equals("bossy")) {
            if (gender.equals("female")) {
                context.setText(contextDate_Bossy_Female);
            } else if (gender.equals("male")) {
                context.setText(contextDate_Bossy_Male);
            }
        }

        if (date_categorie.equals("fun")) {
            if (gender.equals("female")) {
                context.setText(contextDate_Fun_Female);
            } else if (gender.equals("male")) {
                context.setText(contextDate_Fun_Male);
            }
        }

        if (date_categorie.equals("rational")) {
            if (gender.equals("female")) {
                context.setText(contextDate_Rational_Female);
            } else if (gender.equals("male")) {
                context.setText(contextDate_Rational_Male);
            }
        }

        if (date_categorie.equals("adventurous")) {
            if (gender.equals("female")) {
                context.setText(contextDate_Adventurous_Female);
            } else if (gender.equals("male")) {
                context.setText(contextDate_Adventurous_Male);
            }
        }

        if (date_categorie.equals("chill")) {
            if (gender.equals("female")) {
                context.setText(contextDate_Chill_Female);
            } else if (gender.equals("male")) {
                context.setText(contextDate_Chill_Male);
            }
        }



        //Moving to the date
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create an instance of the fragment
                Date_Frag fragmentDate = new Date_Frag();
                //Creating an instance to exchange the fragment
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                //We comit the transaction
                transaction.replace(R.id.fragmentContainerView, fragmentDate);
                transaction.commit();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }


}
