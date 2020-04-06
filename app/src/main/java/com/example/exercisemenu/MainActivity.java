package com.example.exercisemenu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button Signin;
    EditText Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Signin = findViewById(R.id.btn1);
        Username = findViewById(R.id.Editusername);
        Password = findViewById(R.id.Editpass);

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("") && Password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Data Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Username.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Username Harus Diisi", Toast.LENGTH_SHORT).show();
                }
                else if(Password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Password Harus Diisi", Toast.LENGTH_SHORT).show();
                }else {
                    if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("123")) {
                        Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
                         Intent intent = new Intent(MainActivity.this, MenuHitung.class);
                        MainActivity.this.startActivity(intent);
                        finish();
                    }else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Username atau Password anda salah!!")
                                .setNegativeButton("Retry", null).create().show();
                    }
                }
            }
        });
    }
}
