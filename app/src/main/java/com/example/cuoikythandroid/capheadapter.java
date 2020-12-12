package com.example.cuoikythandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class capheadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<caphe> caphelist;

    public capheadapter(Context context, int layout, List<caphe> caphelist) {
        this.context = context;
        this.layout = layout;
        this.caphelist = caphelist;
    }

    @Override
    public int getCount() {
        return caphelist.size();
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
        TextView tencf = (TextView)view.findViewById(R.id.tensanpham425);
        ImageView imgcf = (ImageView)view.findViewById(R.id.imagesanpham425);
        TextView giacf = (TextView)view.findViewById(R.id.giasp425);
       caphe cf =caphelist.get(position);
        tencf.setText(cf.getName());
        imgcf.setImageResource(cf.getAnh());
        giacf.setText(cf.getGia());
        return view;
    }

}
