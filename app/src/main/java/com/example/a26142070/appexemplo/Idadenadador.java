package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Idadenadador extends AppCompatActivity {
    private TextInputEditText idade;
    private TextView categoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idadenadador);
        idade = findViewById(R.id.Idade);
        categoria = findViewById(R.id.categoria);
    }
     public void avaliarCandidato(View v){
        double id = Double.parseDouble(idade.getText().toString());
        if(5>= id && id <= 7){
           String texto = "Infantil A";
           categoria.setText(texto);
        }
         if(8>= id && id <= 10){
             String texto = "Infantil B";
             categoria.setText(texto);
         }
         if(11>= id && id <= 13){
             String texto = "Juvenil A";
             categoria.setText(texto);
         }
         if(14>= id && id <= 17){
             String texto = "Juvenil B";
             categoria.setText(texto);
         }
         if(id > 18){
             String texto = "Sênior";
             categoria.setText(texto);
         }
         if( id< 6){
             String texto = "Idade invalida";
             categoria.setText(texto);
         }
     }
}
