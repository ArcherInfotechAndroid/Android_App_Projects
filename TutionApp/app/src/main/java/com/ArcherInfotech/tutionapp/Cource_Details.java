package com.ArcherInfotech.tutionapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cource_Details extends AppCompatActivity {

    TextView courceTitle1,courceTitle2,courcepoint1,courcepoint2,courcepoint3,courcepoint4,courcepoint5,
            courcepoint6,courcepoint7,courcepoint8,courcepoint9,courcepoint10;

    TextView instructername,instruinto1,instruinto2,instruinto3,instruinto4,fees;

    ImageView insProfImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cource_details);


        //Cource name Id
        courceTitle1 = findViewById(R.id.courcename1);
        courceTitle2 = findViewById(R.id.courcename2);

        //points Id
        courcepoint1 = findViewById(R.id.point1);
        courcepoint2 = findViewById(R.id.point2);
        courcepoint3 = findViewById(R.id.point3);
        courcepoint4 = findViewById(R.id.point4);
        courcepoint5 = findViewById(R.id.point5);
        courcepoint6 = findViewById(R.id.point6);
        courcepoint7 = findViewById(R.id.point7);
        courcepoint8 = findViewById(R.id.point8);
        courcepoint9 = findViewById(R.id.point9);
        courcepoint10 = findViewById(R.id.point10);

        //instructors id
        instructername = findViewById(R.id.instructername);
        instruinto1 = findViewById(R.id.instructerinfo1);
        instruinto2 = findViewById(R.id.instructerinfo2);
        instruinto3 = findViewById(R.id.instructerinfo4);
        instruinto4 = findViewById(R.id.instructerinfo4);

        insProfImg = findViewById(R.id.instructerimg);


        //fees
        fees = findViewById(R.id.feestext);

        //Coucres name
        String titleOne = getIntent().getStringExtra("Cource_Name_One");
        String titleTwo = getIntent().getStringExtra("Cource_Name_Two");


        //Cources points
        String coureP1 = getIntent().getStringExtra("Cource_Point_One");
        String coureP2 = getIntent().getStringExtra("Cource_Point_Two");
        String coureP3 = getIntent().getStringExtra("Cource_Point_Three");
        String coureP4 = getIntent().getStringExtra("Cource_Point_Four");
        String coureP5 = getIntent().getStringExtra("Cource_Point_Five");
        String coureP6 = getIntent().getStringExtra("Cource_Point_Six");
        String coureP7 = getIntent().getStringExtra("Cource_Point_Seven");
        String coureP8 = getIntent().getStringExtra("Cource_Point_Eight");
        String coureP9 = getIntent().getStringExtra("Cource_Point_Nine");
        String coureP10 = getIntent().getStringExtra("Cource_Point_Ten");

        //Instructer
        String instructernm = getIntent().getStringExtra("Instructer_name");
        String instructerdetail1 = getIntent().getStringExtra("Instructer_detail_one");
        String instructerdetail2 = getIntent().getStringExtra("Instructer_detail_one");
        String instructerdetail3 = getIntent().getStringExtra("Instructer_detail_one");
        String instructerdetail4 = getIntent().getStringExtra("Instructer_name");

        //fees
        String courceFees = getIntent().getStringExtra("Cource_Fees");

        //Coucre name
        courceTitle1.setText(titleOne);
        courceTitle2.setText(titleTwo);

        //cource point
        courcepoint1.setText(coureP1);
        courcepoint2.setText(coureP2);
        courcepoint3.setText(coureP3);
        courcepoint4.setText(coureP4);
        courcepoint5.setText(coureP5);
        courcepoint6.setText(coureP6);
        courcepoint7.setText(coureP7);
        courcepoint8.setText(coureP8);
        courcepoint9.setText(coureP9);
        courcepoint10.setText(coureP10);

        //Instructer
        instructername.setText(instructernm);
        instruinto1.setText(instructerdetail1);
        instruinto2.setText(instructerdetail2);
        instruinto3.setText(instructerdetail3);
        instruinto4.setText(instructerdetail4);

        //Fess
        fees.setText(courceFees);
    }
}