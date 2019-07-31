package com.example.cx62.rpk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class History extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<AbsenModel> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        dataSet = new ArrayList<>();

        Call<ResponBody> callAbsen = RetrofitClient.getInstance().getAPI().getAllAbsen(HasilLogin.ID_Karyawan);
        callAbsen.enqueue(new Callback<ResponBody>() {
            @Override
            public void onResponse(Call<ResponBody> call, Response<ResponBody> response) {
                ResponBody respon = response.body();

                dataSet = respon.getList();
                rvView = (RecyclerView) findViewById(R.id.rv_main);
                rvView.setHasFixedSize(true);

                /**
                 * Kita menggunakan LinearLayoutManager untuk list standar
                 * yang hanya berisi daftar item
                 * disusun dari atas ke bawah
                 */
                layoutManager = new LinearLayoutManager(History.this);
                rvView.setLayoutManager(layoutManager);

                adapter = new RecyclerViewAdapter(dataSet);
                rvView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<ResponBody> call, Throwable t) {
                Toast.makeText(History.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });



    }

}


