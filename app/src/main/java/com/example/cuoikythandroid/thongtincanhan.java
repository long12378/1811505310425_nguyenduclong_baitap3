package com.example.cuoikythandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class thongtincanhan extends AppCompatActivity {
    ImageView thoat_425;
    TextView txt_doithongtin_425;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1. Nút thoát: quay về trang TaiKhoanFragment
        setContentView(R.layout.activity_thongtincanhan);
        thoat_425=findViewById(R.id.thoat_425);
        thoat_425.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTaiKhoanFragment();
            }
        });
        //2. Nút đổi thông tin, chuyển sang trang SuaThongTin

    }
    //1
    public void openTaiKhoanFragment(){
        Intent intent=new Intent(thongtincanhan.this, Taikhoanactivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
    //2

}