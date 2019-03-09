package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Cubo extends AppCompatActivity {
    private TextInputEditText raio;
    private TextInputEditText altura;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        raio = findViewById(R.id.inpRaio);
        altura = findViewById(R.id.inpAlt);
        resultado = findViewById(R.id.txtResult);
    }
    public void calculoVolume(View v){
        double valorRaio = Double.parseDouble(raio.getText().toString());
        double valorAltura = Double.parseDouble((altura.getText().toString()));
        double res = 3.141559 * (valorRaio* valorRaio) * valorAltura;
        String texto = "O volume é: " + res;
        resultado.setText(texto);
    }
}
