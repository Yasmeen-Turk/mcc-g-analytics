package com.gsg.mccass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.analytics.FirebaseAnalytics;

public class FoodList extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    ImageView shawermaImage;
    ImageView burgerImage;
    ImageView pizzaImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
       shawermaImage = findViewById(R.id.shImage);
        burgerImage = findViewById(R.id.burgerImg);
        pizzaImage = findViewById(R.id.pizzaImg);

        screenTrackk("food list");


    }



    public void shawermaDetails(View view) {

        select("1","shawerma","text");

        Intent i = new Intent(getApplicationContext(),ProductsDetails.class);
        i.putExtra("sha_name","Shawerma");
        i.putExtra("sha_img", String.valueOf(shawermaImage));
        i.putExtra("sha_details","Shawarma is thinly sliced cuts of meat, like chicken, beef, goat, lamb, and sometimes turkey rolled ");
        i.putExtra("sha_price","8$");
        startActivity(i);
    }

    public void burgerDetails(View view) {
        select("2","burger","text");
        Intent s = new Intent(getApplicationContext(),ProductsDetails.class);
        s.putExtra("burger_name","Burger");
        s.putExtra("burger_img", String.valueOf(burgerImage));
        s.putExtra("burger_details","Burger has bread and beef or chicken and tomato , Potato, cheese, cucumber , lettuce and ketchup ");
        s.putExtra("burger_price","15$");
        startActivity(s);
    }

    public void pizzaDetails(View view) {
        select("3","pizza","text");

        Intent d = new Intent(getApplicationContext(),ProductsDetails.class);
        d.putExtra("pizza_name","Pizza");
        d.putExtra("pizza_img", String.valueOf(pizzaImage));
        d.putExtra("pizza_details","Pizza is dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients ");
        d.putExtra("pizza_price","20$");
        startActivity(d);
    }
    void select(String id, String name,String contentType){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, contentType);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
   void screenTrackk(String screenName) {
       Bundle bundle = new Bundle();
       bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, screenName);
       bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, "FoodList");
       mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
    }
}