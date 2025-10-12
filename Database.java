package com.example.anew;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;

import java.util.ArrayList;
import java.util.List;

public class DataBaseID extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ma_base.db";
    private static final int DATABASE_VERSION = 8;
    public static final String TABLE_NAME = "personnes";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "nom";
    public static final String COLUMN_CATEGORY_TO_DATE = "categorieTodate";
    public static final String COLUMN_CATEGORY = "categorie";
    public static final String COLUMN_MBTI = "MBTI";
    public static final String COLUMN_GENDER = "gender";
    public static final String COLUMN_GENDER_ATTRACTED_TO = "genderAttractedTo";
    public static final String COLUMN_QUOTE = "quote";
    public static final String COLUMN_ID_PHOTO = "photo";

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT, " +
                    COLUMN_CATEGORY + " TEXT, " +
                    COLUMN_MBTI + " TEXT, " +
                    COLUMN_GENDER + " TEXT, " +
                    COLUMN_GENDER_ATTRACTED_TO + " TEXT, " +
                    COLUMN_CATEGORY_TO_DATE + " TEXT, " +
                    COLUMN_QUOTE + " TEXT, " +
                    COLUMN_ID_PHOTO + " TEXT );";

    public DataBaseID(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);

        insertData(db, "Aurian M", "rational", "adventurous", "ISTJ", "male", "female", "Already took, but let see if someone match with me with your app", "aurian");
        insertData(db, "Gabriel C", "chill", "cute", "ENTP", "male", "both", "Where is my partener !!", "gabriel");
        insertData(db, "Joanne A", "fun", "fun", "INFJ", "female", "male", "On récolte ce que l’on sème, periodt", "joanne");
        insertData(db, "Neyla M", "charismatic", "fun", "ENFP", "female", "both", "I know how to cook", "neyla");
        insertData(db, "Natasha L" , "adventurous", "fun", "INFJ", "female", "both", "live laugh love", "natasha");
        insertData(db, "Tiphaine B", "cute", "fun", "ISTJ", "female", "both", "J’aime les pompiers", "tiphaine");
        insertData(db, "Raphael G", "chill", "cute", "INTJ", "male", "female", "There can be good and joy in anything", "raphael_g");
        insertData(db, "Louna L", "fun", "rational", "ENTP", "female", "both", "crise de charisme", "louna");
        insertData(db, "Appoline B", "adventurous", "adventurous", "ENTJ", "female", "male", "100% ingénieur, 100% designer, 100% slayeur", "appoline");
        insertData(db, "Lou G", "rational", "fun", "ENFJ", "female", "male", "Qui fait l’imbecile aura à faire à Cecile", "lou");
        insertData(db, "Noemie V", "charismatic", "fun", "INFJ", "female", "both", "looking for competent male", "noemie");
        insertData(db, "Aymalee B", "bossy", "fun", "ENTJ", "male", "female", "Je suis tout mignon me foutais pas dans une catégorie de fou", "aymalee");
        insertData(db,"Maëva R","cute","fun","INFP","female","both","I can be your mommy if you want :)","maeva");
        insertData(db, "Aurore B", "fun", "fun", "ENFP", "female", "male", "I feel everything 10000% so if you find someone who suits me I'll marry him this week by the water! Oh and yes he has to be a fucking smile and look!! Kisses",  "aurore");
        insertData(db,"Julia J","fun","chill","ENFJ","female","male","she's just like the wind","julia");
        insertData(db, "Mahdi J", "fun", "charismatic", "ISFP", "male", "female", "Planning on a fresh new hair cut (mulet cuz girls like it ;p)", "mahdi");
        insertData(db,"Henry A","chill","bossy","INTP","male","both","Un gros doigt dans l’cul ça réveille ça c’est sûr","henry");
        insertData(db,"Hadil M","adventurous","adventurous", "INFP", "female","both","Let's explore the word together !","hadil");
        insertData(db, "Raphaelle L", "fun", "adventurous", "ENFP", "female", "female","I’m a blondy but not inside !! I love sport, cars and being in love !", "raphaelle_l");
        insertData(db, "Lala R", "bossy", "chill", "INTP", "female", "both","Kongolese sous BBL", "lala");
        insertData(db, "Cassandre", "bossy", "adventurous", "ENTJ", "female", "male"," Cheers", "cassandre");
        insertData(db, "Mathis D", "adventurous", "fun", "ENFJ", "male", "female","做得好唯一的方式是热爱你所做的事 - Steve Jobs", "mathis");
        insertData(db, "Matti T", "chill", "chill", "INTP", "male", "female","Love laugh live :)", "matti");
        insertData(db, "Chatty <3", "rational", "adventurous", "INTJ", "male", "both", "Seek clarity, speak truth — but always leave room for wonder.", "chatgpt");
        insertData(db, "Elian M", "adventurous","cute","ENTJ","male","female","Vous êtes tebé, vous allez faire crashez des avions","elian");
        insertData(db, "Marion S","bossy","fun","ENTJ","female","both","Marions nous","marion");
        insertData(db, "Thomas G","adventurous","fun","ENFP","male","female","C’est parce que je suis roux","thomas");
        insertData(db,"Ravaka R","adventurous","fun","INTJ","female","both","Do it for memories","ravaka");
        insertData (db,"Marien B","adventurous","adventurous","ENTP","male", "female","I’m seductive, beautiful, strong, … see more ","marien") ;
        insertData(db,"Emilien J","rational","charismatic","INTP","male","female","I'm Mr.Miaou I need a kitten for my databaise","emilien") ;
        insertData(db, "Capitain Sass", "adventurous","cute","ENTJ","female","both","Face à l'adversité l'ignorant fuit et le créatif se réjouit","sass");
        insertData(db, "Qiong L","cute","cute","INFJ","female","male","I like cats","qiong");
    }

    private void insertData(SQLiteDatabase db, String nom, String categorie, String categorieTodate,
                            String MBTI, String gender, String genderAttractedTo,
                            String quote, String photo) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, nom);
        values.put(COLUMN_CATEGORY, categorie);
        values.put(COLUMN_CATEGORY_TO_DATE, categorieTodate);
        values.put(COLUMN_MBTI, MBTI);
        values.put(COLUMN_GENDER, gender);
        values.put(COLUMN_GENDER_ATTRACTED_TO, genderAttractedTo);
        values.put(COLUMN_QUOTE, quote);
        values.put(COLUMN_ID_PHOTO, photo);
        db.insert(TABLE_NAME, null, values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public List<Person> getAllPeople() {
        List<Person> peopleList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow(COLUMN_ID));
                String name = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NAME));
                String category = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_CATEGORY));
                String categoryToDate = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_CATEGORY_TO_DATE));
                String MBTI = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_MBTI));
                String gender = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_GENDER));
                String genderAttractedTo = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_GENDER_ATTRACTED_TO));
                String quote = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_QUOTE));
                String photo = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_ID_PHOTO));

                peopleList.add(new Person(id, name, category, categoryToDate, MBTI, gender, genderAttractedTo, quote, photo));
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return peopleList;
    }
}
