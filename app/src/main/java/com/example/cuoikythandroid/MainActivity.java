package com.example.cuoikythandroid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation425);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container425, new newsactivity()).commit();

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment =   null;
            switch (item.getItemId()){
                case R.id.news425:
                    selectedFragment=new newsactivity();
                    break;
                case R.id.order425:
                    selectedFragment=new Dathangactivity();
                    break;
//                case R.id.shop425:
//                    selectedFragment=new Cuahangactivity();
//                    break;
                case R.id.account425:
                    selectedFragment=new Taikhoanactivity();
                    break;
                default:break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container425,selectedFragment).commit();
            return true;
        }
    };
}
