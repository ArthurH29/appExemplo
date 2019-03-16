package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class Caculodenota extends AppCompatActivity {
    private TextInputEditText nome;
    private TextInputEditText m1;
    private TextInputEditText m2;
    private TextView media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculodenota);
        nome = findViewById(R.id.nome);
        m1 = findViewById(R.id.primanota);
        m2 = findViewById(R.id.segnota);
        media = findViewById(R.id.resutado);
    }
    public void Media(View v){
        double M1 = Double.parseDouble(m1.getText().toString());
        double M2 = Double.parseDouble(m2.getText().toString());
        double calculo = (M1 + M2)/2;
        if(calculo >= 7 ){
            String texto ="Nome do aluno: "+ nome.getText().toString()+ ", " + "Nota: " + calculo + ", " +"APROVADO" ;
            media.setText(texto);
        }else{
            String texto ="Nome do aluno: "+ nome.getText().toString() + ", " + "Nota: " + calculo + ", " + "REPROVADO" ;
            media.setText(texto);
        }

    }
}
