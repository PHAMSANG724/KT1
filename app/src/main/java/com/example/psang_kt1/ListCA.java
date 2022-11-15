package com.example.psang_kt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListCA extends AppCompatActivity {

    ListView lvCA;
    ArrayList<CongAn> arrayCA;
    CongAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ca);

        AnhXa();
        adapter = new CongAnAdapter(this, R.layout.list_item_congan, arrayCA);
        lvCA.setAdapter(adapter);
    }

    private void AnhXa() {
        lvCA = findViewById(R.id.listviewCongAn);
        arrayCA = new ArrayList<>();

        arrayCA.add(new CongAn("Nguyen A", "Trung sĩ", R.drawable.cong_an, "Đà Nẵng", "Việt Nam", 2));
        arrayCA.add(new CongAn("Nguyen B", "Trung sĩ", R.drawable.cong_an, "Đà Nẵng", "Việt Nam", 4));
        arrayCA.add(new CongAn("Nguyen C", "Trung sĩ", R.drawable.cong_an, "Đà Nẵng", "Việt Nam", 2));
        arrayCA.add(new CongAn("Nguyen D", "Trung sĩ", R.drawable.cong_an, "Đà Nẵng", "Việt Nam", 3));

    }
}