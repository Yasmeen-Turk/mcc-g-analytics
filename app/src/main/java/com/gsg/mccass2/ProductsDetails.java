package com.gsg.mccass2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductsDetails extends AppCompatActivity {

    String shName,shImg,shDetails,shPrice,burName,burImg,burDetails,burPrice,pizName,pizImg,pizDetails,pizPrice;
    ImageView proimg;
    TextView proName,proDetails,proPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_details);
        Intent i = getIntent();
        Intent s = getIntent();
        Intent d = getIntent();
        ///// Food
        shName = i.getStringExtra("sha_name");
        shImg = i.getStringExtra("sha_img");
        shDetails = i.getStringExtra("sha_details");
        shPrice = i.getStringExtra("sha_price");

        burName = s.getStringExtra("burger_name");
        burImg = s.getStringExtra("burger_img");
        burDetails = s.getStringExtra("burger_details");
        burPrice = s.getStringExtra("burger_price");

        pizName = d.getStringExtra("pizza_name");
        pizImg = d.getStringExtra("pizza_img");
        pizDetails = d.getStringExtra("pizza_details");
        pizPrice = d.getStringExtra("pizza_price");

//        proimg = findViewById(R.id.proImg);
//        proName = findViewById(R.id.proName);
//        proDetails = findViewById(R.id.proDetails);
//        proPrice = findViewById(R.id.proPrice);
//
//        proimg = findViewById(R.id.proImg);
//        proName = findViewById(R.id.proName);
//        proDetails = findViewById(R.id.proDetails);
//        proPrice = findViewById(R.id.proPrice);

        proimg = findViewById(R.id.proImg);
        proName = findViewById(R.id.proName);
        proDetails = findViewById(R.id.proDetails);
        proPrice = findViewById(R.id.proPrice);

        proName.setText(shName);
        proDetails.setText(shDetails);
        proPrice.setText(shPrice);

        proName.setText(burName);
        proDetails.setText(burDetails);
        proPrice.setText(burPrice);

        proName.setText(pizName);
        proDetails.setText(pizDetails);
        proPrice.setText(pizPrice);
}
}