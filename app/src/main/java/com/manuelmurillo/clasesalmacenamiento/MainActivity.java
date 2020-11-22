package com.manuelmurillo.clasesalmacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText etnombre;
    EditText etnacimiento;
    TextView tvactual;
    TextView tvedad;

    persona persona1;
    persona persona2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnombre = (EditText)findViewById(R.id.editTextNombre);
        etnacimiento = (EditText)findViewById(R.id.editTextNacimiento);
        tvactual = (TextView)findViewById(R.id.textViewActual);
        tvedad = (TextView)findViewById(R.id.textViewEdad);

        // usamos constructor con datos
        //persona1 = new persona("Pedro", 1980);
        persona1 = new persona();

        // usamos constructor vacio
        persona2 = new persona();

    }

    public void cambiarpersona(View view) {
        Log.i("etiqueta", "Funcion cambiar persona");
        Log.i("etiqueta","Nombre: "+persona1.getNombre()+", nacimiento: "+persona1.getNacimiento());
        Log.i("etiqueta", "Nombre: "+persona2.getNombre()+", nacimiento: "+persona2.getNacimiento());

        tvactual.setText("Persona actual 1: nombre: "+ persona1.getNombre());
        tvedad.setText("Nacimiento: "+persona1.getNacimiento()+", edad:"+persona1.calcularedad(calendario()));
        etnacimiento.setText("");
        etnombre.setText("");
    }

    public void guardarpersona(View view) {
        persona1.setNombre(etnombre.getText().toString());
        persona1.setNacimiento(Integer.parseInt(etnacimiento.getText().toString()));
        etnacimiento.setText("");
        etnombre.setText("");
    }

    public void cambiarpersona2(View view) {
        tvactual.setText("Persona actual 2: nombre: "+ persona2.getNombre());
        tvedad.setText("Nacimiento: "+persona2.getNacimiento()+", edad:"+persona2.calcularedad(calendario()));
        etnacimiento.setText("");
        etnombre.setText("");
    }

    public void guardarpersona2(View view) {
        persona2.setNombre(etnombre.getText().toString());
        persona2.setNacimiento(Integer.parseInt(etnacimiento.getText().toString()));
        etnacimiento.setText("");
        etnombre.setText("");
    }

    public int calendario(){
        Calendar cal;
        int year;
        year = 0;
        cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        return year;
    }

}
