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
 * Use the {@link doan#newInstance} factory method to
 * create an instance of this fragment.
 */
public class doan extends Fragment {
    Context context;
    GridView gvda;
    ArrayList<sanphamdoan> arrda;
    doanadapter adapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public doan() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment doan.
     */
    // TODO: Rename and change types and number of parameters
    public static doan newInstance(String param1, String param2) {
        doan fragment = new doan();
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
        View root= inflater.inflate(R.layout.doan_layout, container, false);
        gvda = (GridView) root.findViewById(R.id.griddoan425);
        anhxa();
        adapter = new doanadapter(context,R.layout.itemsanpham,arrda);
        gvda.setAdapter(adapter);
        gvda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(doan.this.getActivity());
                dialog.setContentView(R.layout.dialog);
                dialog.show();
            }
        });
        return root;
    }
    private void anhxa(){

        arrda = new ArrayList<>();
        arrda.add(new sanphamdoan(R.drawable.banhngotcoffeehouse,"banh ngot","30.000 đ"));
        arrda.add(new sanphamdoan(R.drawable.doan2,"Mít sấy","20.000 đ"));
        arrda.add(new sanphamdoan(R.drawable.doan3,"Cơm cháy chà bông","20.000 đ"));
    }
}