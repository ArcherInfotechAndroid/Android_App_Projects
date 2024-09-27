package com.ArcherInfotech.tutionapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Login_signUp extends AppCompatActivity {
    FrameLayout frameLayout;
    AppCompatButton userbtn,adminbtn;
    FragmentManager fragmentManager= getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_sign_up);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frame);

        fragmentManager.beginTransaction().replace(R.id.frame,new User_Login()).commit();



        userbtn = findViewById(R.id.userbtn);
        adminbtn = findViewById(R.id.adminbtn);




        userbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.frame,new User_Login()).commit();
                userbtn.setTextColor(getResources().getColor(R.color.ternary));
                adminbtn.setTextColor(getResources().getColor(R.color.primary));
            }
        });

        adminbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.frame,new Admin_login() ).commit();
                adminbtn.setTextColor(getResources().getColor(R.color.ternary));
                userbtn.setTextColor(getResources().getColor(R.color.primary));
            }
        });

    }
}