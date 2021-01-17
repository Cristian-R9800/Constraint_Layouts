package com.upc.lab_const_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class SendCovidInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.covid_form_excercise);
    }
    public void onSendMessage(View view){
        String lista_condiciones = "";

        Switch condicion1  = (Switch) findViewById(R.id.switch2);
        Switch condicion2  = (Switch) findViewById(R.id.switch3);
        Switch condicion3  = (Switch) findViewById(R.id.switch4);
        Switch condicion4  = (Switch) findViewById(R.id.switch5);
        Switch condicion5  = (Switch) findViewById(R.id.switch6);

        lista_condiciones += condicion1.getText().toString() + " " + (condicion1.isChecked()?"SI":"NO") + "\n";
        lista_condiciones += condicion2.getText().toString() + " " + (condicion2.isChecked()?"SI":"NO") + "\n";
        lista_condiciones += condicion3.getText().toString() + " " + (condicion3.isChecked()?"SI":"NO") + "\n";
        lista_condiciones += condicion4.getText().toString() + " " + (condicion4.isChecked()?"SI":"NO") + "\n";
        lista_condiciones += condicion5.getText().toString() + " " + (condicion5.isChecked()?"SI":"NO") + "\n";


        Intent intentToSend = new Intent(Intent.ACTION_SEND);
        intentToSend.setType("text/plain");
        intentToSend.putExtra(Intent.EXTRA_TEXT, lista_condiciones);
        startActivity(intentToSend);
    }


}