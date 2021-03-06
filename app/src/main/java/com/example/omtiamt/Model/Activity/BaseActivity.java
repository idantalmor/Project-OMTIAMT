package com.example.omtiamt.Model.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import android.os.Bundle;
import android.view.View;
import com.example.omtiamt.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BaseActivity extends AppCompatActivity {
    NavController navCtl;
    public static BottomNavigationView navigationView;
    public static final BaseActivity instance = new BaseActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        NavHost navHost = (NavHost)getSupportFragmentManager().findFragmentById(R.id.base_navhost);
        navCtl = navHost.getNavController();

        // Bottom Navigation Bar
        navigationView = findViewById(R.id.bottom_navigation_id);
        navigationView.setSelectedItemId(R.id.nav_home);
        navigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                // Home Page Button
                case R.id.nav_home:
                    navCtl.navigate(R.id.action_global_homeFragment);
                    break;
                // New Product Button
                case R.id.nav_add:
                    navCtl.navigate(R.id.action_global_newProductFragment);
                    break;
                // Profile Page Button
                case R.id.nav_profile: ;
                    navCtl.navigate(R.id.action_global_profileFragment);
                    break;
            }
            return true;
        });
    }
    public static void hideTabBar() {
        navigationView.setVisibility(View.GONE);
    }
    public static void showTabBar(){
        navigationView.setVisibility(View.VISIBLE);
    }

}