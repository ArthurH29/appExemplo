package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class ligacaocelular extends AppCompatActivity {
     private Spinner operadoras;
     private TextInputEditText tempo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligacaocelular);

        tempo = findViewById(R.id.min);
        operadoras = findViewById(R.id.opera);
    }
    public void tempoLigacao(View v){

        String Opc = operadoras.getSelectedItem().toString();

        if(Opc == OP1){

        }
    }
}
