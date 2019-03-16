package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class XemY extends AppCompatActivity {
     private TextInputEditText x;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_y);
        x = findViewById(R.id.xes);
        resultado = findViewById(R.id.y);
    }
    public void Calculo(View v){
        double variavel= Double.parseDouble(x.getText().toString());
        double y = 8/(2 - variavel);
        String texto = "O valor de Y é: " + y;
        resultado.setText(texto);
    }
}
