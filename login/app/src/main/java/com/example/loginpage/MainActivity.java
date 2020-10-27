package com.example.loginpage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText username, password;
    public Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = username.getText().toString();
                String Password = password.getText().toString();

                if (Username.equals("khafid") && Password.equals("1234")) {
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, profil.class);
                    MainActivity.this.startActivity(intent);
                    finish();

                } else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username Dan Password Salah !!").setNegativeButton("Coba Lagi", null).create().show();

                }
            }
        });
    }
}