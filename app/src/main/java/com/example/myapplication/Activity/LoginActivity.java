package com.example.myapplication.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button Txtaceptar = findViewById(R.id.txtaceptar);

        EditText txtUsuario = findViewById(R.id.txtUsuario);

        EditText txtPassword = findViewById(R.id.txtPassword);

        Txtaceptar.setOnClickListener(view -> {

            if (txtUsuario.getText().toString().isEmpty()) {

                Toast.makeText( this, "Usuario no Registrado", Toast.LENGTH_SHORT).show();

            } else if (txtPassword.getText().toString().isEmpty()) {

               Toast.makeText( this, "Debe Introducir una contraseña", Toast.LENGTH_SHORT).show();

            }else{

                Intent VentanaPrincipal = new Intent(this, MainActivity.class);

                startActivity(VentanaPrincipal);

            }

});
    }
}