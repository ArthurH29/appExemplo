package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class PesoRelativo extends AppCompatActivity {
    private Spinner planetas;
    private TextInputEditText peso;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_relativo);
        planetas = findViewById(R.id.planetas);
        peso = findViewById(R.id.peso);
        resultado = findViewById(R.id.resposta);
    }

    public void pesoPlanetario(View v){
        String Opc = planetas.getSelectedItem().toString();
        double pes = Double.parseDouble(peso.getText().toString());
        if(Opc.equals("Mercúrio")){
            Double pesoplaneta = (pes/10)*0.37;
            String texto = "Seu peso em Mercúrio é: " + pesoplaneta + " kg";
            resultado.setText(texto);
        }
        if(Opc.equals("Vênus")){
            Double pesoplaneta = (pes/10)*0.88;
            String texto = "Seu peso em Vênus é: " + pesoplaneta + " kg";
            resultado.setText(texto);
        }
        if(Opc.equals("Marte")){
            Double pesoplaneta = (pes/10)*0.38;
            String texto = "Seu peso em Marte é: " + pesoplaneta + " kg";
            resultado.setText(texto);
        }
        if(Opc.equals("Júpiter")){
            Double pesoplaneta = (pes/10)*2.64;
            String texto = "Seu peso em Júpiter é: " + pesoplaneta + " kg";
            resultado.setText(texto);
        }
        if(Opc.equals("Saturno")){
            Double pesoplaneta = (pes/10)*1.15;
            String texto = "Seu peso em Saturno é: " + pesoplaneta + " kg";
            resultado.setText(texto);
        }
        if(Opc.equals("Urano")){
            Double pesoplaneta = (pes/10)*1.17;
            String texto = "Seu peso em Urano é: " + pesoplaneta + " kg";
            resultado.setText(texto);
        }
    }
}
