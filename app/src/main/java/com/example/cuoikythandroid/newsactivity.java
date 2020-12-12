package com.example.cuoikythandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class newsactivity extends Fragment {
    private ImageView orderbtn;
    private ImageView option;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_newsactivity,container,false);
        //        View view = inflater.inflate(R.layout.activity_newsactivity,container,false);
//        orderbtn = (ImageView) view.findViewById(R.id.orderbtn);
//        orderbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),MenuApp.class);
//                startActivity(intent);
//            }
//        });
//        return view;
    }
}