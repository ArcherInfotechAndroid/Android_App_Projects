package com.ArcherInfotech.tutionapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;


import com.ArcherInfotech.tutionapp.Adapter.ImageSliderAdapter;

public class Login_signUp extends AppCompatActivity {
    FrameLayout frameLayout;
    AppCompatButton userbtn,adminbtn;
    private int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable runnable;
    LinearLayout linearLayout,dotsLayout;
    private int numOfFragments = 3;
    ViewPager2 viewPager2;
    private ImageView[] dots;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        setContentView(R.layout.activity_login_sign_up);

        fragmentManager= getSupportFragmentManager();
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frame);
         fragment = fragmentManager.findFragmentById(R.id.frame);
        if (fragment == null) {
            fragmentManager.beginTransaction().replace(R.id.frame, new User_Login()).commit();
        }
        fragmentManager.beginTransaction().replace(R.id.frame,new User_Login()).commit();


        
        userbtn = findViewById(R.id.userbtn);
        adminbtn = findViewById(R.id.adminbtn);
        viewPager2 = findViewById(R.id.studentimg);
        ImageSliderAdapter adapter = new ImageSliderAdapter(this);
        viewPager2.setAdapter(adapter);



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

    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable); // Stop auto-scroll when the activity is destroyed
    }
}