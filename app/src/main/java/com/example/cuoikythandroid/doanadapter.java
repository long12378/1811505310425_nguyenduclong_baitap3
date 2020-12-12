package com.example.cuoikythandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class doanadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<sanphamdoan> doanlist;

    public doanadapter(Context context, int layout, List<sanphamdoan> doanlist) {
        this.context = context;
        this.layout = layout;
        this.doanlist = doanlist;
    }

    @Override
    public int getCount() {
        return doanlist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView tenda = (TextView)view.findViewById(R.id.tensanpham425);
        ImageView imgda = (ImageView)view.findViewById(R.id.imagesanpham425);
        TextView giada = (TextView)view.findViewById(R.id.giasp425);
        sanphamdoan da =doanlist.get(position);
        tenda.setText(da.getName());
        imgda.setImageResource(da.getAnh());
        giada.setText(da.getGia());
        return view;
    }

}
