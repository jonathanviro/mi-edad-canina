package com.javr.mi_edad_canina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtEdad = findViewById(R.id.edtEdad);
        TextView txtResultado = findViewById(R.id.txtResultado);
        Button btnCalcular = findViewById(R.id.btnCalcular);

        Log.d("MainActivity", "Activity created");

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strEdad = edtEdad.getText().toString();

                if(!strEdad.isEmpty()){
                    Integer intEdad = Integer.parseInt(strEdad);
                    Integer intResultado = intEdad * 7;

                    String strResultado = getString(R.string.result_format, intResultado);
                    txtResultado.setText(strResultado);
                }else {
                    Log.e("MainActivity", "Debes ingresar tu edad");
                    Toast.makeText(MainActivity.this, getString(R.string.age_into), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}