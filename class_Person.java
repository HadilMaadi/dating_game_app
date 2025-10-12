package com.example.datingappmp;
import com.example.datingappmp.DataBaseID;


public class Person {
    int id;
    String name;
    public String category;
    public String categoryToDate;
    public String mbti;
    public String gender;
    public String genderAttractedTo;
    public String quote;
    public String photo;

    public Person(int id, String name, String category, String categoryToDate, String mbti,
                  String gender, String genderAttractedTo, String quote, String photo) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.categoryToDate = categoryToDate;
        this.mbti = mbti;
        this.gender = gender;
        this.genderAttractedTo = genderAttractedTo;
        this.quote = quote;
        this.photo = photo;
    }

    // Optionnel : toString() pour affichage facile
    @Override
    public String toString() {
        return name + " " + gender + " " + category + " " + categoryToDate + " " + mbti + " " + genderAttractedTo ;
        //return name + " " + gender + " " + genderAttractedTo + " " + category;
    }
}
