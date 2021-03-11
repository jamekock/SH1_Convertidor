package com.sh1.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rdBtnDolar;
    RadioButton rdBtnDolarH;
    RadioButton rdBtnYen;
    RadioButton rdBtnEuro;
    RadioButton rdBtnFranco;
    RadioButton rdBtnLibra;
    EditText txtCantidad;
    EditText txtResult;
    double cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdBtnDolar = findViewById(R.id.rdBtnDolar);
        rdBtnDolarH = findViewById(R.id.rdBtnDolarH);
        rdBtnEuro = findViewById(R.id.rdBtnEuro);
        rdBtnYen = findViewById(R.id.rdBtnYen);
        rdBtnFranco = findViewById(R.id.rdBtnFranco);
        rdBtnLibra = findViewById(R.id.rdBtnLibra);
        txtCantidad = findViewById(R.id.txtCantidad);
        txtResult = findViewById(R.id.txtResultado);
    }


    public void Convertir(View v){
        if(txtCantidad.getText().toString().isEmpty()){return;}

        if(rdBtnDolar.isChecked()){
            cantidad = Double.parseDouble(txtCantidad.getText().toString())*57.58;
            txtResult.setText(String.valueOf(cantidad));
        }
        else if(rdBtnEuro.isChecked()){
            cantidad = (Double.parseDouble(txtCantidad.getText().toString()))*68.61;
            txtResult.setText(String.valueOf(cantidad));
        }
        else if(rdBtnLibra.isChecked()){
            cantidad = (Double.parseDouble(txtCantidad.getText().toString()))*80.22;
            txtResult.setText(String.valueOf(cantidad));
        }
        else if(rdBtnFranco.isChecked()){
            cantidad = (Double.parseDouble(txtCantidad.getText().toString()))*62.02;
            txtResult.setText(String.valueOf(cantidad));
        }
        else if(rdBtnYen.isChecked()){
            cantidad = (Double.parseDouble(txtCantidad.getText().toString()))*0.53;
            txtResult.setText(String.valueOf(cantidad));
        }
        else if(rdBtnDolarH.isChecked()){
            cantidad = (Double.parseDouble(txtCantidad.getText().toString()))*7.42;
            txtResult.setText(String.valueOf(cantidad));
        }
    }



}