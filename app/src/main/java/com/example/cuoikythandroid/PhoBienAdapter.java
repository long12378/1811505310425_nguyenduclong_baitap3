package com.example.cuoikythandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cuoikythandroid.R;

import java.util.ArrayList;

public class PhoBienAdapter extends BaseAdapter {

    Context context;
    ArrayList<PhoBienModel> phobienData;
    LayoutInflater layoutInflater;
    PhoBienModel phobien;

    public PhoBienAdapter(Context context, ArrayList<PhoBienModel> phobienData) {
        this.context = context;
        this.phobienData = phobienData;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return phobienData.size();
    }

    @Override
    public Object getItem(int i) {
        return phobienData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return phobienData.get(i).getId_425();
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View view1 = view;

        if (view1 == null) {
            view1 = layoutInflater.inflate(R.layout.list_phobien, null, true);

        }

        ImageView sanpham_425 = view1.findViewById(R.id.sanpham_425);
        TextView tensanpham_425 = view1.findViewById(R.id.tensanpham_425);
        TextView gia_425 = view1.findViewById(R.id.gia_425);

        phobien = phobienData.get(position);

        sanpham_425.setImageResource(phobien.getSanpham_425());
        tensanpham_425.setText(phobien.getTensanpham_425());
        gia_425.setText(phobien.getGia_425());


        return view1;
    }
}
