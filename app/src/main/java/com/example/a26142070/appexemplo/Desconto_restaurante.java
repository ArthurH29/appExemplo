package com.example.a26142070.appexemplo;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Desconto_restaurante extends AppCompatActivity {

     private TextInputEditText name;
     private TextInputEditText velou;
     private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto_restaurante);

        name = findViewById(R.id.nome);
        velou = findViewById(R.id.conta);
        resultado = findViewById(R.id.ap);
    }
     public void temDesconto(View v){
      String nome = name.getText().toString();
      double conta = Double.parseDouble(velou.getText().toString());
      String n = String.valueOf(nome.charAt(0));
      if(n.equalsIgnoreCase("a") || n.equalsIgnoreCase("e") || n.equalsIgnoreCase("i")
       || n.equalsIgnoreCase("o") || n.equalsIgnoreCase("u")){
          Double calculo =  (conta * 0.3);
          String texto = "O valor da conta com 30% de desconto é:  "+calculo + "reais";
          resultado.setText(texto);
      }
      else {
          String texto = "Que pena! Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará.";
          resultado.setText(texto);
      }
    }
}
