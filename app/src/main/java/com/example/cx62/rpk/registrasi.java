package com.example.cx62.rpk;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class registrasi extends AppCompatActivity {

    EditText masuknik, masuknama, masukpassword, masukrepassword;
    Button submitreg;
    String Device_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        masuknik = findViewById(R.id.masuknik);
        masuknama = findViewById(R.id.masuknama);
        masukpassword = findViewById(R.id.masukpassword);
        masukrepassword = findViewById(R.id.masukrepassword);
        Device_ID = getIntent().getStringExtra("Device_ID");

        submitreg = findViewById(R.id.submitreg);

        submitreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitreg.setBackgroundColor(Color.rgb(54, 53, 59));
                submitreg.setEnabled(false);

                    String NIK = masuknik.getText().toString();
                    String Nama = masuknama.getText().toString();
                    String Password = masukpassword.getText().toString();
                    String Repass = masukrepassword.getText().toString();

                    if (Password.equals(Repass)){
                        Call<ResponBodyRegister> callRegister = RetrofitClient.getInstance().getAPI().register(Nama, NIK, Device_ID, Password);
                        callRegister.enqueue(new Callback<ResponBodyRegister>() {
                            @Override
                            public void onResponse(Call<ResponBodyRegister> call, Response<ResponBodyRegister> response) {
                                if (response.code() == 200){
                                    Toast.makeText(registrasi.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                                }else{
                                    Toast.makeText(registrasi.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                                submitreg.setEnabled(true);
                                submitreg.setBackgroundColor(Color.rgb(214, 118, 1));

                            }

                            @Override
                            public void onFailure(Call<ResponBodyRegister> call, Throwable t) {
                                Toast.makeText(registrasi.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                                submitreg.setEnabled(true);
                                submitreg.setBackgroundColor(Color.rgb(214, 118, 1));
                            }
                        });
                    }else{
                        Toast.makeText(registrasi.this, "Password Tidak Cocok", Toast.LENGTH_SHORT).show();
                        submitreg.setEnabled(true);
                        submitreg.setBackgroundColor(Color.rgb(214, 118, 1));
                    }



                }
        });

    }
}
