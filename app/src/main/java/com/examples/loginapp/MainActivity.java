package com.examples.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnCancel = findViewById(R.id.btnCancel);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                if (username.equals("usuario") && password.equals("contraseña")) {
                    Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else if (username.equals("admin") && password.equals("1234")) {
                    Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else if (username.equals("eve") && password.equals("123")) {
                    Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else if (username.equals("maria") && password.equals("12345m")) {
                    Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else if (username.equals("pablo") && password.equals("12345")) {
                    Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(MainActivity.this, ErrorActivity.class);
                    startActivity(intent);
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Borra el contenido de los campos de texto de usuario y contraseña
                etUsername.setText("");
                etPassword.setText("");
            }
        });
    }
}
