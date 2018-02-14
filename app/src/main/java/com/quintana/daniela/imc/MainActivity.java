package com.quintana.daniela.imc;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIMC () {
        TextInputEditText estatura = (TextInputEditText) findViewById(R.id.estatura);
        TextInputEditText peso = (TextInputEditText) findViewById(R.id.peso);
        TextView view = findViewById(R.id.result);

        float mc = Float.parseFloat(peso.getText().toString()) / (Float.parseFloat(estatura.getText().toString()) * Float.parseFloat(estatura.getText().toString()));
        view.setText(""+mc);
    }
}
