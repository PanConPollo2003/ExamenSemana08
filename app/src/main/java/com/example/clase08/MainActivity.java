package com.example.clase08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtmail, txtpass;
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtmail = findViewById(R.id.edtcorreo);
        txtpass = findViewById(R.id.edtPassword);
        btn1 = findViewById(R.id.btnIngresar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = "ADMIN";
                String password = "1234";
                String log = txtmail.getText().toString();
                String pass= txtpass.getText().toString();



                if(log.equals("")){
                    Toast.makeText(getApplicationContext(),"campos vacios.."+pass, Toast.LENGTH_LONG).show();

                }else{
                    if(log.equals(login)){
                        Bundle enviadato = new Bundle();
                        enviadato.putString("keydatos",txtmail.getText().toString());

                        Intent intent1 = new Intent(getApplication(), MenuActivity1.class);
                        startActivity(intent1);


                    }
                }




            }
        });



    }






}