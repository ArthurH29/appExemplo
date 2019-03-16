package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PesoIdeal extends AppCompatActivity {
    private TextInputEditText altura;
    private TextView resultado;
    private RadioGroup refe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_ideal);
        altura = findViewById(R.id.altu);
        refe = findViewById(R.id.referencia);
        resultado = findViewById(R.id.result);
    }
     public void calcularPeso(View v){
        double pesoideal;
        String alt = altura.getText().toString();
        int sexo = refe.getCheckedRadioButtonId();

        if(sexo == R.id.homen){
           pesoideal = (72.7 * Double.parseDouble(alt)) - 58;
        }
        else {
          pesoideal = (62.1* Double.parseDouble(alt)) - 44.7;
        }

         String texto = "Seu peso ideal é: " + pesoideal;
         resultado.setText(texto);
     }
}
