package com.example.cuoikythandroid;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cuoikythandroid.R;

import java.util.ArrayList;


public class PhoBienFragment extends Fragment {
    private GridView gridView;
    Context context;
    private ConstraintLayout rela;
    private ArrayList<PhoBienModel> phobienData;
    private PhoBienAdapter phobienAdapter;
    private PhoBienModel phobien;


    public PhoBienFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context=getActivity();
        View root =inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gridView = root.findViewById(R.id.gridview_425);
//        rela = root.findViewById(R.id.rela);
        phobienData = new ArrayList<>();
        muahang();
        listphobien();
        phobienAdapter=new PhoBienAdapter(context,phobienData);
        gridView.setAdapter(phobienAdapter);
        registerForContextMenu(gridView);



        return root;
    }

    private void listphobien(){

        phobien=new PhoBienModel();
        phobien.setId_425(1);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Cà phê Lúa Mạch đá xay");
        phobien.setGia_425("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(2);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Cà phê Lúa Mạch nóng");
        phobien.setGia_425("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(3);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Sôcôla Lúa Mạch đá xay");
        phobien.setGia_425("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(4);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Sôcôla Lúa Mạch nóng");
        phobien.setGia_425("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(5);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Sôcôla Lúa Mạch nóng");
        phobien.setGia_425("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(6);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Sôcôla Lúa Mạch nóng");
        phobien.setGia_425("69.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(7);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Trà sữa Mắc Ca Trân Châu Trắng");
        phobien.setGia_425("45.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(8);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Trà đào cam sả và mật ong");
        phobien.setGia_425("45.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(9);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Oolong Hạt Sen - Đá đặc biệt");
        phobien.setGia_425("45.000 đ");
        phobienData.add(phobien);

        phobien=new PhoBienModel();
        phobien.setId_425(10);
        phobien.setSanpham_425(R.drawable.coffeehousecoffee);
        phobien.setTensanpham_425("Trà Oolong Phúc Bồn Tử");
        phobien.setGia_425("45.000 đ");
        phobienData.add(phobien);
    }
    private void muahang() {
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(PhoBienFragment.this.getActivity());
                dialog.setContentView(R.layout.dialog);
                dialog.show();
            }
        });

    }
}
