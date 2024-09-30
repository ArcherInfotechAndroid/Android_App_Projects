package com.ArcherInfotech.tutionapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ArcherInfotech.tutionapp.Adaptor.CourceAdaptor;
import com.ArcherInfotech.tutionapp.Listener.ItemClickListner;
import com.ArcherInfotech.tutionapp.Modal.Cources;

import java.util.ArrayList;
import java.util.List;

public class cource_list extends AppCompatActivity implements ItemClickListner {

    RecyclerView recyclerView;
    private List<Cources> courcesList;
    private CourceAdaptor myadptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.cource_list);

        recyclerView = findViewById(R.id.recyclerview);
        courcesList = new ArrayList<>();

        courcesList.add(new Cources("C Programming","3 Months",R.drawable.rating,R.drawable.cbg,R.drawable.c));
        courcesList.add(new Cources("C++ Programming","3 Months",R.drawable.rating,R.drawable.shape,R.drawable.cpp));
        courcesList.add(new Cources("Java Programming","4 Months",R.drawable.rating,R.drawable.javabg,R.drawable.javanew));
        courcesList.add(new Cources("Structure Query Language(SQL)","2 Months",R.drawable.rating,R.drawable.sqlbg,R.drawable.sql));
        courcesList.add(new Cources("Web-Development","2 Months",R.drawable.rating,R.drawable.cbg,R.drawable.web_devlopment));
        courcesList.add(new Cources("Artificiali-Intelligence","6 Months",R.drawable.rating,R.drawable.shape,R.drawable.artificialintelligence));
        courcesList.add(new Cources("Data-Science","6 Months",R.drawable.rating,R.drawable.javabg,R.drawable.datascience));
        courcesList.add(new Cources("Testing","3 Months",R.drawable.rating,R.drawable.sample,R.drawable.testing));


        courcesList.add(new Cources("C Programming","3 Months",R.drawable.rating,R.drawable.cbg,R.drawable.c));
        courcesList.add(new Cources("C++ Programming","3 Months",R.drawable.rating,R.drawable.shape,R.drawable.cpp));
        courcesList.add(new Cources("Java Programming","4 Months",R.drawable.rating,R.drawable.javabg,R.drawable.javanew));
        courcesList.add(new Cources("Structure Query Language(SQL)","2 Months",R.drawable.rating,R.drawable.sqlbg,R.drawable.sql));
        courcesList.add(new Cources("Web-Development","2 Months",R.drawable.rating,R.drawable.cbg,R.drawable.web_devlopment));
        courcesList.add(new Cources("Artificiali-Intelligence","6 Months",R.drawable.rating,R.drawable.shape,R.drawable.artificialintelligence));
        courcesList.add(new Cources("Data-Science","6 Months",R.drawable.rating,R.drawable.javabg,R.drawable.datascience));
        courcesList.add(new Cources("Testing","3 Months",R.drawable.rating,R.drawable.sample,R.drawable.testing));

        courcesList.add(new Cources("C Programming","3 Months",R.drawable.rating,R.drawable.cbg,R.drawable.c));
        courcesList.add(new Cources("C++ Programming","3 Months",R.drawable.rating,R.drawable.shape,R.drawable.cpp));
        courcesList.add(new Cources("Java Programming","4 Months",R.drawable.rating,R.drawable.javabg,R.drawable.javanew));
        courcesList.add(new Cources("Structure Query Language(SQL)","2 Months",R.drawable.rating,R.drawable.sqlbg,R.drawable.sql));
        courcesList.add(new Cources("Web-Development","2 Months",R.drawable.rating,R.drawable.cbg,R.drawable.web_devlopment));
        courcesList.add(new Cources("Artificiali-Intelligence","6 Months",R.drawable.rating,R.drawable.shape,R.drawable.artificialintelligence));
        courcesList.add(new Cources("Data-Science","6 Months",R.drawable.rating,R.drawable.javabg,R.drawable.datascience));
        courcesList.add(new Cources("Testing","3 Months",R.drawable.rating,R.drawable.sample,R.drawable.testing));


        myadptor = new CourceAdaptor(courcesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadptor);

        myadptor.setClickListner(this);
    }

    @Override
    public void onClick(View v, int pos) {

        Cources selectCource = courcesList.get(pos);

        Toast.makeText(this,"You Chose" +selectCource.getCourceName(),Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(cource_list.this,Cource_Details.class);
        intent.putExtra("Cource_Name_One",selectCource.getCourceName());

        startActivity(intent);
    }
}