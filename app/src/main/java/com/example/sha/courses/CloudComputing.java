package com.example.sha.courses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.sha.R;
import com.example.sha.internship.InternAdapter;
import com.example.sha.internship.InternHelperClass;
import com.example.sha.mainpage.HomeActivity;
import com.example.sha.mainpage.SearchFragment;

import java.util.ArrayList;
import java.util.List;

public class CloudComputing extends AppCompatActivity {

    RecyclerView cloudView;
    RecyclerView.Adapter adapter;
    ImageView cloudToHome;
    List<InternHelperClass> internLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_computing);


        cloudToHome = findViewById(R.id.cloud_to_course);
        cloudToHome.setOnClickListener(view -> {
            Intent backToHomeAll = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(backToHomeAll);
        });


        cloudView = findViewById(R.id.cloudComputing_Recycler);

        internLocations = new ArrayList<>();

        cloudView.setHasFixedSize(true);
        cloudView.setLayoutManager(new GridLayoutManager(this,1));

        internLocations.add(new InternHelperClass(R.drawable.bigdata,"Big Data Hadoop Architecture","sine raja", 3.5f,"\u20B94500"));
        internLocations.add(new InternHelperClass(R.drawable.bigsolutions,"Big Data Hadoop solutions Architecture","sine raja", 5f,"\u20B94500"));
        internLocations.add(new InternHelperClass(R.drawable.mangodevreloper,"MangoDB Developer and Administration","sine raja",  4.5f,"\u20B94500"));
        internLocations.add(new InternHelperClass(R.drawable.businessarch,"Big Data Hadoop solutions Architecture","sine raja",  4f,"\u20B94500"));
        internLocations.add(new InternHelperClass(R.drawable.integrated,"Integrated program in Data Science & Big Data","sine raja",  4f,"\u20B94500"));
        internLocations.add(new InternHelperClass(R.drawable.dswithsas,"Data Science with SAS","sine raja",  4f,"\u20B94500"));
        internLocations.add(new InternHelperClass(R.drawable.dswithpython,"Data Science with python","sine raja",  4f,"\u20B94500"));
        internLocations.add(new InternHelperClass(R.drawable.datasciencer,"Data Science with R","sine raja",  4f,"\u20B94500"));
        internLocations.add(new InternHelperClass(R.drawable.datascience,"Data Science","sine raja",  4f,"\u20B94500"));


        InternAdapter adapter = new InternAdapter(this, internLocations);
        cloudView.setAdapter(adapter);



    }
}