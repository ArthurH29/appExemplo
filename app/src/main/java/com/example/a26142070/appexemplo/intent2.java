package com.example.a26142070.appexemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class intent2 extends AppCompatActivity {
     Bundle dados;
     TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
      dados = getIntent().getExtras();
      double res = dados.getDouble("resultado");
      String modelo = dados.getString("modelo");
      float motor = dados.getFloat("motor");
      double km = dados.getDouble("distancia");
      double gas = dados.getDouble("gasolina");
      resultado = findViewById(R.id.rest);
        String texto = modelo + motor + "gasta R$ " + res +" para precorrer " + km +" com gasolina a R$ "+ gas+" por litro";
        resultado.setText(texto);
    }

}
