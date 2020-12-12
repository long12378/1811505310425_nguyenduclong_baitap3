package com.example.cuoikythandroid;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.cuoikythandroid.ui.main.SectionPagerAdapter;

import com.example.cuoikythandroid.PhoBienFragment;
import com.example.cuoikythandroid.doan;
import com.example.cuoikythandroid.doan;
import com.example.cuoikythandroid.R;
import com.google.android.material.tabs.TabLayout;

public class Dathangactivity extends Fragment {

//    View myFragment;
//    ViewPager viewPager;
//    TabLayout tabLayout;
//
//
//    public Dathangactivity() {
//        // Required empty public constructor
//    }
//
//    public static Dathangactivity getInstance() {
//        return new Dathangactivity();
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        myFragment = inflater.inflate(R.layout.activity_dathangactivity, container, false);
//        viewPager = myFragment.findViewById(R.id.viewPager);
//        tabLayout = myFragment.findViewById(R.id.tabLayout);
//        return myFragment;
//    }
//    //Call onActivity Create method
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        setUpViewPager(viewPager);
//        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//            }
//        });
//    }
//
//    private void setUpViewPager(ViewPager viewPager) {
//        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());
//
//        adapter.addFragment(new PhoBienFragment(), "Phổ biến");
//        adapter.addFragment(new thucuong(), "Thức uống");
//        adapter.addFragment(new doan(), "Đồ ăn");
//        viewPager.setAdapter(adapter);
//    }
View myFragment;
    ViewPager viewPager;
    TabLayout tabLayout;


    public Dathangactivity() {
        // Required empty public constructor
    }

    public static Dathangactivity getInstance() {
        return new Dathangactivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myFragment = inflater.inflate(R.layout.activity_dathangactivity, container, false);
        viewPager = myFragment.findViewById(R.id.viewPager);
        tabLayout = myFragment.findViewById(R.id.tabLayout);
        return myFragment;
    }
    //Call onActivity Create method

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new PhoBienFragment(), "Phổ biến");
        adapter.addFragment(new thucuong(), "Thức Uống");
        adapter.addFragment(new doan(), "Đồ ăn");
        viewPager.setAdapter(adapter);
    }
}