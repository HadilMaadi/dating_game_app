package com.example.anew;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Date_Frag extends Fragment {

    private int aura = 4;

    //Variable temp pour le nom du user et du date pour l'instant
    private String name_user = "Y/N";
    private String name_date = "Maeva";

    private String gender_date = "female";

    private String category_date = "chill";


    // Index du dialogue selon les "parties" - On garde
    private int dialogueIndexComplimentOutfit = 0;

    private int gettingToKnowIndex = 0;

    private int gettingToKnowIndex2 = 0;
    private int question_diag1Index = 0;
    private int Question_diag2Index = 0;


    //String list for all the dialogue

    //Faudra faire des dialogue "liste" pour chaque catégories + le genre de la personne

    //CHILL Dialogue--------------------------------------------------------------------------------------------------------------------------------------------------
    private String[] namesDiag_chill_GoodCompliment;

    private String[] dialogues_chillGoodCompliment_Female;

    private String[] dialogues_chillGoodCompliment_Male;

    private String[] namesDiag_chill_BadCompliment;

    private String[] dialogues_chillBadCompliment_Female;

    private String[] dialogues_chillBadCompliment_Male;

    //BOSSY Dialogue--------------------------------------------------------------------------------------------------------------------------------------------------
    private String[] namesDiag_bossy_BadCompliment;

    private String[] dialogues_bossyBadCompliment;

    private String[] namesDiag_bossy_GoodCompliment;

    private String[] dialogues_bossyGoodCompliment;

    //RATIONAL Dialogue---------------------------------------------------------------------------------------------------------------------------------------------------------
    private String[] namesDiag_rational_BadCompliment;

    private String[] dialogues_rationalBadCompliment;

    private String[] namesDiag_rational_GoodCompliment;

    private String[] dialogues_rationalGoodCompliment;

    //CHARISMATIC Dialogue-----------------------------------------------------------------------------------------------------------------------------------------
    private String[] namesDiag_charismatic_BadCompliment;

    private String[] dialogues_charismaticBadCompliment;

    private String[] namesDiag_charismatic_GoodCompliment;

    private String[] dialogues_charismaticGoodCompliment;

    //CUTE Dialogue----------------------------------------------------------------------------------------------------------------------------------------------------------
    private String[] namesDiag_cute_BadCompliment;

    private String[] dialogues_cuteBadCompliment;

    private String[] namesDiag_cute_GoodCompliment;

    private String[] dialogues_cuteGoodCompliment;

    //ADVENTUROUS Dialogue--------------------------------------------------------------------------------------------------------------------------------------------------------
    private String[] namesDiag_adventurous_BadCompliment;

    private String[] dialogues_adventurousBadCompliment;

    private String[] namesDiag_adventurous_GoodCompliment;

    private String[] dialogues_adventurousGoodCompliment;

    //FUN Dialogue--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private String[] namesDiag_fun_BadCompliment;

    private String[] dialogues_funBadCompliment;

    private String[] namesDiag_fun_GoodCompliment;

    private String[] dialogues_funGoodCompliment;

    //Getting to know ----------------------------------------------------------------------------------------------------
    private String[] namesDiag_GettingToKnow;

    private String[] dialogues_GettingToKnow;

    //Question1 ----------------------------------------------------------------------------
    private String[] question1_date;


    private String[] name_question1_datechoix1_good;
    private String[] diag_question1_datechoix1_good;

    private String[] name_question1_datechoix1_bad;
    private String[] diag_question1_datechoix1_bad;


    private String[] name_question1_datechoix2_good;

    private String[] diag_question1_datechoix2_good;

    private String[] name_question1_datechoix2_bad;

    private String[] diag_question1_datechoix2_bad;


    private String[] name_question1_datechoix3_good;
    private String[] diag_question1_datechoix3_good;

    private String[] name_question1_datechoix3_bad;

    private String[] diag_question1_datechoix3_bad;

    //Getting to know 2 ---------------------------------------------------
    private String[] names_GettingToKnow2;

    private String[] diag_GettingToKnow2;


    //Question 2 ---------------------------------------------

    private String[] question2_date;


    private String[] name_question2_datechoix1_good;

    private String[] diag_question2_datechoix1_good;

    private String[] name_question2_datechoix1_bad;

    private String[] diag_question2_datechoix1_bad;

    private String[] name_question2_datechoix2_good;

    private String[] diag_question2_datechoix2_good;

    private String[] name_question2_datechoix2_bad;

    private String[] diag_question2_datechoix2_bad;

    private String[] name_question2_datechoix3_good;

    private String[] diag_question2_datechoix3_good;

    private String[] name_question2_datechoix3_bad;

    private String[] diag_question2_datechoix3_bad;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        SharedPreferences prefs = requireActivity().getSharedPreferences("userPrefs", Context.MODE_PRIVATE);
        final int[] aura = {prefs.getInt("aura", 0)};
        String name_user = prefs.getString("username", "na");
        String name_date = prefs.getString("NameForText", "na");
        String gender_date = prefs.getString("GenreForText", "na");
        String category_date = prefs.getString("CatForText", "na");


        namesDiag_chill_GoodCompliment = new String[]{
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_user

        };

        dialogues_chillGoodCompliment_Female = new String[]{
                "Your date look at you up and down, curious. A small, relaxed smile pulls at her lips as she rests her hand on her chin. Her tone is easy, casual, almost amused.\n",
                "No worries for coming late, you’re " + name_user + " right ?",
                "“Yeah it’s me ! Why too pretty for your own good ?” You flirt subtly. ",
                "“Well… I’m not someone judging people by her clothes. But, damn – I’ve gotta say, you look stunning”",
                "“Oh really ? Just stunning” ",
                "“Maybe I lost my words just looking at you” She answers teasely while grinning.",
                "“Hope you still have a few left, cause I’d really like to know you” You reply playfully while smiling happy that you made a good impression.\n",
                "Good job you totally slay ! "

        };

        dialogues_chillGoodCompliment_Male = new String[]{
                "Your date look at you up and down, curious. A small, relaxed smile pulls at his lips as he rests his hand on his chin. His tone is easy, casual, almost amused.\n",
                "No worries for coming late, you’re " + name_user + " right ?",
                "“Yeah it’s me ! Why too pretty for your own good ?” You flirt subtly. ",
                "“Well… I’m not someone judging people by his clothes. But, damn – I’ve gotta say, you look stunning”",
                "“Oh really ? Just stunning” ",
                "“Maybe I lost my words just looking at you” He answers teasely while grinning.",
                "“Hope you still have a few left, cause I’d really like to know you” You reply playfully while smiling happy that you made a good impression.\n",
                "Good job you totally slay ! "
        };

        namesDiag_chill_BadCompliment = new String[]{
                name_date,   //
                name_date,   // “You’re [name_user] ?”
                name_user,   // “Yeah it’s me ! [...]”
                name_date,   // “No offense [...]”
                name_user,   // “Oh… Yeah…”
                name_user    //
        };

        dialogues_chillBadCompliment_Female = new String[]{
                name_date + " looks at you up and down. She is squinting her eyes before she speaks up calmly.",
                "“You’re " + name_user + " ?”\n",
                "“Yeah it’s me ! Why too pretty for your own good ?” " + name_user + " flirts subtly.\n",
                "“Hum… No offense, but I didn’t think you would look that way… I’m kinda disappointed to be honest… But hey let’s not focus on that, I’m sure we can still have a chill date.” " + name_date + " replies calmly as she gives you a gentle smile.\n",
                "“Oh… Yeah…” " + name_user + " feels embarrassed at her comment.",
                "Maybe " + name_user + " should have put more thought into the outfit…\n"
        };

        dialogues_chillBadCompliment_Male = new String[]{
                name_date + " looks at you up and down. He is squinting his eyes before he speaks up calmly.",
                "“You’re " + name_user + " ?”\n",
                "“Yeah it’s me ! Why too pretty for your own good ?” " + name_user + " flirts subtly.\n",
                "“Hum… No offense, but I didn’t think you would look that way… I’m kinda disappointed to be honest… But hey let’s not focus on that, I’m sure we can still have a chill date.” " + name_date + " replies calmly as he gives you a gentle smile.\n",
                "“Oh… Yeah…” " + name_user + " feels embarrassed at his comment.",
                "Maybe " + name_user + " should have put more thought into the outfit…\n"
        };

        //Bossy----------------------------------------------------------------------------------------
        String[] dialogues_bossyBadCompliment = {
                "“You are… ” " + name_user + "? asks while looking up and down at you with a weird face.",
                "“I’m " + name_user + "... Your date…”",
                "“Oh… It’s you… I see…”",
                "“Disappointed ?”",
                "“Let’s say... surprised. But I guess confidence is what matters, right?”",
                "“Oh…” " + name_user + " lets out, a bit thrown off.",
                "There is an awkward silence between you before " + name_date + " speaks up.",
                "“You’re not cold ? Do you want my vest ?”",
                "“It’s literally warm today.” " + name_user + " replies, confused.",
                "“Mhm. I just think it’d be better if you covered up a little. You know... for the vibe.” " + name_date + " insists, almost condescending.",
                "“I’m fine. Thanks.” " + name_user + " replies, annoyed.",
                "Maybe you didn’t slay as hard as you thought… (or they’re just an ass)\n"
        };

        String[] namesDiag_bossy_BadCompliment = {
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_user
        };

        String[] dialogues_bossyGoodCompliment = {
                "“You’re " + name_user + " ?” " + name_date + " asks while smiling as they look at you up and down with a satisfied face.\n",
                "“Yes, it’s me! Hard to guess ?”",
                name_date + " chuckles softly before replying seductively. “Don’t know, but I’m sure that with or without your pics, I would’ve come talk to you.”",
                "“Even if you have a date with someone else ?” " + name_user + " teases gently.",
                "“Then I guess the universe would have made a scheduling error, cause I was clearly meant to meet you.”",
                "“Oh, so now we’re talking fate?”",
                "“No... we’re talking luck. Mine, mostly.” " + name_date + " answers while smirking.",
                "“Smooth answer. I’ll let that one slide.” " + name_user + " retorts playfully.",
                "“Good. I plan on earning more passes.”",
                "Are we third-wheeling ? Cause you just made a solid first impression. Good job, you totally slay!\n"
        };

        //Rational --------------------------------------------------------------------------------------

        String[] namesDiag_bossy_GoodCompliment = {
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        String[] dialogues_rationalBadCompliment = {
                "“You’re late –” They said before making a pause as their eyes scanning you.\n",
                "“Sorry, wrong person” They retort shortly after while they shut their book ready to leave, completely ignoring you.\n",
                "“No no, you’ve got the right person. It’s me " + name_user + "” You reply quickly reaching for their arm to make them stay\n",
                "“Don’t touch me” \n",
                "“Sorry…” You apologize immediately \n",
                "They sigh, brushing the spot where you touched them like it burned. Wow. Rude.\n",
                "An awkward silence settles between you, thick and uncomfortable. They look at you like you’re the weird one. You… just feel embarrassed.\n",
                "“You don’t feel shamed wearing that ?” They ask almost disgust by your clothing \n",
                "“Huh? No! Do you know how rude your tone is ?” \n",
                "“Feel like i’m wasting my time”\n",
                "“Well, we’re both already here. So how about we just try the date—so it’s not a complete waste?” You fold your arms, trying not to show how annoyed you really are.",
                "Maybe you didn’t slayed as hard as you thought…\n"
        };

        String[] namesDiag_rational_BadCompliment = {
                name_date,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_user
        };

        String[] dialogues_rationalGoodCompliment = {
                "“You’re late” They replied calmly\n",
                "“Sorry, there are problems with bus…” You lied softly\n",
                "“There isn’t… So what’s your excuse for coming 8 minutes and 49 seconds late ?” They ask calmly again.\n",
                "“I… I have a fight with someone ??” You replied confuse by your answer. Just what were you thinking.\n",
                "“But you wouldn’t look this stunning, if you were “having a fight with someone” as you quote”\n",
                "“You think i’m stunning ?” \n",
                "“Yes, you are… Otherwise I wouldn’t have make that comment”\n",
                "“Oh well… Thanks”\n",
                "“I’m guessing that why you were running late..”\n",
                "“Maybe…”\n",
                "“I’ll let that slide since you’re gorgeous ”\n",
                "Heyy, you just got a pretty privilege pass and did a good first impression… Good job you totally slay !\n"
        };

        String[] namesDiag_rational_GoodCompliment = {
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        //Charismatic-------------------------------------

        String[] dialogues_charismaticBadCompliment = {
                "Then, a person come to your way. They look at you and go to the opposite way.\n",
                "“Hey wait ! You’re the one from the date right ? ” You said loudly enough for them to hear.\n",
                "“ Yeah but I’m not interested anymore sorry sweetheart “\n",
                "“What ?? Why ?” You ask confused.\n",
                "“You don’t check yourself in the mirror much hun, do you? I can tell.\n",
                "“You’re so rude… No one told you that‘s personality is more important than looks ?“ \n",
                "“I don’t do personality…”\n",
                "“And I don’t do stuck-up…”\n",
                "“Like your sass… Maybe the date won’t be as boring as I thought it will be”\n",
                "You roll your eyes at his comment. Not a great start for your first date…  Maybe you should have put more thought on your outfit.\n"
        };

        String[] namesDiag_charismatic_BadCompliment = {
                name_user,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        String[] dialogues_charismaticGoodCompliment = {
                "Then, someone walks toward you — poised, confident.\nThey lock eyes with you, a slow smile spreading on their lips as they give you a quick once-over.\n",
                "“Well, well… you must be " + name_user + ", ” They say, voice like velvet.\n",
                " You nod, caught a little off guard by their presence.\n“Yes, I am!” you reply, trying to match their energy.\n",
                "They chuckle — smooth, effortless.\n“I was already expecting someone cute, but you just raised the bar.”\n",
                "You laugh, a bit flustered. “That’s quite the opening line.”\n",
                "“What can I say? I like starting strong.” They wink.\n",
                "“You look even better than your profile — dangerously so.”\n",
                "“Oh? Should I be worried?”\n",
                "“Only if you’re afraid of being swept off your feet.”\n",
                "You grin. “I’ll take my chances.”\n",
                "They lean in just slightly, eyes glinting.\n“Bold. I like that. This is going to be fun.”\n",
                "Are we already falling? Because this date just turned into a rom-com.\nGood job — you totally slay!\n"
        };

        String[] namesDiag_charismatic_GoodCompliment = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        //cute-----------------------------------------------------------------------------

        String[] dialogues_cuteBadCompliment = {
                "Your date spots you. Their eyes light up for a second, full of hope… but then drop slightly into confusion.\n",
                "“You’re " + name_user + " ?” (They asked gently a bit down.)\n",
                "“Yes I am !” You replied joyfull.\n",
                "“Oh… I see…”\n",
                "“Are you okay ?” You asked concern about them. \n",
                "“Yeah… It’s just you… You’re different from your pics in the app… I thought you  will…” Their words trail off into a mumble.\n",
                "“You thought what ?” \n",
                "“Hum.. Nothing…”\n",
                "“Be honest, I can handle it don’t worry ” You tried to incite them to talk and cause you’re curious \n",
                "“Well… How can I tell you… Hum… You’re not really my taste… Like totally… But you have a good face… It’s just your clothe…”\n",
                "“Oh… Ok” You replied quietly. \n",
                "It stings. You said you could handle it — but honestly, no. That hurt. You smile anyway, but your pride is already lying face-down on the ground.\n",
                "“I’m sorry if I hurt you… But hey you seem cool let’s continue this date !” They tried to cheer you up.\n",
                "You nod slowly, but ouch… Maybe you didn’t slay as hard as you thought."
        };

        String[] namesDiag_cute_BadCompliment = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_user,
                name_date,
                name_user
        };

        String[] dialogues_cuteGoodCompliment = {
                "Your date spots you. Their eyes widen with surprise — and something like awe. For a second, they forget how to smile.\n",
                "“You’re... " + name_user + "?” They ask softly.\n",
                "“Yes, I am !” You reply cheerfully.\n",
                "“Oh… I see…” They answer, staring at you — enough to almost make you blush.\n",
                "“Do… Do I have something on my face? Or on me?” You ask, embarrassed, with a small laugh.\n",
                "“Yeah… N-No! I mean… it’s just... you look really different from your photos. I thought you’d look nice, but…”\n",
                "“You thought what?”\n",
                "“You look better. Like… way better. I mean — wow.” They mumble, their cheeks tinting red.\n",
                "“Well, thanks for the compliment — especially coming from a pretty boy/girl like you.”\n",
                "“Are we flirting now?” They ask teasingly.\n",
                "“Didn’t we start from the beginning, though?”\n",
                "“And you’ve got some comebacks. Wow, you’re wonderful.”\n",
                "“All for you, girly/handsome.”\n",
                "Are we third-wheeling? Because you just made a solid first impression. Good job — you totally slay!\n"
        };

        String[] namesDiag_cute_GoodCompliment = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_user
        };


        //Adventurous ---------------------------------
        String[] dialogues_adventurousBadCompliment = {
                "“And I just pause at the wrong the person…” They says a bit breathless disappointed.\n",
                "“No, no… You’re " + name_date + " right ? It’s me " + name_user + "” You reply softly before they go.\n",
                "“You.. You are " + name_user + " ? Like " + name_user + ", " + name_user + " ?”\n",
                "“Yup that’s me ! Am I this different from my picture on the app ?” You ask them confuse.\n",
                "“Yeah… Totally even”\n",
                "“In good I hope…? “ You say smoothly hoping to fish some compliment \n",
                "“No”\n",
                "“Oh, don’t make me blush — Wait, what? You said no. So you don’t like me ??” \n",
                "“Well, if I printed your photo from the app and glued it to your face right now… then maybe I’d like you.”\n",
                "You stare at them, momentarily stunned. “Wow. Brutal.”\n",
                "They shrug, like it's nothing. “I’m just being honest.”\n",
                "You exhale, trying to keep your cool. “Yeah, well… maybe honesty isn’t your strong suit. Or charm.”\n",
                "They smirk, unbothered. “You’re feisty. I like that.”\n",
                "You raise an eyebrow. “Didn’t you just say you don’t like me?\n",
                "“Okay you win this one”\n",
                "Not a great start for your first date… Maybe you should have put more thought on your outfit.\n"
        };

        String[] namesDiag_adventurous_BadCompliment = {
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };


        //FUN------------------------------------------------------------

        String[] dialogues_funBadCompliment = {
                "When you both stop in front of the castle entrance, realization hits at the same time.\n",
                "They glance at you. “Oh,” they say. Flat. Disappointed, maybe.\n",
                "You blink. “Wait… are you " + name_date + " ?”\n",
                "“Yeah.” They pause. “You’re " + name_user + "?”\n",
                "You nod, smiling. “Yeah! Looks like we shared a bus.”\n",
                "“Huh,” they mutter. “Could’ve sworn you were someone else.”\n",
                "There’s an awkward beat of silence. You try to keep the mood light. “Well… surprise?”\n",
                "They force a small laugh. “Yeah. Definitely wasn’t expecting this.”\n",
                "“What did you expect then?” you ask, forcing a smile, even though your chest feels a little tight.\n",
                "They shift their weight, looking off to the side. “I don’t know. Just… something else, I guess.”\n",
                "“Something else?” you repeat, trying not to sound offended.\n",
                "“Yeah. Like…” they glance at you briefly, then away. “You seemed really confident online. Cool. Stylish. I guess I imagined you’d show up looking like… that.”\n",
                "“That?” you echo, blinking.\n",
                "They gesture vaguely, like the word’s too awkward to finish. “I don’t know. Just different.”\n",
                "“Right. Great start.” You nod slowly, but ouch… Maybe you didn’t slay as hard as you thought.\n"
        };

        String[] namesDiag_fun_BadCompliment = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        String[] dialogues_funGoodCompliment = {
                "You both stop in front of the castle entrance. You glance at each other. Pause.\n",
                "Then they grin. “No way. You’re " + name_user + " ?”\n",
                "You blink. “Wait—you’re " + name_date + "?”\n",
                "They laugh, rubbing the back of their neck. “So we basically sat on the same bus in total silence like NPCs?”\n",
                "You laugh too. “Yeah. I was trying not to make eye contact in case you were a serial killer.”\n",
                "“Well, joke’s on you,” they say, stepping dramatically to the side, “because I was trying to impress you with my aura of mystery.”\n",
                "You raise an eyebrow. “And did it work?”\n",
                "They pretend to think, then flash a cheeky smile. “You tell me. You did follow me here.”\n",
                "You roll your eyes with a smile. “You were literally ahead of me.”\n",
                "“Details, details. Now, shall we begin the most accidentally synchronized date in history?”\n",
                "They offer you their arm like a theater kid playing royalty.\n",
                "You take it. This one’s going to be fun — you can feel it. Good job you totally slay !\n"
        };

        String[] namesDiag_fun_GoodCompliment = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_user
        };


        // Getting to know ----------------------------------------------------------------------------------------------------
        String[] namesDiag_GettingToKnow = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date
        };

        String[] dialogues_GettingToKnow = {
                "“So… this place is kinda cute, right?” you offer.\n",
                "They glance back at the castle and nod. “Yeah. I passed it once and thought it looked like somewhere you’d either get coffee or fall into a magical portal.”\n",
                "You laugh. “I’m hoping for coffee, but I won’t say no to a magical portal.”\n",
                "“Well, worst case, we end up in a slightly overpriced gift shop,” they say, cracking a small grin.\n",
                "You both start walking slowly toward the entrance. The gravel crunches under your shoes, sharp in the quiet.\n",
                "“I still can’t tell if this place is charming or cursed,” they say.\n",
                "You shrug. “Could be both. Like most things I like.”\n",
                "They give you a look — half amused, half skeptical. “Right. And this isn’t a trap at all.”\n",
                "“I didn’t lure you here,” you say. “I just strongly implied it would be less boring than going in the park.”\n",
                "They chuckle, but it fades quickly. “Still feels like the kind of place where someone’s definitely died.”\n",
                "“At least once,” you agree. “But probably in a poetic way. Like tripping over a candelabra or falling in love at the wrong moment.”\n",
                "They pause on the steps, staring up at the crooked tower. “I’m not sure if you’re joking or trying to foreshadow something.”\n",
                "“I don’t plan that far ahead,” you say.\n",
                "“Obviously.”\n",
                "“What? Do you feel like I had a plan?” you ask teasingly.\n",
                "“I don’t know, maybe... Maybe you plan to kill me…”\n"
        };

        //Question 1 ------------------------------------------------------------
        String[] question1_date = {
                "Yeah I'm going to kill you",
                "That wasn't my intention",
                "No I'm too tired, and you're cute"
        };

        String[] name_question1_datechoix1_good = {
                name_user,
                name_date,
                name_user,
                name_date
        };

        String[] diag_question1_datechoix1_good = {
                "“Yeah I’m going to kill you.. But you’re lucky I can accept bribe.”\n",
                "“So what you’re saying is — I still have a chance to survive if I give you tiramisu?”\n",
                "“Exactly.”\n",
                "They nod solemnly, playing along. “Noted. Stick to scones, live another day.”\n"
        };

        String[] name_question1_datechoix1_bad = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_date,
                name_user
        };

        String[] diag_question1_datechoix1_bad = {
                "“Yeah, I’m going to kill you… But you’re lucky I can accept bribes.”\n",
                "They stop walking. “...Okay, what the hell is that supposed to mean?”\n",
                "“It means you better have snacks or you’re dead. I don’t work for free.”\n",
                "“Seriously? That’s not funny.” Their expression hardens.\n",
                "“You think joking about that makes it less weird you dragged me to a creepy castle?”\n",
                "“It was a joke.”\n"
        };

        String[] name_question1_datechoix2_good = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        String[] diag_question1_datechoix2_good = {
                "That wasn’t my intention",
                "They eye you. “But it was a possibility?”\n",
                "You smirk. “Only if the date went really badly.”\n",
                "They laugh. “Guess I’ll try to stay charming, then.”\n",
                "“No pressure,” you grin. “Your life just depends on it.”\n"
        };

        String[] name_question1_datechoix2_bad = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user,
                name_date
        };

        String[] diag_question1_datechoix2_bad = {
                "That wasn’t my intention",
                "They raise an eyebrow. “That’s not exactly reassuring.”\n",
                "You shrug. “Well, you’re still here, so I guess you’re safe for now.”\n",
                "They frown slightly. “Guess I expected more of a ‘No, I would never’ answer.”\n",
                "You smirk. “Guess I’m not the ‘romantic reassurance’ type.”\n",
                "They sigh, shaking their head. “Great. So much for a smooth first date.”\n"
        };

        String[] name_question1_datechoix3_good = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        String[] diag_question1_datechoix3_good = {
                "“No I’m too tired, and you're cute”\n",
                "“So you’re saying that I can live another day cause I’m cute ?”\n",
                "“Exactly. It would be a shame to kill you. A big mistake.”\n",
                "They grin. “Glad to know my face is saving lives.”\n",
                "You smirk. “Well, not lives. Just yours.”\n"
        };

        String[] name_question1_datechoix3_bad = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        String[] diag_question1_datechoix3_bad = {
                "“No I’m too tired, and you're cute” You answer\n",
                "“That’s no fun… Was expecting a little fight… Kinda disappointed…” they say, crossing their arms with a mock pout.\n",
                "You raise an eyebrow. “Sorry to ruin your dramatic moment. Would you rather I tried to stab you or something?”\n",
                "They shrug, clearly enjoying themselves. “A little tension keeps things interesting, you know?”\n",
                "“Alright then,” you say, leaning in just slightly. “Next time, I’ll bring a sword.”\n"
        };

        //Getting to know 2 ---------------------------------------------------------

        String[] names_GettingToKnow2 = {
                name_date,
                name_date,
                name_date
        };

        String[] diag_GettingToKnow2 = {
                "“But anyway…”\n",
                "“Let’s try to know each other more…”\n",
                "“What’s something you’re proud of?”\n"
        };

        //Question 2 ------------------------------------------------------------------------
        String[] question2_date = {
                "Making Android Studio work",
                "Eating raw steak in a bin",
                "Doing leapfrog on people"
        };

        String[] name_question2_datechoix1_good = {
                name_user,
                name_date,
                name_user,
                name_date
        };

        String[] diag_question2_datechoix1_good = {
                "Making Android Studio work",
                "“Omg, that’s so impressive, damn right it’s the thing you’re most proud of. I’m kinda jealous”",
                "“Yeah i’m impressive” \n",
                "“I see that. You’re beautiful and smart. Think I find the one”\n"
        };

        String[] name_question2_datechoix1_bad = {
                name_user,
                name_date,
                name_user,
                name_date,
                name_user
        };

        String[] diag_question2_datechoix1_bad = {
                "Making Android Studio work",
                "“Oh… i guess that’s impressive but i expected something more.. i don’t know fun ? Like drinking one litre of whisky”\n",
                "“Did you do that ???”\n",
                "“Yeah. Last sunday”\n",
                "“Oh… Cool…  I guess”\n"
        };

        String[] name_question2_datechoix2_good = {
                name_user,
                name_date,
                name_user
        };

        String[] diag_question2_datechoix2_good = {
                "Eating a raw steak in a bin",
                "“OMG you really are something. I like this crazy side of you”\n",
                "“Haha yeah, i like listening to the little voice in my head”\n"
        };

        String[] name_question2_datechoix2_bad = {
                name_user,
                name_date,
                name_user,
                name_date
        };

        String[] diag_question2_datechoix2_bad = {
                "Eating a raw steak in a bin",
                "“Uh… You’re good ? Didn’t you have some kind of disease after that, the covid that was you ?”",
                "“I don’t know, I was really hungry and it was right there in front of me, waiting to be eaten…”",
                "“You’re crazy bro/girl”\n"
        };

        String[] name_question2_datechoix3_good = {
                name_user,
                name_date,
                name_user
        };

        String[] diag_question2_datechoix3_good = {
                "Doing leapfrog on people",
                "“Awwn that’s really cute… you know what i see where you’re coming from, that’s kinda impressive”\n",
                "“Haha thank you”\n"
        };

        String[] name_question2_datechoix3_bad = {
                name_user,
                name_date,
                name_user
        };

        String[] diag_question2_datechoix3_bad = {
                "Doing leapfrog on people",
                "“haha, that’s kind of childish don’t you think ?”\n",
                "“mmmmh.. no i didn’t think so ? ”\n"
        };


        //Getting the button next and the text id
        View view = inflater.inflate(R.layout.fragment_date_, container, false);

        Button next = view.findViewById(R.id.next_dialogue);
        Button next2 = view.findViewById(R.id.next_dialogue2);

        next2.setVisibility(view.INVISIBLE);


        TextView diag_name = view.findViewById(R.id.name_dialogue);
        TextView dialogue = view.findViewById(R.id.dialogue);
        TextView aura_pt = view.findViewById(R.id.aura_text);


        Button button_choice1 = view.findViewById(R.id.choice1);
        Button button_choice2 = view.findViewById(R.id.choice2);
        Button button_choice3 = view.findViewById(R.id.choice3);

        Button button_choice4 = view.findViewById(R.id.choice4);
        Button button_choice5 = view.findViewById(R.id.choice5);
        Button button_choice6 = view.findViewById(R.id.choice6);

        Button button_endDate = view.findViewById(R.id.button_end_date);


        button_choice1.setVisibility(View.INVISIBLE);
        button_choice2.setVisibility(View.INVISIBLE);
        button_choice3.setVisibility(View.INVISIBLE);
        button_choice4.setVisibility(View.INVISIBLE);
        button_choice5.setVisibility(View.INVISIBLE);
        button_choice6.setVisibility(View.INVISIBLE);

        button_endDate.setVisibility(View.INVISIBLE);

        ImageView barre_aura = view.findViewById(R.id.aura_barre_image);


        //C'est la qu'il faudra mettre des if et tout car on initial selon la catégory
        //On fera un big if en gros
        //if (catégory == "chill") {}

        if (category_date.equals("chill")) {
            if (gender_date.equals("female")) {

                if (aura[0] == 5) {
                    //Initialiser les dialogue
                    dialogue.setText(dialogues_chillGoodCompliment_Female[dialogueIndexComplimentOutfit]);
                    diag_name.setText(namesDiag_chill_GoodCompliment[dialogueIndexComplimentOutfit]);

                    aura_pt.setText("Aura : " + aura[0]);

                    int resId1 = getResources().getIdentifier("aura_5", "drawable", requireContext().getPackageName());
                    barre_aura.setImageResource(resId1);


                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialogueIndexComplimentOutfit++;

                            if (dialogueIndexComplimentOutfit < namesDiag_chill_GoodCompliment.length) {
                                diag_name.setText(namesDiag_chill_GoodCompliment[dialogueIndexComplimentOutfit]);
                                dialogue.setText(dialogues_chillGoodCompliment_Female[dialogueIndexComplimentOutfit]);
                            } else {

                                gettingToKnowIndex++;
                                if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                    diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                    dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                                } else {
                                    button_choice1.setVisibility(View.VISIBLE);
                                    button_choice1.setText(question1_date[0]);

                                    button_choice2.setVisibility(View.VISIBLE);
                                    button_choice2.setText(question1_date[1]);

                                    button_choice3.setVisibility(View.VISIBLE);
                                    button_choice3.setText(question1_date[2]);

                                    next.setEnabled(false);


                                }
                            }
                        }
                    });

                }

                if (aura[0] < 5) {
                    //Initialiser les dialogue
                    dialogue.setText(dialogues_chillBadCompliment_Female[dialogueIndexComplimentOutfit]);
                    diag_name.setText(namesDiag_chill_BadCompliment[dialogueIndexComplimentOutfit]);

                    aura_pt.setText("Aura : " + aura[0]);
                    int resId1 = getResources().getIdentifier("aura_3", "drawable", requireContext().getPackageName());
                    barre_aura.setImageResource(resId1);


                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialogueIndexComplimentOutfit++;

                            if (dialogueIndexComplimentOutfit < namesDiag_chill_BadCompliment.length) {
                                diag_name.setText(namesDiag_chill_BadCompliment[dialogueIndexComplimentOutfit]);
                                dialogue.setText(dialogues_chillBadCompliment_Female[dialogueIndexComplimentOutfit]);
                            } else {

                                gettingToKnowIndex++;
                                if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                    diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                    dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                                } else {
                                    button_choice1.setVisibility(View.VISIBLE);
                                    button_choice1.setText(question1_date[0]);

                                    button_choice2.setVisibility(View.VISIBLE);
                                    button_choice2.setText(question1_date[1]);

                                    button_choice3.setVisibility(View.VISIBLE);
                                    button_choice3.setText(question1_date[2]);

                                    next.setEnabled(false);


                                }
                            }
                        }
                    });

                }


            }

            if (gender_date.equals("male")) {

                if (aura[0] == 5) {
                    //Initialiser les dialogue
                    dialogue.setText(dialogues_chillGoodCompliment_Male[dialogueIndexComplimentOutfit]);
                    diag_name.setText(namesDiag_chill_GoodCompliment[dialogueIndexComplimentOutfit]);

                    aura_pt.setText("Aura : " + aura[0]);
                    int resId1 = getResources().getIdentifier("aura_5", "drawable", requireContext().getPackageName());
                    barre_aura.setImageResource(resId1);


                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialogueIndexComplimentOutfit++;

                            if (dialogueIndexComplimentOutfit < namesDiag_chill_GoodCompliment.length) {
                                diag_name.setText(namesDiag_chill_GoodCompliment[dialogueIndexComplimentOutfit]);
                                dialogue.setText(dialogues_chillGoodCompliment_Male[dialogueIndexComplimentOutfit]);
                            } else {

                                gettingToKnowIndex++;
                                if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                    diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                    dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                                } else {
                                    button_choice1.setVisibility(View.VISIBLE);
                                    button_choice1.setText(question1_date[0]);

                                    button_choice2.setVisibility(View.VISIBLE);
                                    button_choice2.setText(question1_date[1]);

                                    button_choice3.setVisibility(View.VISIBLE);
                                    button_choice3.setText(question1_date[2]);

                                    next.setEnabled(false);


                                }
                            }
                        }
                    });

                }

                if (aura[0] < 5) {
                    //Initialiser les dialogue
                    dialogue.setText(dialogues_chillBadCompliment_Male[dialogueIndexComplimentOutfit]);
                    diag_name.setText(namesDiag_chill_BadCompliment[dialogueIndexComplimentOutfit]);

                    aura_pt.setText("Aura : " + aura[0]);
                    int resId1 = getResources().getIdentifier("aura_3", "drawable", requireContext().getPackageName());
                    barre_aura.setImageResource(resId1);


                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialogueIndexComplimentOutfit++;

                            if (dialogueIndexComplimentOutfit < namesDiag_chill_BadCompliment.length) {
                                diag_name.setText(namesDiag_chill_BadCompliment[dialogueIndexComplimentOutfit]);
                                dialogue.setText(dialogues_chillBadCompliment_Male[dialogueIndexComplimentOutfit]);
                            } else {

                                gettingToKnowIndex++;
                                if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                    diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                    dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                                } else {
                                    button_choice1.setVisibility(View.VISIBLE);
                                    button_choice1.setText(question1_date[0]);

                                    button_choice2.setVisibility(View.VISIBLE);
                                    button_choice2.setText(question1_date[1]);

                                    button_choice3.setVisibility(View.VISIBLE);
                                    button_choice3.setText(question1_date[2]);

                                    next.setEnabled(false);


                                }
                            }
                        }
                    });

                }

            }
        }

            if (category_date.equals("bossy")) {

                if (aura[0] < 5) {
                    //Initialiser les dialogue
                    diag_name.setText(namesDiag_bossy_BadCompliment[dialogueIndexComplimentOutfit]);
                    dialogue.setText(dialogues_bossyBadCompliment[dialogueIndexComplimentOutfit]);
                    aura_pt.setText("Aura : " + aura[0]);
                    int resId1 = getResources().getIdentifier("aura_3", "drawable", requireContext().getPackageName());
                    barre_aura.setImageResource(resId1);

                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialogueIndexComplimentOutfit++;

                            if (dialogueIndexComplimentOutfit < namesDiag_bossy_BadCompliment.length) {
                                diag_name.setText(namesDiag_bossy_BadCompliment[dialogueIndexComplimentOutfit]);
                                dialogue.setText(dialogues_bossyBadCompliment[dialogueIndexComplimentOutfit]);
                            } else {

                                gettingToKnowIndex++;
                                if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                    diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                    dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                                } else {
                                    button_choice1.setVisibility(View.VISIBLE);
                                    button_choice1.setText(question1_date[0]);

                                    button_choice2.setVisibility(View.VISIBLE);
                                    button_choice2.setText(question1_date[1]);

                                    button_choice3.setVisibility(View.VISIBLE);
                                    button_choice3.setText(question1_date[2]);

                                    next.setEnabled(false);


                                }
                            }
                        }
                    });

                }

                if (aura[0] == 5) {
                    //Initialiser les dialogue
                    dialogue.setText(dialogues_bossyGoodCompliment[dialogueIndexComplimentOutfit]);
                    diag_name.setText(namesDiag_bossy_GoodCompliment[dialogueIndexComplimentOutfit]);

                    aura_pt.setText("Aura : " + aura[0]);
                    int resId1 = getResources().getIdentifier("aura_5", "drawable", requireContext().getPackageName());
                    barre_aura.setImageResource(resId1);


                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialogueIndexComplimentOutfit++;

                            if (dialogueIndexComplimentOutfit < namesDiag_bossy_GoodCompliment.length) {
                                diag_name.setText(namesDiag_bossy_GoodCompliment[dialogueIndexComplimentOutfit]);
                                dialogue.setText(dialogues_bossyGoodCompliment[dialogueIndexComplimentOutfit]);
                            } else {

                                gettingToKnowIndex++;
                                if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                    diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                    dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                                } else {
                                    button_choice1.setVisibility(View.VISIBLE);
                                    button_choice1.setText(question1_date[0]);

                                    button_choice2.setVisibility(View.VISIBLE);
                                    button_choice2.setText(question1_date[1]);

                                    button_choice3.setVisibility(View.VISIBLE);
                                    button_choice3.setText(question1_date[2]);

                                    next.setEnabled(false);


                                }
                            }
                        }
                    });

                }



            }

        if (category_date.equals("rational")) {

            if (aura[0] < 5) {

                //Initialiser les dialogue
                diag_name.setText(namesDiag_rational_BadCompliment[dialogueIndexComplimentOutfit]);
                dialogue.setText(dialogues_rationalBadCompliment[dialogueIndexComplimentOutfit]);
                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_3", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_rational_BadCompliment.length) {
                            diag_name.setText(namesDiag_rational_BadCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_rationalBadCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }

            if (aura[0] == 5) {
                //Initialiser les dialogue
                dialogue.setText(dialogues_rationalGoodCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_rational_GoodCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_5", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);


                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_rational_GoodCompliment.length) {
                            diag_name.setText(namesDiag_rational_GoodCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_rationalGoodCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }

        }

        if (category_date.equals("charismatic")) {

            if (aura[0] < 5) {

                //Initialiser les dialogue
                dialogue.setText(dialogues_charismaticBadCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_charismatic_BadCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_3", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_charismatic_BadCompliment.length) {
                            diag_name.setText(namesDiag_charismatic_BadCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_charismaticBadCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }

            if (aura[0] == 5) {
                //Initialiser les dialogue
                dialogue.setText(dialogues_charismaticGoodCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_charismatic_GoodCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_5", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);


                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_charismatic_GoodCompliment.length) {
                            diag_name.setText(namesDiag_charismatic_GoodCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_charismaticGoodCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }

        }

        if (category_date.equals("cute")) {

            if (aura[0] < 5) {

                //Initialiser les dialogue
                dialogue.setText(dialogues_cuteBadCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_cute_BadCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_3", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_cute_BadCompliment.length) {
                            diag_name.setText(namesDiag_cute_BadCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_cuteBadCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }

            if (aura[0] == 5) {
                //Initialiser les dialogue
                dialogue.setText(dialogues_cuteGoodCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_cute_GoodCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_5", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);


                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_cute_GoodCompliment.length) {
                            diag_name.setText(namesDiag_cute_GoodCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_cuteGoodCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }


        }


        if (category_date.equals("adventurous")) {

            if (aura[0] < 5) {

                //Initialiser les dialogue
                dialogue.setText(dialogues_adventurousBadCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_adventurous_BadCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_3", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_adventurous_BadCompliment.length) {
                            diag_name.setText(namesDiag_adventurous_BadCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_adventurousBadCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }

            if (aura[0] == 5) {
                //Initialiser les dialogue
                dialogue.setText(dialogues_adventurousGoodCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_adventurous_GoodCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_5", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);


                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_adventurous_GoodCompliment.length) {
                            diag_name.setText(namesDiag_adventurous_GoodCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_adventurousGoodCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }


        }

        if (category_date.equals("fun")) {

            if (aura[0] < 5) {

                //Initialiser les dialogue
                dialogue.setText(dialogues_funBadCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_fun_BadCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_3", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_fun_BadCompliment.length) {
                            diag_name.setText(namesDiag_fun_BadCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_funBadCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }

            if (aura[0] == 5) {
                //Initialiser les dialogue
                dialogue.setText(dialogues_funGoodCompliment[dialogueIndexComplimentOutfit]);
                diag_name.setText(namesDiag_fun_GoodCompliment[dialogueIndexComplimentOutfit]);

                aura_pt.setText("Aura : " + aura[0]);
                int resId1 = getResources().getIdentifier("aura_5", "drawable", requireContext().getPackageName());
                barre_aura.setImageResource(resId1);


                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogueIndexComplimentOutfit++;

                        if (dialogueIndexComplimentOutfit < namesDiag_fun_GoodCompliment.length) {
                            diag_name.setText(namesDiag_fun_GoodCompliment[dialogueIndexComplimentOutfit]);
                            dialogue.setText(dialogues_funGoodCompliment[dialogueIndexComplimentOutfit]);
                        } else {

                            gettingToKnowIndex++;
                            if (gettingToKnowIndex < namesDiag_GettingToKnow.length) {
                                diag_name.setText(namesDiag_GettingToKnow[gettingToKnowIndex]);
                                dialogue.setText(dialogues_GettingToKnow[gettingToKnowIndex]);

                            } else {
                                button_choice1.setVisibility(View.VISIBLE);
                                button_choice1.setText(question1_date[0]);

                                button_choice2.setVisibility(View.VISIBLE);
                                button_choice2.setText(question1_date[1]);

                                button_choice3.setVisibility(View.VISIBLE);
                                button_choice3.setText(question1_date[2]);

                                next.setEnabled(false);


                            }
                        }
                    }
                });

            }


        }


            //BUTOTOOOOOOOOOOOOOOOOOON

            button_choice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    button_choice1.setVisibility(View.INVISIBLE);
                    button_choice2.setVisibility(View.INVISIBLE);
                    button_choice3.setVisibility(View.INVISIBLE);

                    if (category_date.equals("fun") || category_date.equals("adventurous")) {
                        dialogue.setText(diag_question1_datechoix1_good[0]);
                        diag_name.setText(name_question1_datechoix1_good[0]);

                        aura[0] = aura[0] + 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);



                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;

                                if (question_diag1Index < name_question1_datechoix1_good.length) {
                                    dialogue.setText(diag_question1_datechoix1_good[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix1_good[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);


                                }
                            }
                        });

                    }

                    if (category_date.equals("cute")) {
                        dialogue.setText(diag_question1_datechoix1_good[0]);
                        diag_name.setText(name_question1_datechoix1_good[0]);


                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;

                                if (question_diag1Index < name_question1_datechoix1_good.length) {
                                    dialogue.setText(diag_question1_datechoix1_good[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix1_good[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);


                                }
                            }
                        });

                    }

                    if (category_date.equals("charismatic") ||
                            category_date.equals("rational") ||
                            category_date.equals("chill") ||
                            category_date.equals("bossy")) {

                        dialogue.setText(diag_question1_datechoix1_bad[0]);
                        diag_name.setText(name_question1_datechoix1_bad[0]);

                        aura[0] = aura[0] - 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);



                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;

                                if (question_diag1Index < name_question1_datechoix1_bad.length) {
                                    dialogue.setText(diag_question1_datechoix1_bad[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix1_bad[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);


                                }
                            }
                        });

                    }


                }
            });


            button_choice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    button_choice1.setVisibility(View.INVISIBLE);
                    button_choice2.setVisibility(View.INVISIBLE);
                    button_choice3.setVisibility(View.INVISIBLE);

                    if (category_date.equals("rational") ||
                            category_date.equals("bossy")) {

                        dialogue.setText(diag_question1_datechoix2_good[0]);
                        diag_name.setText(name_question1_datechoix2_good[0]);

                        aura[0] = aura[0] + 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;
                                if (question_diag1Index < name_question1_datechoix2_good.length) {
                                    dialogue.setText(diag_question1_datechoix2_good[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix2_good[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }

                    if (category_date.equals("adventurous") ||
                            category_date.equals("charismatic") ||
                            category_date.equals("chill") ||
                            category_date.equals("fun")) {

                        dialogue.setText(diag_question1_datechoix2_good[0]);
                        diag_name.setText(name_question1_datechoix2_good[0]);


                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;
                                if (question_diag1Index < name_question1_datechoix2_good.length) {
                                    dialogue.setText(diag_question1_datechoix2_good[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix2_good[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }

                    if (category_date.equals("cute")) {

                        dialogue.setText(diag_question1_datechoix2_bad[0]);
                        diag_name.setText(name_question1_datechoix2_bad[0]);

                        aura[0] = aura[0] - 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;
                                if (question_diag1Index < name_question1_datechoix2_bad.length) {
                                    dialogue.setText(diag_question1_datechoix2_bad[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix2_bad[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }



                }
            });

            button_choice3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    button_choice1.setVisibility(View.INVISIBLE);
                    button_choice2.setVisibility(View.INVISIBLE);
                    button_choice3.setVisibility(View.INVISIBLE);

                    if (category_date.equals("cute") ||
                            category_date.equals("charismatic") ||
                            category_date.equals("chill")) {

                        dialogue.setText(diag_question1_datechoix3_good[0]);
                        diag_name.setText(name_question1_datechoix3_good[0]);

                        aura[0] = aura[0] + 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;
                                if (question_diag1Index < name_question1_datechoix2_good.length) {
                                    dialogue.setText(diag_question1_datechoix3_good[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix3_good[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }

                    if (category_date.equals("rational") ||
                            category_date.equals("bossy")) {

                        dialogue.setText(diag_question1_datechoix3_good[0]);
                        diag_name.setText(name_question1_datechoix3_good[0]);

                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;
                                if (question_diag1Index < name_question1_datechoix2_good.length) {
                                    dialogue.setText(diag_question1_datechoix3_good[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix3_good[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }

                    if (category_date.equals("fun") ||
                            category_date.equals("adventurous")) {

                        dialogue.setText(diag_question1_datechoix3_bad[0]);
                        diag_name.setText(name_question1_datechoix3_bad[0]);

                        aura[0] = aura[0] - 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next.setEnabled(true);
                        next.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_diag1Index++;
                                if (question_diag1Index < name_question1_datechoix3_bad.length) {
                                    dialogue.setText(diag_question1_datechoix3_bad[question_diag1Index]);
                                    diag_name.setText(name_question1_datechoix3_bad[question_diag1Index]);
                                } else {
                                    next.setEnabled(false);
                                    next.setText("End");
                                    next.setVisibility(View.INVISIBLE);


                                    next2.setEnabled(true);
                                    next2.setVisibility(View.VISIBLE);

                                }
                            }
                        });


                    }


                }
            });

            next2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gettingToKnowIndex2++;
                    if (gettingToKnowIndex2 < names_GettingToKnow2.length) {
                        diag_name.setText(names_GettingToKnow2[gettingToKnowIndex2]);
                        dialogue.setText(diag_GettingToKnow2[gettingToKnowIndex2]);

                    } else {
                        button_choice4.setVisibility(View.VISIBLE);
                        button_choice4.setText(question2_date[0]);

                        button_choice5.setVisibility(View.VISIBLE);
                        button_choice5.setText(question2_date[1]);

                        button_choice6.setVisibility(View.VISIBLE);
                        button_choice6.setText(question2_date[2]);

                        next2.setEnabled(false);
                    }
                }
            });




            //Faire la meme chose avec les boutons puis faire un gros bouton end date
            //qui calcul l'aura et renvoie vers le bon frag

            button_choice4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    button_choice4.setVisibility(View.INVISIBLE);
                    button_choice5.setVisibility(View.INVISIBLE);
                    button_choice6.setVisibility(View.INVISIBLE);

                    if (category_date.equals("rational") ||
                            category_date.equals("charismatic") ||
                            category_date.equals("bossy")) {

                        dialogue.setText(diag_question2_datechoix1_good[0]);
                        diag_name.setText(name_question2_datechoix1_good[0]);

                        aura[0] = aura[0] + 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next2.setEnabled(true);
                        next2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Question_diag2Index++;
                                if (Question_diag2Index < name_question2_datechoix1_good.length) {
                                    dialogue.setText(diag_question2_datechoix1_good[Question_diag2Index]);
                                    diag_name.setText(name_question2_datechoix1_good[Question_diag2Index]);
                                } else {
                                    next2.setEnabled(false);
                                    next2.setText("End");
                                    button_endDate.setVisibility(View.VISIBLE);


                                }
                            }
                        });

                    }

                    if (category_date.equals("cute") ||
                            category_date.equals("chill") ||
                            category_date.equals("fun")) {

                        dialogue.setText(diag_question2_datechoix1_good[0]);
                        diag_name.setText(name_question2_datechoix1_good[0]);


                        next2.setEnabled(true);
                        next2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Question_diag2Index++;
                                if (Question_diag2Index < name_question2_datechoix1_good.length) {
                                    dialogue.setText(diag_question2_datechoix1_good[Question_diag2Index]);
                                    diag_name.setText(name_question2_datechoix1_good[Question_diag2Index]);
                                } else {
                                    next2.setEnabled(false);
                                    next2.setText("End");
                                    button_endDate.setVisibility(View.VISIBLE);


                                }
                            }
                        });

                    }

                    if (category_date.equals("adventurous")) {

                        dialogue.setText(diag_question2_datechoix1_bad[0]);
                        diag_name.setText(name_question2_datechoix1_bad[0]);

                        aura[0] = aura[0] - 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next2.setEnabled(true);
                        next2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Question_diag2Index++;
                                if (Question_diag2Index < name_question2_datechoix1_bad.length) {
                                    dialogue.setText(diag_question2_datechoix1_bad[Question_diag2Index]);
                                    diag_name.setText(name_question2_datechoix1_bad[Question_diag2Index]);
                                } else {
                                    next2.setEnabled(false);
                                    next2.setText("End");
                                    button_endDate.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }


                }
            });

            button_choice5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    button_choice4.setVisibility(View.INVISIBLE);
                    button_choice5.setVisibility(View.INVISIBLE);
                    button_choice6.setVisibility(View.INVISIBLE);

                    if (category_date.equals("adventurous")) {

                        dialogue.setText(diag_question2_datechoix2_good[0]);
                        diag_name.setText(name_question2_datechoix2_good[0]);

                        aura[0] = aura[0] + 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next2.setEnabled(true);
                        next2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Question_diag2Index++;
                                if (Question_diag2Index < name_question2_datechoix2_good.length) {
                                    dialogue.setText(diag_question2_datechoix2_good[Question_diag2Index]);
                                    diag_name.setText(name_question2_datechoix2_good[Question_diag2Index]);
                                } else {
                                    next2.setEnabled(false);
                                    next2.setText("End");
                                    button_endDate.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }

                    if (category_date.equals("rational") ||
                            category_date.equals("chill") ||
                            category_date.equals("cute") ||
                            category_date.equals("fun") ||
                            category_date.equals("charismatic") ||
                            category_date.equals("bossy")) {

                        dialogue.setText(diag_question2_datechoix2_bad[0]);
                        diag_name.setText(name_question2_datechoix2_bad[0]);

                        aura[0] = aura[0] - 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next2.setEnabled(true);
                        next2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Question_diag2Index++;
                                if (Question_diag2Index < name_question2_datechoix2_bad.length) {
                                    dialogue.setText(diag_question2_datechoix2_bad[Question_diag2Index]);
                                    diag_name.setText(name_question2_datechoix2_bad[Question_diag2Index]);
                                } else {
                                    next2.setEnabled(false);
                                    next2.setText("End");
                                    button_endDate.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }

                }
            });

            button_choice6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    button_choice4.setVisibility(View.INVISIBLE);
                    button_choice5.setVisibility(View.INVISIBLE);
                    button_choice6.setVisibility(View.INVISIBLE);

                    if (category_date.equals("chill") ||
                            category_date.equals("cute") ||
                            category_date.equals("fun")) {

                        dialogue.setText(diag_question2_datechoix3_good[0]);
                        diag_name.setText(name_question2_datechoix3_good[0]);

                        aura[0] = aura[0] + 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next2.setEnabled(true);
                        next2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Question_diag2Index++;
                                if (Question_diag2Index < name_question2_datechoix3_good.length) {
                                    dialogue.setText(diag_question2_datechoix3_good[Question_diag2Index]);
                                    diag_name.setText(name_question2_datechoix3_good[Question_diag2Index]);
                                } else {
                                    next2.setEnabled(false);
                                    next2.setText("End");
                                    button_endDate.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }

                    if (category_date.equals("adventurous") ||
                            category_date.equals("bossy") ||
                            category_date.equals("charismatic")) {

                        dialogue.setText(diag_question2_datechoix3_good[0]);
                        diag_name.setText(name_question2_datechoix3_good[0]);

                        next2.setEnabled(true);
                        next2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Question_diag2Index++;
                                if (Question_diag2Index < name_question2_datechoix3_good.length) {
                                    dialogue.setText(diag_question2_datechoix3_good[Question_diag2Index]);
                                    diag_name.setText(name_question2_datechoix3_good[Question_diag2Index]);
                                } else {
                                    next2.setEnabled(false);
                                    next2.setText("End");
                                    button_endDate.setVisibility(View.VISIBLE);

                                }
                            }
                        });

                    }

                    if (category_date.equals("rational")) {

                        dialogue.setText(diag_question2_datechoix3_bad[0]);
                        diag_name.setText(name_question2_datechoix3_bad[0]);

                        aura[0] = aura[0] - 1;
                        aura_pt.setText("Aura : " + aura[0]);

                        // Construire dynamiquement le nom de l'image
                        String imageName = "aura_" + aura[0];
                        int resId = getResources().getIdentifier(imageName, "drawable", requireContext().getPackageName());
                        barre_aura.setImageResource(resId);

                        next2.setEnabled(true);
                        next2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Question_diag2Index++;
                                if (Question_diag2Index < name_question2_datechoix3_bad.length) {
                                    dialogue.setText(diag_question2_datechoix3_bad[Question_diag2Index]);
                                    diag_name.setText(name_question2_datechoix3_bad[Question_diag2Index]);
                                } else {
                                    next2.setEnabled(false);
                                    next2.setText("End");
                                    button_endDate.setVisibility(View.VISIBLE);

                                }
                            }
                        });


                    }


                }
            });


            //button end date to go to the 3 ending
        //Il manque le match comment page
        button_endDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aura[0] < 2) {
                    //Create an instance of the fragment
                    Trans_AloneEND_Frag fragmentTransAlone = new Trans_AloneEND_Frag();
                    //Creating an instance to exchange the fragment
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                    //We comit the transaction
                    transaction.replace(R.id.fragmentContainerView, fragmentTransAlone);
                    transaction.commit();
                } else if (aura[0]> 3) {
                    //Create an instance of the fragment
                    Trans_MatchEND_Frag fragmentTransMatch= new Trans_MatchEND_Frag();
                    //Creating an instance to exchange the fragment
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                    //We comit the transaction
                    transaction.replace(R.id.fragmentContainerView, fragmentTransMatch);
                    transaction.commit();


                } else {
                    //Create an instance of the fragment
                    Trans_FriendEND_Frag fragmentTransFriend= new Trans_FriendEND_Frag();
                    //Creating an instance to exchange the fragment
                    FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                    //We comit the transaction
                    transaction.replace(R.id.fragmentContainerView, fragmentTransFriend);
                    transaction.commit();


                }
            }
        });



        return view;
    }

}
