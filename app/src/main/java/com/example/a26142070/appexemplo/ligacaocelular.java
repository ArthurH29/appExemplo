package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class ligacaocelular extends AppCompatActivity {
     private Spinner operadoras;
     private TextInputEditText tempo;
     private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligacaocelular);

        tempo = findViewById(R.id.min);
        operadoras = findViewById(R.id.opera);
        resultado = findViewById(R.id.result);
    }
    public void tempoLigacao(View v){

        String Opc = operadoras.getSelectedItem().toString();
        double min = Double.parseDouble(tempo.getText().toString());
        if(Opc.equals("OP1")){
            Double caculo = min  * 1.2;
            String texto = "O valor em minutos da ligação será é: " + caculo + " Reais";
            resultado.setText(texto);
        }
        if(Opc.equals("OP2")) {
            Double caculo = min * 1.5;
            String texto = "O valor em minutos da ligação será: " + caculo + " Reais";
            resultado.setText(texto);
        }
        if(Opc.equals("OP3")) {
            Double caculo = min * 1.14;
            String texto = "O valor em minutos da ligação será: " + caculo + " Reais";
            resultado.setText(texto);
        }
    }
}
