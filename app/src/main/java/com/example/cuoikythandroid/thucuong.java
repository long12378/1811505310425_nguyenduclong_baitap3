package com.example.cuoikythandroid;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link thucuong#newInstance} factory method to
 * create an instance of this fragment.
 */
public class thucuong extends Fragment {
    Context context;
    GridView gvcf;
    ArrayList<caphe> arrcf;
    capheadapter adapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public thucuong() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment thucuong.
     */
    // TODO: Rename and change types and number of parameters
    public static thucuong newInstance(String param1, String param2) {
        thucuong fragment = new thucuong();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        View root= inflater.inflate(R.layout.thucuong_layout, container, false);
        gvcf = (GridView) root.findViewById(R.id.gridcaphe425);
        anhxa();
        adapter = new capheadapter(context,R.layout.itemsanpham,arrcf);
        gvcf.setAdapter(adapter);
        gvcf.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(thucuong.this.getActivity());
                dialog.setContentView(R.layout.dialog);
                dialog.show();
            }
        });
        return root;
    }
    private void anhxa(){
        arrcf = new ArrayList<>();
        arrcf.add(new caphe(R.drawable.coffeehousecoffee,"Bạc xỉu","69.000 đ"));
        arrcf.add(new caphe(R.drawable.coffeehousecoffee,"cà phê sữa đá","69.000 đ"));
        arrcf.add(new caphe(R.drawable.coffeehousecoffee,"Cold Brew Truyền Thống","69.000 đ"));
        arrcf.add(new caphe(R.drawable.coffeehousecoffee,"Cold Brew sữa tươi","69.000 đ"));
        arrcf.add(new caphe(R.drawable.coffeehousecoffee,"Americano đá","69.000 đ"));
        arrcf.add(new caphe(R.drawable.coffeehousecoffee,"Cappucino nóng","69.000 đ"));
    }
}