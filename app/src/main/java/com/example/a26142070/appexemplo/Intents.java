package com.example.a26142070.appexemplo;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Intents extends AppCompatActivity {
     private TextInputEditText tipo_carro;
     private TextInputEditText distancia;
     private TextInputEditText motor;
     private TextInputEditText gasolina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);

        tipo_carro = findViewById(R.id.id1);
        distancia = findViewById(R.id.id2);
        motor = findViewById(R.id.id3);
        gasolina = findViewById(R.id.id4);
    }
    public void caculoGasolina(View v) {
        Double km = Double.parseDouble(distancia.getText().toString());
        float mot = Float.parseFloat(motor.getText().toString());
        Double gas = Double.parseDouble(gasolina.getText().toString());
        String carro = tipo_carro.getText().toString();
        if (mot <= 1.0) {
            double calculo = (km / 13.00) * gas;
            Intent encaminhar = new Intent(getApplicationContext(), intent2.class);
            encaminhar.putExtra("modelo", carro);
            encaminhar.putExtra("motor", mot);
            encaminhar.putExtra("resultado", calculo);
            encaminhar.putExtra("distancia", km);
            encaminhar.putExtra("gasolina", gas);
            startActivity(encaminhar);
        }
        if (1.0 < mot && mot <= 1.4) {
            double calculo = (km / 11.00) * gas;
            Intent encaminhar = new Intent(getApplicationContext(), intent2.class);
            encaminhar.putExtra("modelo", carro);
            encaminhar.putExtra("motor", mot);
            encaminhar.putExtra("resultado", calculo);
            encaminhar.putExtra("distancia", km);
            encaminhar.putExtra("gasolina", gas);
            startActivity(encaminhar);
        }
        if (1.4 < mot && mot <= 1.9) {
            double calculo = (km / 9.50) * gas;
            Intent encaminhar = new Intent(getApplicationContext(), intent2.class);
            encaminhar.putExtra("modelo", carro);
            encaminhar.putExtra("motor", mot);
            encaminhar.putExtra("resultado", calculo);
            encaminhar.putExtra("distancia", km);
            encaminhar.putExtra("gasolina", gas);
            startActivity(encaminhar);
        }
        if (1.9 < mot) {
            double calculo = (km / 7.75) * gas;
            Intent encaminhar = new Intent(getApplicationContext(), intent2.class);
            encaminhar.putExtra("modelo", carro);
            encaminhar.putExtra("motor", mot);
            encaminhar.putExtra("resultado", calculo);
            encaminhar.putExtra("distancia", km);
            encaminhar.putExtra("gasolina", gas);
            startActivity(encaminhar);
        }
    }

}
