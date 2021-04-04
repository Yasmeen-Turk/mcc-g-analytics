package com.gsg.mccass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    Button foodBtn;
    Button clothesBtn;
    Button electronicBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        foodBtn = findViewById(R.id.food);
        clothesBtn = findViewById(R.id.clothes);
        electronicBtn = findViewById(R.id.electronic);
        screenTrackk("main Activity");

    }

    public void foodScreen(View view) {
        select("1","food","image");
        Intent foodList = new Intent(getApplicationContext(), FoodList.class);
        startActivity(foodList);
    }

    public void clothesScreen(View view) {
        select("2","clothes","image");
        Intent clothesList = new Intent(getApplicationContext(), ClothesList.class);
        startActivity(clothesList);
    }

    public void electronicScreen(View view) {
        select("3","electronic","image");
        Intent electronicList = new Intent(getApplicationContext(), ElectronicList.class);
        startActivity(electronicList);
    }

    void select(String id, String name,String contentType){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, contentType);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    void screenTrackk(String screenName){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, screenName);
        bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, "MainActivity");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
    }
}